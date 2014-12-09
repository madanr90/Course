 <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.dao.LoginDao" %> 
 <%@ page import="org.apache.log4j.Logger" %>
	<% Logger log1 = Logger.getLogger("com.mobilefish.demo.test");
           log1.info("Entering invalidlogin JSP");
            %> 
<portlet:defineObjects /> 
<h1>User Login failed!!</h1>
<portlet:renderURL  var="backtologin" windowState="normal">
<portlet:param name="mvcPath" value="/html/greeting/login.jsp"/>
</portlet:renderURL>
<a href="<%=backtologin.toString()%>">Back</a><br/>
<jsp:include page="index.jsp"></jsp:include>  
<% log1.info("Exiting invalidlogin JSP");%>