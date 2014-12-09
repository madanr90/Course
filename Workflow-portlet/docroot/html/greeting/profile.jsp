  <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %> 
    <%@ page import="org.apache.log4j.Logger" %>
	<% Logger log1 = Logger.getLogger("com.mobilefish.demo.test");
           log1.info("Entering Profile JSP");
            %>
    <portlet:defineObjects />
     Welcome to Profile Page!
     
     <% log1.info("Exiting Profile JSP");%>