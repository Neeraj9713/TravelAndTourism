
package travelandtourism;

import java.sql.*;


public class Conn {
    Connection c;             //connection c is there in java.sql.* package;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///travelandtourism", "root","@Mp09kd7120");    //   //localhost:3306"
            s = c.createStatement();                         //creating the statement                                                        
            
            
            
        }catch(Exception e){
            e.printStackTrace();   //printSt.. ki help se exception ko print kiya ja skta he
        }
    }    
}
