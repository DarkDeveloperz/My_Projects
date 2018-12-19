/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch_run;

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
          p.store(new FileOutputStream("batch.ak"), null);
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
            p.load(new FileInputStream("batch.ak"));
            line = p.getProperty("wallpaper");
        }
        catch(Exception e)
        {
            
        }
        return line;
    }
    
}
