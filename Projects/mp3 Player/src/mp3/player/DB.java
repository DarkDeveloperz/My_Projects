/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3.player;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author akash
 */
public class DB {

static Connection conn=null;
static Statement stmt=null;

    public static void Connect()
{
    try{
        
       Class.forName("com.mysql.jdbc.Driver");
       
       conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/mp3","root","admin");
       stmt=conn.createStatement();
    }
    catch(Exception e)
    {
        System.out.println(e);
        e.printStackTrace();
    }
}
    
}
