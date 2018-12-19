
package calculator;

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
          p.store(new FileOutputStream("calculator.ak"), null);
        }
        catch(Exception e)
        {
            
        }
    }
    public void writeWall(String i)
    {
        try
        {
         p.setProperty("size",i);
         p.store(new FileOutputStream("calculator.ak"), null);
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
            p.load(new FileInputStream("calculator.ak"));
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
    public int readWall()
    {
        int a;
        try
        {
            p.load(new FileInputStream("calculator.ak"));
            a = Integer.parseInt(p.getProperty("size"));
        }  
        catch(Exception e)
        {
         return 1;
        }
        return a;
    }
    
}
