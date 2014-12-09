   <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
      
    <%@ page import="org.apache.log4j.Logger" %>
	<% Logger log1 = Logger.getLogger("com.mobilefish.demo.test");
           log1.info("Entering logiin JSP");
            %>
    <portlet:defineObjects /> 
    <h3 align="Center">Login Form</h3>  
    
<portlet:actionURL name="submit" var="submitURL" windowState="normal"> 
</portlet:actionURL>  
     <br/>  
    
    <form action="<%=submitURL%>" method="post" align="centre">  
    Email:<br/>
    <input type="text" name="<portlet:namespace/>email" id="<portlet:namespace/>email"/><br/>
    Password:<br/><input type="password" name="<portlet:namespace/>password" id="<portlet:namespace/>password" /><br/> 
    <input type="submit" value="login"/>
    <br/> 
    <hr/>
    <%@ include file="index.jsp" %>
    </form>  
    <% log1.info("Exiting login JSP");%>