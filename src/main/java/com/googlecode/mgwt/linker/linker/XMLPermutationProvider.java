package com.googlecode.mgwt.linker.linker;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.googlecode.mgwt.linker.server.BindingProperty;

public class XMLPermutationProvider {
	private static final String PERMUTATION_NAME = "name";
	private static final String PERMUTATIONS = "permutations";

	protected static final Logger logger = Logger.getLogger(XMLPermutationProvider.class.getName());

	public Map<String, List<BindingProperty>> getBindingProperties(InputStream stream) throws XMLPermutationProviderException {

		try {

			Map<String, List<BindingProperty>> map = new HashMap<String, List<BindingProperty>>();

			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = builder.parse(stream);

			Element permutationsNode = document.getDocumentElement();

			String tagName = permutationsNode.getTagName();
			if (!PERMUTATIONS.equals(tagName)) {
				logger.severe("unexpected xml structure: Expected node : '" + PERMUTATIONS + "' got: '" + tagName + "'");
				throw new XMLPermutationProviderException();
			}

			NodeList permutationsChildren = permutationsNode.getChildNodes();

			for (int i = 0; i < permutationsChildren.getLength(); i++) {
				Node node = permutationsChildren.item(i);

				if (node.getNodeType() != Node.ELEMENT_NODE) {
					continue;
				}
				Element permutationNode = (Element) node;
				handlePermutation(map, permutationNode);
			}

			return map;

		} catch (SAXException e) {
			logger.log(Level.SEVERE, "Error while Parsing xml", e);
			throw new XMLPermutationProviderException(e);
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error while Parsing xml", e);
			throw new XMLPermutationProviderException(e);
		} catch (ParserConfigurationException e) {
			logger.log(Level.SEVERE, "Error while Parsing xml", e);
			throw new XMLPermutationProviderException(e);
		}

	}

	protected void handlePermutation(Map<String, List<BindingProperty>> map, Element permutationNode) throws XMLPermutationProviderException {

		String strongName = permutationNode.getAttribute(PERMUTATION_NAME);

		ArrayList<BindingProperty> list = new ArrayList<BindingProperty>();
		map.put(strongName, list);

		NodeList variableNodes = permutationNode.getChildNodes();
		for (int i = 0; i < variableNodes.getLength(); i++) {
			Node item = variableNodes.item(i);
			if (item.getNodeType() != Node.ELEMENT_NODE)
				continue;
			Element variables = (Element) item;
			String varKey = variables.getTagName();
			NodeList childNodes = variables.getChildNodes();
			if (childNodes.getLength() != 1) {
				logger.severe("Unexpected XML Structure: Expected property value");
				throw new XMLPermutationProviderException();
			}

			String varValue = childNodes.item(0).getNodeValue();
			BindingProperty bindingProperty = new BindingProperty(varKey, varValue);
			list.add(bindingProperty);
		}
	}

	public String serializeMap(Map<String, List<BindingProperty>> map) {
		try {
			StringWriter xml = new StringWriter();

			Document document;

			document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

			Element permutationsNode = document.createElement(PERMUTATIONS);
			document.appendChild(permutationsNode);

			for (Entry<String, List<BindingProperty>> entry : map.entrySet()) {
				Element node = document.createElement("permutation");
				node.setAttribute(PERMUTATION_NAME, entry.getKey());
				permutationsNode.appendChild(node);

				for (BindingProperty b : entry.getValue()) {
					Element variable = document.createElement(b.getName());
					variable.appendChild(document.createTextNode(b.getValue()));
					node.appendChild(variable);

				}

			}

			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(new DOMSource(document), new StreamResult(xml));

			String permMapString = xml.toString();
			return permMapString;

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//TODO 
		throw new RuntimeException();
	}

}
