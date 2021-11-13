
package sistemaventajava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SistemaVentaJava {
    public static final String USER = "root";
    public static final String CLAVE = "";
    public static final String URL = "jdbc:mysql://localhost:3306/Ventas";

    public static void main(String[] args) {
        
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            
            
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM TipoDocumento");
            
            while (rs.next()){
                System.out.println( String.valueOf(rs.getInt("IdTipoDocumento"))  + "\t" + rs.getString("NombreTipoDocumento") );
                
            }
            
        }
        
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}


