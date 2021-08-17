//Clase encargada de gestionar la visualización de la tabla, incluido la imagen
package classes;

import classes.DBConsults.artistConnection;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author LENOVO
 */
public class verTablaArtist {
    
    public void visualizar_tabla(JTable tabla){
        
        artistConnection conn = new artistConnection();
        Connection con = conn.conectar();
        ResultSet rs = conn.visualizar();
        
        tabla.setDefaultRenderer(Object.class, new TablaImagen());
        
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Artista");
        dt.addColumn("Pintura");
       
        
        try{
            while(rs.next()){
                Object[] fila = new Object[2];
                
                fila[0] = rs.getObject(1);
                
                Blob blob = rs.getBlob(2);
                
                
                if(blob != null){
                    try{
                        
                        byte[] data = blob.getBytes(1,(int)blob.length());
                
                        BufferedImage img = null;
                
                        try{
                            img = ImageIO.read(new ByteArrayInputStream(data));
                    
                        }catch(Exception ex){
                            System.out.println("Error leyendo la imagen" + ex.getMessage());                    
                        }
                
                        ImageIcon  icono = new ImageIcon(img);
                        fila[1] = new JLabel(icono);
                        
                    }catch(Exception ex){
                        fila[1] = "No imagen";                       
                    }
                }else{                    
                    fila[1] = "No imagen";                    
                }
                dt.addRow(fila);
            }
            
            tabla.setModel(dt);
            tabla.setRowHeight(64);
            
        }catch(Exception ex){
            System.out.println("Error al visualizar en la tabla");            
        }
        
        
        
        
        
        
        
    }
    
}
