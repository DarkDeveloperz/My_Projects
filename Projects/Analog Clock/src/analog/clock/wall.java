
package analog.clock;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class wall {
    
    public static Properties p = new Properties();
    
    public void writeWall(String i, String j)
    {
        try
        {
          p.setProperty("locx",i);  
          p.setProperty("locy",j);
          p.store(new FileOutputStream("clock.ak"), null);
        }
        catch(Exception e)
        {
            
        }
    }
    public int[] readwall()
    {
        int[] c = new int[2];
        try
        {
            p.load(new FileInputStream("clock.ak"));
            c[0] = Integer.parseInt(p.getProperty("locx"));
            c[1] = Integer.parseInt(p.getProperty("locy"));
        }  
        catch(Exception e)
        {
         c[0]=200;
         c[1]=200;
         return c;
        }
        return c;
    }
   
    
}
