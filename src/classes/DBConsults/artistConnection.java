//Clase encargada de gestionar la conexión a base de datos para la tabla artistas
package classes.DBConsults;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class artistConnection {
    
    public Connection conectar(){
        
        Connection con = null;
        String url = "jdbc:mysql://localhost:3307/ministeriodecultura_db";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,"root","");
            System.out.println("On line...");
            
        }catch(Exception ex){
            System.out.println("Error: ");
        }        
        return con;        
    }
    
    public ResultSet visualizar(){
        
        Connection con = conectar();
        ResultSet rs = null;
        
        try{
            PreparedStatement ps = con.prepareStatement("SELECT * FROM pinturas_artistas");
            rs = ps.executeQuery();
        }catch(Exception ex){
            System.out.println("Error de consulta");
        }        
        return rs;
    }
    
    //Ingresa y guarda la imagen a la base de datos desde la aplicación
    public void guardar_imagen(String ruta,String codigo){
        Connection con = conectar();
        String insert = "INSERT INTO pinturas_artistas (codigo,imagenes) VALUES (?,?)";
        FileInputStream fi = null;
        PreparedStatement ps = null;
        
        try{
            File file = new File(ruta);
            fi = new FileInputStream(file);
            
            ps = con.prepareStatement(insert);
            ps.setString(1, codigo);
            ps.setBinaryStream(2,fi);
            
            ps.executeUpdate();
            
        }catch(Exception ex){
            System.out.println("Error al guardar");
        }
        
        
    }
    
}
