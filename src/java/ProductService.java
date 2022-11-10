
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author developer
 */
@ManagedBean
@ApplicationScoped
public class ProductService {
   Product product=new Product();
    public ProductService() {
         
         
    }
    public List<Product> getAll(){
        List<Product> list=new ArrayList<Product>();
        DB_Connection db=new DB_Connection();
       
       try {
           System.out.print("ive been called");
           Connection con=db.get_connection();
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select * from products");
          while (rs.next()) {
			Product prod=new Product();
			prod.setId(Integer.parseInt((rs.getString("id"))));
			prod.setName(rs.getString("productname"));
			list.add(prod);
		}
           
       } catch (SQLException ex) {
          System.out.print(ex);
       }
        
        return list;
    }
    
}
