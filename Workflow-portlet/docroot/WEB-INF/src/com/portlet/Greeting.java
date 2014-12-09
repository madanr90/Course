package com.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.dao.LoginDao;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 * Portlet implementation class Greeting
 */
public class Greeting extends MVCPortlet {
	final Log LOG = LogFactory.getLog(Greeting.class);
	/*private String editJSP;
	private String viewJSP;
	private String renderJSP;
	public void init() {
		LOG.info("Initializing portlet ...");
        viewJSP = getInitParameter("view-template");
        editJSP = getInitParameter("edit-template");
        renderJSP = getInitParameter("render-template");
    }
	public void doView(RenderRequest renderRequest,  
			   RenderResponse renderResponse) throws IOException, PortletException {  
		LOG.info("Entering view class()");
		HttpServletRequest request = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(renderRequest));
		HttpSession session = request.getSession();
        String Status= (String) session.getAttribute("status");
        LOG.info("Status:"+Status);
        if(null== Status){
        	PortletRequestDispatcher portletRequestDispatcher = getPortletContext().getRequestDispatcher(viewJSP);
    		portletRequestDispatcher.include(renderRequest, renderResponse);
        }
        else{
        	PortletRequestDispatcher portletRequestDispatcher = getPortletContext().getRequestDispatcher(editJSP);
    		portletRequestDispatcher.include(renderRequest, renderResponse);
        }
		
		LOG.info("Exiting view class()");
	}*/
	public void submit (
	        ActionRequest actionRequest, ActionResponse actionResponse)
	                throws IOException, PortletException {
		LOG.info("Starting loginprocess class()");
		String Email = ParamUtil.getString(actionRequest, "email");
		String Pswd = ParamUtil.getString(actionRequest, "password");
        LOG.info("Email:"+Email);
        LOG.info("Pswd:"+Pswd);
        LoginDao login = new LoginDao();
        boolean status = login.validate(Email,Pswd);
        if (status==true) 
		{
        	actionResponse.setRenderParameter("Email",Email);
        	actionResponse.setRenderParameter("Pswd",Pswd);
			actionResponse.setRenderParameter("mvcPath","/html/greeting/loginprocess.jsp");	
		} 
		else{
			actionResponse.setRenderParameter("mvcPath","/html/new/invalidLogin.jsp");
	}
        //actionResponse.setRenderParameter("status", status);
        //LOG.info("status="+status);
        //LOG.info("login process Path="+loginprocessPath);
        
        //actionResponse.sendRedirect(loginprocessPath);
      //PortletRequestDispatcher portletRequestDispatcher = getPortletContext().getRequestDispatcher(editJSP);
      //portletRequestDispatcher.include(actionRequest, actionResponse);
       LOG.info("Exiting loginprocess class()");
	   
   }

}
