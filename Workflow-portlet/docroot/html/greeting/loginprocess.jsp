 <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.dao.LoginDao" %> 
 <%@ page import="org.apache.log4j.Logger" %>
	<% Logger log1 = Logger.getLogger("com.mobilefish.demo.test");
           log1.info("Entering logiinprocess JSP");
            %> 
<portlet:defineObjects /> 
<h5>User Logged Successfully</h5>
<%String Email=renderRequest.getParameter("Email");%>
Welcome <%=Email+"!!!"%>
<jsp:include page="index.jsp"></jsp:include>  
<% log1.info("Exiting loginprocess JSP");%>