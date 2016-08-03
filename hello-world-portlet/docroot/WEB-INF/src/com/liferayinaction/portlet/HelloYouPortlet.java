package com.liferayinaction.portlet;

import java.io.IOException;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class HelloYouPortlet extends GenericPortlet {

	//private stat
	
	protected String viewJSP;
	protected String editJSP;

	@Override
	public void init() throws PortletException {
		viewJSP = getInitParameter("view-jsp");
		editJSP = getInitParameter("edit-jsp");
	}

	@Override
	protected void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		PortletPreferences prefs = request.getPreferences();
		String userName = prefs.getValue("name", "");
		request.setAttribute("username", userName);
		include(viewJSP, request, response);
	}

	@Override
	protected void doEdit(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		// TODO Auto-generated method stub
		super.doEdit(request, response);
	}

	protected void include(String path, RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher(path);
		if (dispatcher == null) {

		} else {
			dispatcher.include(request, response);
		}
	}
}
