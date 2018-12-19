
package mp3.player;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class wall {
    
    public static Properties p = new Properties();
    
    public void writeWall(String i, String j)
    {
        new Thread()
        {
           public void run()
           {
           try
        {
          p.setProperty("locx",i);  
          p.setProperty("locy",j);
          p.store(new FileOutputStream("loc.ak"), null);
        }
        catch(Exception e)
        {    
        }
           }
        }.start();
    }
    
    public void setPath(String path)
    {
        new Thread()
        {
           public void run()
           {
       try
        {
          p.setProperty("path",path);  
          p.store(new FileOutputStream("loc.ak"), null);
        }
        catch(Exception e)
        {   
            p.setProperty("path", "C:\\Users\\"+System.getProperty("user.name")+"\\Music");
        } 
           }
        }.start();
    }
    
    public int[] readwall()
    {
        int[] c = new int[2];
        try
        {
            p.load(new FileInputStream("loc.ak"));
            c[0] = Integer.parseInt(p.getProperty("locx"));
            c[1] = Integer.parseInt(p.getProperty("locy"));
        }  
        catch(Exception e)
        {
         c[0]=600;
         c[1]=200;
         p.setProperty("no",""+0);
         return c;
        }
        return c;
    }
    
    public String getPath()
    {
    String x = "C:\\Users\\"+System.getProperty("user.name")+"\\Music";  
    try
        {
            p.load(new FileInputStream("loc.ak"));
            x = p.getProperty("path");
        }  
        catch(Exception e)
        {    
            try {
         p.setProperty("no",""+0);         
         p.store(new FileOutputStream("loc.ak"), null);
        } catch (Exception ex) {
            return "C:\\Users\\"+System.getProperty("user.name")+"\\Music";
        }
        }
        return x;
    }
    
    public String getNumber()
    {
        String x = null;
        try
        {
            p.load(new FileInputStream("loc.ak"));
            x = p.getProperty("no");
        }
        catch(Exception e)
        {  
        }
        return x;
    }

}
