package com.dao;

import java.sql.*;  

import com.entity.LoginBean;
import com.helper.ConnectionProvider;
import com.portlet.Greeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LoginDao {  
	final Log LOG = LogFactory.getLog(Greeting.class);
	static ResultSet rs = null;
public boolean validate(String Email,String Pswd){  
	Statement stmt = null;
	boolean status = true;
	LOG.info("Entering LoginDao class()");  
try{  
	LOG.info("Starting LoginDao Try statement");
	String searchQuery ="select * from users where username='"+Email+"' AND password='"+Pswd+ "'";
    Connection con=ConnectionProvider.getCon();  
    stmt=con.createStatement(); 
	rs = stmt.executeQuery(searchQuery);  
	status = rs.next();
    LOG.info("Result Set:"+rs);
    if(!status)
    {
    	System.out.println("Sorry, you are not a registered user! Please sign up first");
    }
        System.out.println("Welcome " + Email);
    }
catch(Exception e){}  

LOG.info("Exiting LoginDao class()");
  
return status;  
 
}  

} 