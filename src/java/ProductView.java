
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author developer
 */
@ManagedBean(name ="product")
@ViewScoped
public class ProductView {
    private List<Product> products;
   
   @Inject 
   private ProductService productService;
   
   public List<Product> get_products(){
       return productService.getAll();
   }
   
    
}
