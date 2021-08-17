
package classes.DBConsults;

import classes.artist;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class artistConsult {
    
    public ArrayList<artist> consultArtist(){
        
        ArrayList<artist> artistList = new ArrayList<>();
        
        Connection connection = null;
        DataBase_cn my_cn = new DataBase_cn();
        PreparedStatement statement = null;
        ResultSet result = null;
        
        artist artist_cn;
        
        connection = my_cn.getConnection();
        
        String consult = "SELECT codigo,nombre,apellido FROM artistas";
        
        try{
            if( connection != null){
                statement = connection.prepareStatement(consult);
                result = statement.executeQuery();
                
                while(result.next() == true){
                    artist_cn = new artist();
                    artist_cn.setId(result.getString("codigo"));
                    artist_cn.setNombre(result.getString("nombre"));
                    artist_cn.setApellido(result.getString("apellido"));
                    
                    artistList.add(artist_cn);
                }
            }
        }catch(SQLException e){
            System.out.println("Error in the artist consult" + e.getMessage());
        }finally{
            try{
                connection.close();
                my_cn.disconnect_cn();
            }catch(SQLException e){
                //TODO Auto-generated catch block
                e.printStackTrace();
            }
        }return artistList;
    }
    
    
}
