/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewerfx;

import java.sql.*;

/**
 *
 * @author akash
 */
public class DBConnection {
    public static Connection connector(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:ImageViewerFXDB");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}

// Developed by : Akash Tripathi on 12/12/2018. I am a software developer, graphics designer, web developer
// I have worked on many softwares, websites and graphics
// My work can be seen on my personal portfolio website: darkdeveloperz.github.io.