
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author developer
 */

public class DB_Connection{
    
    public Connection get_connection() throws SQLException{
    Connection con=null;
  try{
      String dbURL = "jdbc:mysql://localhost:3306/apis"; 
      String username ="mysql"; 
      String password = "mysql123";
      Class.forName("com.mysql.jdbc.Driver");
      con=DriverManager.getConnection(dbURL,username,password);
      
      return con;
}
    catch(Exception e){
        System.out.print(e);
}
    finally{
      con.close();
  }
        return null;
   
}
}