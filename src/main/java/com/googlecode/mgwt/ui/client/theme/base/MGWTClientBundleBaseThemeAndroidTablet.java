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

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.TextResource;
import com.googlecode.mgwt.ui.client.theme.MGWTClientBundle;

/**
 * The android tablet client bundle
 * 
 * @author Daniel Kurka
 * 
 */
public interface MGWTClientBundleBaseThemeAndroidTablet extends ClientBundle, MGWTClientBundle {

	@Override
  @Source({ "css/groupinglist.css", "css/android/groupinglist.css" })
	GroupingList getGroupingList();

	@Override
  @Source({ "css/progressbar.css", "css/android/progressbar.css" })
	ProgressBarCss getProgressBarCss();

	// This is a very nasty workaround because GWT CssResource does not support
	// @media correctly!
	@Override
  @Source("css/util_fake.css")
	UtilCss getUtilCss();

	// This is a very nasty workaround because GWT CssResource does not support
	// @media correctly!
	@Override
  @Source("css/util.css")
	TextResource utilTextResource();

	@Override
  @Source({ "css/progressindicator.css", "css/android/progressindicator.css" })
	ProgressIndicatorCss getProgressIndicatorCss();

	@Override
  @Source({ "css/header.css", "css/android/header.css" })
	HeaderCss getHeaderCss();

	@Override
  @Source({ "css/slider.css", "css/android/slider.css" })
	SliderCss getSliderCss();

	@Override
  @Source({ "css/carousel.css", "css/android/carousel.css" })
	CarouselCss getCarouselCss();

	@Override
  @Source({ "css/list.css", "css/android/list.css" })
	ListCss getListCss();

	@Override
  @Source("resources/list/arrow.png")
	DataResource listArrow();

	@Override
  @Source({ "css/searchbox.css", "css/android/searchbox.css" })
	MSearchBoxCss getSearchBoxCss();

	@Override
  @Source("resources/search/glass.png")
	DataResource searchSearchImage();

	@Override
  @Source("resources/search/search_clear.png")
	DataResource searchClearImage();

	@Override
  @Source("resources/search/search_clear_touched.png")
	DataResource searchClearTouchedImage();

	@Override
  @Source("css/checkbox.css")
	CheckBoxCss getCheckBoxCss();

	@Override
  @Source({ "css/buttons.css", "css/android/buttons.css" })
	ButtonCss getButtonCss();

	@Override
  @Source({ "css/scrollpanel.css", "css/android/scrollpanel.css" })
	ScrollPanelCss getScrollPanelCss();

	@Override
  @Source({ "css/buttonbar.css", "css/android/buttonbar.css" })
	ButtonBarCss getButtonBarCss();

	@Override
  @Source({ "css/dialog.css", "css/android/dialog.css" })
	DialogCss getDialogCss();

	@Override
  @Source({ "css/main.css", "css/android/main.css" })
	MainCss getMainCss();

	@Override
  @Source({ "css/input.css", "css/android/input.css" })
	InputCss getInputCss();

	@Override
  @Source("resources/input/ios_check.png")
	DataResource inputCheckImage();

	@Override
  @Source("css/panel.css")
	PanelCss getPanelCss();

	@Override
  @Source("css/layout.css")
	LayoutCss getLayoutCss();

	@Override
  @Source({ "css/pulltorefresh.css", "css/android/pulltorefresh.css" })
	PullToRefreshCss getPullToRefreshCss();

	@Override
  @Source({ "css/tabbar.css", "css/android/tabbar.css" })
	TabBarCss getTabBarCss();

	@Override
  @Source("resources/tabbar/bookmarks.png")
	ImageResource tabBarBookMarkImage();

	@Override
  @Source("resources/tabbar/contacts.png")
	ImageResource tabBarContactsImage();

	@Override
  @Source("resources/tabbar/downloads.png")
	ImageResource tabBarDownloadsImage();

	@Override
  @Source("resources/tabbar/favorites.png")
	ImageResource tabBarFavoritesImage();

	@Override
  @Source("resources/tabbar/featured.png")
	ImageResource tabBarFeaturedImage();

	@Override
  @Source("resources/tabbar/history.png")
	ImageResource tabBarHistoryImage();

	@Override
  @Source("resources/tabbar/more.png")
	ImageResource tabBarMoreImage();

	@Override
  @Source("resources/tabbar/mostrecent.png")
	ImageResource tabBarMostRecentImage();

	@Override
  @Source("resources/tabbar/mostviewed.png")
	ImageResource tabBarMostViewedImage();

	@Override
  @Source("resources/tabbar/search.png")
	ImageResource tabBarSearchImage();

	@Override
  @Source("resources/spinner.png")
	DataResource spinnerImage();

	@Override
  @Source("resources/spinner_white.png")
	DataResource spinnerWhiteImage();

	@Override
  @Source("resources/error.png")
	DataResource errorImage();

	@Override
  @Source("resources/input/check_android_checked.png")
	DataResource android_check_checked();

	@Override
  @Source("resources/input/check_android_not_checked.png")
	DataResource android_check_not_checked();

	@Override
  @Source("css/buttonbarbutton.css")
	public ButtonBarButtonCss getButtonBarButtonCss();

	@Override
  @Source("resources/toolbar/pressed.png")
	public ImageResource getButtonBarHighlightImage();

	@Override
  @Source("resources/toolbar/action.png")
	public ImageResource getButtonBarActionImage();

	@Override
  @Source("resources/toolbar/arrowdown.png")
	public ImageResource getButtonBarArrowDownImage();

	@Override
  @Source("resources/toolbar/arrowleft.png")
	public ImageResource getButtonBarArrowLeftImage();

	@Override
  @Source("resources/toolbar/arrowright.png")
	public ImageResource getButtonBarArrowRightImage();

	@Override
  @Source("resources/toolbar/arrowup.png")
	public ImageResource getButtonBarArrowUpImage();

	@Override
  @Source("resources/toolbar/bookmarks.png")
	public ImageResource getButtonBarBookmarkImage();

	@Override
  @Source("resources/toolbar/camera.png")
	public ImageResource getButtonBarCameraImage();

	@Override
  @Source("resources/toolbar/compose.png")
	public ImageResource getButtonBarComposeImage();

	@Override
  @Source("resources/toolbar/fastforward.png")
	public ImageResource getButtonBarFastForwardImage();

	@Override
  @Source("resources/toolbar/info.png")
	public ImageResource getButtonBarInfoImage();

	@Override
  @Source("resources/toolbar/locate.png")
	public ImageResource getButtonBarLocateImage();

	@Override
  @Source("resources/toolbar/minus.png")
	public ImageResource getButtonBarMinusImage();

	@Override
  @Source("resources/toolbar/new.png")
	public ImageResource getButtonBarNewImage();

	@Override
  @Source("resources/toolbar/nextslide.png")
	public ImageResource getButtonBarNextSlideImage();

	@Override
  @Source("resources/toolbar/organize.png")
	public ImageResource getButtonBarOrganizeImage();

	@Override
  @Source("resources/toolbar/pause.png")
	public ImageResource getButtonBarPauseImage();

	@Override
  @Source("resources/toolbar/play.png")
	public ImageResource getButtonBarPlayImage();

	@Override
  @Source("resources/toolbar/plus.png")
	public ImageResource getButtonBarPlusImage();

	@Override
  @Source("resources/toolbar/previousslide.png")
	public ImageResource getButtonBarPreviousSlideImage();

	@Override
  @Source("resources/toolbar/refresh.png")
	public ImageResource getButtonBarRefreshImage();

	@Override
  @Source("resources/toolbar/reply.png")
	public ImageResource getButtonBarReplyImage();

	@Override
  @Source("resources/toolbar/rewind.png")
	public ImageResource getButtonBarRewindImage();

	@Override
  @Source("resources/toolbar/search.png")
	public ImageResource getButtonBarSearchImage();

	@Override
  @Source("resources/toolbar/stop.png")
	public ImageResource getButtonBarStopImage();

	@Override
  @Source("resources/toolbar/trash.png")
	public ImageResource getButtonBarTrashImage();

}
