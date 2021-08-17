//Consulta para búsqueda de museos
package classes.DBConsults;

import classes.DBConsults.DataBase_cn;
import classes.museos;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author LENOVO
 */
public class museosConsult {
    
    public ArrayList<museos> consultMuseos(){
        
        ArrayList<museos> museosList = new ArrayList<>();
        
        Connection connection = null;
        DataBase_cn my_cn = new DataBase_cn();
        PreparedStatement statement = null;
        ResultSet result = null;
        
        museos museo_cn;
        
        connection = my_cn.getConnection();
        
        String consult = "SELECT codigo,nombre FROM museos";
        
        try{
            if( connection != null){
                statement = connection.prepareStatement(consult);
                result = statement.executeQuery();
                
                while(result.next() == true){
                    museo_cn = new museos();
                    museo_cn.setId(result.getString("codigo"));
                    museo_cn.setNombre(result.getString("nombre"));
                    
                    museosList.add(museo_cn);
                }
            }
        }catch(SQLException e){
            System.out.println("Error in the museum consult" + e.getMessage());
        }finally{
            try{
                connection.close();
                my_cn.disconnect_cn();
            }catch(SQLException e){
                //TODO Auto-generated catch block
                e.printStackTrace();
            }
        }return museosList;
    }
}
