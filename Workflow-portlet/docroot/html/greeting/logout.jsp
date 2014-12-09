  <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %> 
    <%@ page import="org.apache.log4j.Logger" %>
	<% Logger log1 = Logger.getLogger("com.mobilefish.demo.test");
           log1.info("Entering logout JSP");
            %>
    <portlet:defineObjects />
     Logged out successfully!
     <% log1.info("Exiting logout JSP");%>