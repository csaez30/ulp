
package ejemplo2;

import java.sql.Connection;
import java.sql.DriverManager;


public class conectar {
     Connection conn = null;
    
    public Connection conexion(){
        
         try{
         Class.forName("com.mysql.jdbc.Driver").newInstance();
         conn = DriverManager.getConnection ("jdbc:mysql://localhost/sistema", "root", "");
          System.out.println("Conexion exitosa!!!");
          
          
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
      
         return conn;
        
    }
    
}

      
      
      