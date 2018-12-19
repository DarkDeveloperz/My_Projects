/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen_capture;

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
          p.setProperty("value",i); 
          p.store(new FileOutputStream("shot.sys"), null);
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
            p.load(new FileInputStream("shot.sys"));
            line = p.getProperty("value");
        }
        catch(Exception e)
        {
          return "1";  
        }
        return line;
    }
    
}
