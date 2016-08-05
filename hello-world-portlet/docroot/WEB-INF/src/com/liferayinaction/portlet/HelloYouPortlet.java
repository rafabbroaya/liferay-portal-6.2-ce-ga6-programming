package com.liferayinaction.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HelloYouPortlet extends GenericPortlet {

	private static Log LOG = LogFactory.getLog(HelloYouPortlet.class);

	protected String viewJSP;
	protected String editJSP;

	@Override
	public void init() throws PortletException {
		viewJSP = getInitParameter("view-jsp");
		editJSP = getInitParameter("edit-jsp");
	}

	@Override
	protected void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws PortletException, IOException {
		PortletPreferences prefs = renderRequest.getPreferences();
		String userName = prefs.getValue("name", "");
		renderRequest.setAttribute("userName", userName);
		include(viewJSP, renderRequest, renderResponse);
	}

	@Override
	protected void doEdit(RenderRequest renderRequest, RenderResponse renderResponse)
			throws PortletException, IOException {
		PortletURL addNameURL = renderResponse.createActionURL();
		addNameURL.setParameter("addName", "addName");
		renderRequest.setAttribute("addNameURL", addNameURL.toString());
		include(editJSP, renderRequest, renderResponse);
	}

	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws PortletException, IOException {
		String addName = actionRequest.getParameter("addName");
		if (addName != null) {
			PortletPreferences prefs = actionRequest.getPreferences();
			prefs.setValue("name", actionRequest.getParameter("username"));
			prefs.store();
			actionResponse.setPortletMode(PortletMode.VIEW);
		}
	}

	protected void include(String path, RenderRequest renderRequest, RenderResponse renderResponse)
			throws PortletException, IOException {
		PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher(path);
		if (dispatcher == null) {
			LOG.error(path + " is not a valid include");
		} else {
			dispatcher.include(renderRequest, renderResponse);
		}
	}
}
