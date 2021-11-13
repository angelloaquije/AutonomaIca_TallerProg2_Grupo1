
package sistemaventajava.Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sistemaventajava.Negocio.Entidades.Cliente;
import sistemaventajava.Negocio.Entidades.Producto;
import static sistemaventajava.SistemaVentaJava.CLAVE;
import static sistemaventajava.SistemaVentaJava.URL;
import static sistemaventajava.SistemaVentaJava.USER;


public class Datos {
    public static final String USER = "root";
    public static final String CLAVE = "";
    public static final String URL = "jdbc:mysql://localhost:3306/Ventas";
    
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public List<Cliente> ListarClientes(){
        List<Cliente> clientes = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Cliente");
            
            while(rs.next()){
                Cliente item = new Cliente();
                
                item.IdCliente = rs.getInt("IdCliente");
                item.Nombre = rs.getString(("Nombre"));
                item.IdTipoDocumento=rs.getInt(("IdTipoDocumento"));
                item.NroDocumento=rs.getString(("NroDocumento"));

                clientes.add(item);
                
            }
            
            con.close();
            con = null;
            
        }catch(Exception ex){
            
        }
        
        return clientes;
    }
    
    public List<Producto> ListarProductos(){
        List<Producto> productos = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Producto");
            
            while(rs.next()){
                Producto item = new Producto();
                
                item.IdProducto=rs.getInt("IdProducto");
                item.Nombre=rs.getString("Nombre");
                item.Descripción=rs.getString("Descripción");
                item.Stock=rs.getInt("Stock");
                item.Precio=rs.getDouble("Precio");


                productos.add(item);
                
            }
            
            con.close();
            con = null;
            
        }catch(Exception ex){
            
        }
        
        return clientes;
    }
    
}
