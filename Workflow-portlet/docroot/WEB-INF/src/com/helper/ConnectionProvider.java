package com.helper;
import java.sql.*;  

import static com.helper.Provider.*;
  
public class ConnectionProvider {  
private static Connection con=null;  
static{  
try{  
Class.forName(DRIVER);  
con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
}catch(Exception e){
	e.printStackTrace();
    System.err.println(e.getClass().getName()+": "+e.getMessage());
    System.exit(0);
}
System.out.println("Opened database successfully");
}  
  
public static Connection getCon(){  
    return con;  
}  
  
}