/*
 * Copyright 2011 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.ui.client.theme.base;

import com.googlecode.mgwt.ui.client.widget.tabbar.TabBarButton;
import com.googlecode.mgwt.ui.client.widget.tabbar.TabPanel.TabBar;

/**
 * The css interface for tab bar button
 * 
 * For css classes explanation see {@link TabBarButton} and {@link TabBar}
 * 
 * @author Daniel Kurka
 * 
 */
public interface TabBarCss extends ButtonBaseCss {

	@ClassName("mgwt-TabPanel")
	public String tabPanel();

	@ClassName("mgwt-TabPanel-container")
	public String tabPanelContainer();

	@ClassName("mgwt-TabBar")
	public String tabbar();

	@ClassName("mgwt-TabBar-Button")
	public String button();

	@ClassName("mgwt-TabBar-Button-selected")
	public String selected();

	@Override
  @ClassName("mgwt-TabBar-Button-active")
	public String active();

	@ClassName("mgwt-TabBar-Button-icon")
	public String icon();

	@ClassName("mgwt-TabBar-Button-text")
	public String text();

}
