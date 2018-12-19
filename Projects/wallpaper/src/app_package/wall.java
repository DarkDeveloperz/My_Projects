/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_package;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 *
 * @author akash
 */
public class wall {
    public static Properties p = new Properties();
    public void writeWall(String i)
    {
        try
        {
          p.setProperty("wallpaper",i);  
          p.store(new FileOutputStream("app.properties"), null);
        }
        catch(Exception e)
        {
            
        }
    }
    public String readwall()
    {
        String line = "";
        try
        {
            p.load(new FileInputStream("app.properties"));
            line = p.getProperty("wallpaper");
        }
        catch(Exception e)
        {
            
        }
        return line;
    }
    
}
