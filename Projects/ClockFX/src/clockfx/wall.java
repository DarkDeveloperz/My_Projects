
package clockfx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import javafx.scene.paint.Color;

public class wall {
    
    public static Properties p = new Properties();
    
    public void writeWall(String i, String j)
    {
        try
        {
          p.setProperty("locx",i);  
          p.setProperty("locy",j);
          p.store(new FileOutputStream("ClockFX.ak"), null);
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
            p.load(new FileInputStream("ClockFX.ak"));
            
            c[0] = (int) Double.parseDouble(p.getProperty("locx"));
            c[1] = (int) Double.parseDouble(p.getProperty("locy"));
        }  
        catch(Exception e)
        {
         c[0]=200;
         c[1]=200;
         return c;
        }
        return c;
    }
   
    public void writeOpacity(String i)
    {
        try
        {
          p.setProperty("opacity",i);  
          p.store(new FileOutputStream("ClockFX.ak"), null);
        }
        catch(Exception e)
        {
        }
    }
    
    public double readOpacity()
    {
        double c = 1.0;
        try
        {
            p.load(new FileInputStream("ClockFX.ak"));
            c = Double.parseDouble(p.getProperty("opacity"));
        }  
        catch(Exception e)
        {
         return c;
        }
        return c;
    }
    
    
    public void writeDepth(String i)
    {
        try
        {
          p.setProperty("depth",i);  
          p.store(new FileOutputStream("ClockFX.ak"), null);
        }
        catch(Exception e)
        {
        }
    }
    
    public int readDepth()
    {
        int c = 1;
        try
        {
            p.load(new FileInputStream("ClockFX.ak"));
            c = Integer.parseInt(p.getProperty("depth"));
        }  
        catch(Exception e)
        {
         return c;
        }
        return c;
    }
    
    public void writeBgColor(String i, Color j)
    {
        try
        {
          p.setProperty("bgcolor",i); 
          p.setProperty("othercolor", j.toString());
          p.store(new FileOutputStream("ClockFX.ak"), null);
        }
        catch(Exception e)
        {
        }
    }
    
    public String[] readBgColor()
    {
        String[] x = new String[2];
        try
        {
            p.load(new FileInputStream("ClockFX.ak"));
            x[0] = p.getProperty("bgcolor");
            x[1] = p.getProperty("othercolor");
        }  
        catch(Exception e)
        {
         x[0]="#1565C0";
         x[1]="0x1565c0ff";//0x ff
         return x;
        }
        return x;
    }
    
    public void writeFontColor(String i)
    {
        try
        {
          p.setProperty("fontcolor",i); 
          p.store(new FileOutputStream("ClockFX.ak"), null);
        }
        catch(Exception e)
        {
        }
    }
    
    public String readFontColor()
    {
        String x = "0x1565c0ff";
        try
        {
            p.load(new FileInputStream("ClockFX.ak"));
            x = p.getProperty("fontcolor");
        }  
        catch(Exception e)
        {
         return x;
        }
        return x;
    }
    
    public void writeCount(String i)
    {
        try
        {
          p.setProperty("count",i); 
          p.store(new FileOutputStream("ClockFX.ak"), null);
        }
        catch(Exception e)
        {
        }
    }
    
    public int readCount()
    {
        int x = 0;
        try
        {
            p.load(new FileInputStream("ClockFX.ak"));
            x = (int) Integer.parseInt(p.getProperty("count"));
        }  
        catch(Exception e)
        {
         return x;
        }
        return x;
    }
    
}
