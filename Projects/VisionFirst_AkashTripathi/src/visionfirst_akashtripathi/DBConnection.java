/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionfirst_akashtripathi;

import java.sql.*;

/**
 *
 * @author akash
 */
public class DBConnection {
    public static Connection connector(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:DB");
            return con;
        }
        catch(ClassNotFoundException | SQLException e){
            return null;
        }
    }
}
