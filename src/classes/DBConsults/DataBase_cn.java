
package classes.DBConsults;

import java.sql.*;


/**
 *
 * @author LENOVO
 */
public class DataBase_cn {
    
    private String db_name = "ministeriodecultura_db";
    private String usuario = "root";
    private String password = "";
    private String url_db = "jdbc:mysql://localhost:3307/" + db_name;
    
    
    Connection cn = null;
    //Constructor
    public DataBase_cn(){
        try{
            //Getting driver
            Class.forName("com.mysql.jdbc.Driver");
            //Getting connection
            cn = DriverManager.getConnection(url_db,usuario,password);
            if(cn != null){  
                System.out.println("Connection to DB succesful!");
            }
        }catch(ClassNotFoundException e){
            System.out.println("Error! ClassNotFoundException: " + e.getMessage());
        }catch(SQLException e){
            System.out.println("Error! SQLException: " + e.getMessage());
        }
    }
    
    
    //Connect
    public Connection getConnection(){
        return cn;
    }
    //Disconnect
    public void disconnect_cn(){
        try{
            cn.close();
            cn = null;
        }catch(SQLException e){
            //TODO Auto-generated catch block
            e.printStackTrace();                        
        }
    }
    
    
   
    
   
    /*
    //Local cn
    public static Connection conect(){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/ministeriodecultura_db","root","");
            return cn;
        }catch (SQLException e){
            System.out.println("Error! Database connection failed" + e);
        }        
        return (null);
    } */   
}
