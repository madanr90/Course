 <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
 <%@ page import="org.apache.log4j.Logger" %>
<% Logger log = Logger.getLogger("com.mobilefish.demo.test");
           log.info("Entering index JSP");
            %>
  <portlet:defineObjects />          
  <portlet:renderURL var="ForgotPassword">
  <portlet:param name="jspPage" value="/html/greeting/login.jsp"/>
  </portlet:renderURL>
  <a href="<%=ForgotPassword%>">Forgot Password?</a><br/>           
  <portlet:renderURL var="NewLogin">
  <portlet:param name="profilePage" value="/html/greeting/profile.jsp"/>
  </portlet:renderURL>
   
<a href="<%=NewLogin%>">New Login</a>
<% log.info("Existing index JSP");%>
    