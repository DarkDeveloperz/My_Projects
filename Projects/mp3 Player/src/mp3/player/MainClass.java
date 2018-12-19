package mp3.player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import static mp3.player.mp3.*;

public class MainClass {
    
    BufferedInputStream bis;
    public static  FileInputStream fis;   
    public String filelocation;
    public double totallength;
    public static double tl;   
    public static Player player;
    public double pauselocation;
    public static int i=0;
    public static int a=0;
    public static int j=0;
    public static int k=0;
    public static int m=0;
    public static int l=0;
    public static int pausecount=0;
    
    
    public void resume()
    {
        j=1;
        try {
            fis = new FileInputStream(filelocation);
            bis = new BufferedInputStream(fis);
            player  = new Player(bis);
            if(i<=1)
            {
              fis.skip((long) (totallength - pauselocation));  
            } 
            if(i==2)
            {
                fis.skip((long)(tl-pauselocation));
            }
            
            if(stopprogress==0)       
           {
                stopprogress=1;            
                new Thread()
                        {
public void run()
{
               try
                {
                    p1.setMaximum(m);
                    
                    while(true)
                    {
                        for(int l=0; l<=m; l=m-fis.available())
                        {                          
                            p1.setValue(l);    
                            Thread.sleep(1000);
                            if(stopprogress==0)
                            {
                                p1.setValue(0);
                            }
                            
                            if(player.isComplete()==true)
                             {
                       playhover1.setVisible(false);
                       p1.setVisible(false);
                       lb.setText("");
                       k=0;l=0;
                       break;
                   }
                            while(pauseprogress==0)
                            {
                                pausecount=1;
                                Thread.sleep(10);
                            }
                        }
                    }
                }
                catch(Exception e)
                {  
                }      
}
}.start();       
                
new Thread()
    {
        public void run()
        {
            try
            {
                min=0;sec=0;
                p1.setMaximum(k);       
                    for(int l=0; l<=k; l=k-fis.available())
                    {
                        p1.setValue(l);
                      //  p1.imageUpdate(Toolkit.getDefaultToolkit().getImage(getClass().getResource("spark.png")), l, l, l, l, l);
                        sec++;  
                         if(sec>59)
                        {
                            sec=0;
                            min++;
                            min=min+sec/60;
                        } 
                        if(min!=0)
                           {  
                           time.setText(min+":"+sec);
                           }
                           else
                           {
                               time.setText(sec+"");
                           }     
                         
                        Thread.sleep(948);
                        if(stopprogress==0)
                        {
                            p1.setValue(0);
                        }
                        if(player.isComplete()==true)
                        {
                            p1.setValue(0);
                            p1.setVisible(false);
                            k=0;l=0;min=0;sec=0;
                            time.setText("");
                            break;          
                    }
                    }
            }
            catch(Exception e)
            {
            }
        }
    }.start();
           }
            
if(pausecount==1)
{
    new Thread()
    {
        public void run()
        {
            try
            {     
                    for(int l=Integer.parseInt(time.getText()); l<=k; l=k-fis.available())
                    {
      
                        sec++;  
                         if(sec>59)
                        {
                            sec=0;
                            min++;
                            min=min+sec/60;
                        } 
                        if(min!=0)
                           {  
                           time.setText(min+":"+sec);
                           }
                           else
                           {
                               time.setText(sec+"");
                           }     
                         
                        Thread.sleep(948);
                        if(stopprogress==0)
                        {
                            p1.setValue(0);
                        }
                        if(player.isComplete()==true)
                        {
                            p1.setValue(0);
                            p1.setVisible(false);
                            k=0;l=0;min=0;sec=0;
                            time.setText("");
                            break;          
                    }
                    }
            }
            catch(Exception e)
            {
            }
        }
    }.start();
}

            }
        catch (Exception ex) {
        }
        
        new Thread()
        {
            public void run()
            {
                try {
                    player.play();
                } catch (JavaLayerException ex) {
                  
                }
            }
        }.start();
        
    }
    
    public void stop()
    {
        if(player != null)
        {
            player.close();
            totallength = 0 ;
            pauselocation = 0 ;
            stopprogress=0;
            i=1;
            a=0;
            j=0;
        }
    }
    
    public void pause()
    {
        if(player != null)
        {
            try {
                pauselocation=fis.available();
                i=2;
                a=0;
                j=0;
                pauseprogress=0;
                player.close();
            } catch (Exception ex) {   
            }          
        }
    }
    
    public void play(String path)
    {
                 try {
            p1.setVisible(true);         
            j=1;
            fis = new FileInputStream(path);
            bis = new BufferedInputStream(fis);            
            player = new Player(bis);
            totallength = fis.available();
            m=k = (int) totallength;
            tl=fis.available();
            filelocation = path+"";         
            
        } 
        catch(Exception e)
        {    
        }
       
        new Thread()
        {
            
            @Override
            public void run()
            {
                try {
                    player.play();                   
                    if(player.isComplete() && mp3.count == 1)
                    {
                        play(filelocation);
                    }
                    if(player.isComplete())
                    {
                        lb.setText("");
                       // p1hover.setLocation(20, 20);
                        playhover1.setVisible(false);
                       // p1.setVisible(false);
                        playhover.setVisible(false);
                        time.setText("");
                        min=sec=0;
                        
                    }
                } catch (JavaLayerException ex) {
                  
                }
            }
        }.start();  
        new Thread()
        {
            public void run()
            {
                while(true)
                {
                if(player == null || player.isComplete()==true)
                          {
                              mouseX=0;
                           
                             break;
                          }
                }
            }
        }.start();
       
    }
   
}
