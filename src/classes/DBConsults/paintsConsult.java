
package classes.DBConsults;

import classes.DBConsults.DataBase_cn;
import classes.paints;
import java.awt.Image;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class paintsConsult {
    public ArrayList<paints> consultPaints(){
        
        ArrayList<paints> paintsList = new ArrayList<>();
        

        Connection connection = null;
        DataBase_cn my_cn = new DataBase_cn();
        PreparedStatement statement = null;
        ResultSet result = null;
        
        paints paints_cn;
        
        connection = my_cn.getConnection();
        
        String consult = "SELECT imagenes FROM pinturas";
        

        try {
            
            if(connection != null){
                statement = connection.prepareStatement(consult);
                result = statement.executeQuery();
          
            while(result.next() == true){
                    paints_cn = new paints();
                    paints_cn.setImagen((byte[]) result.getBytes("imagenes"));
                    
                    paintsList.add(paints_cn);
                }  
            }
            
        } catch (SQLException e) {
            System.out.println("Error in the paints consult" + e.getMessage());
            
        }finally {
            try{
                connection.close();
                my_cn.disconnect_cn();
            }catch(SQLException e){
                //TODO Auto-generated catch block
                e.printStackTrace();
            }
        }return paintsList;
    }

}


    
    

