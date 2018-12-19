/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_2;

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javax.swing.*;
import sun.audio.*;

/**
 *
 * @author akash
 */

public class LIBRARY_2  {
    public static void start()
    {
        Splash s = new Splash();
        s.setVisible(true);
        LOGIN_AS l = new LOGIN_AS();
        
                 try
                {
                   for(int i=0; i<=100 ; i++ ) 
                   {         
                    Thread.sleep(70);
                    Splash.lb1.setText(Integer.toString(i)+"%");
                    Splash.p1.setValue(i);
                    if(i==1 || i==30 || i==60 || i==70 || i==80 || i==90 || i==100)
                    {
                     audio(31);
                    }
                    if(i==100)
                    {
                        s.setVisible(false);
                        l.setVisible(true);
                    }
                   }
                }
                catch(Exception e)
                {
                    
                }         
    }
    
    private static final int JFXPANEL_WIDTH_INT = 480;
    private static final int JFXPANEL_HEIGHT_INT = 220;
    private static JFXPanel fxContainer;
     public static byte upd=0;      
static Connection conn=null;
static Statement stmt=null;

public static void Connect()
{
    
    try{
        
       Class.forName("com.mysql.jdbc.Driver");
       
       conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/library1","root","admin");
       stmt=conn.createStatement();
    }
    catch(Exception e)
    {
        System.out.println(e);
        e.printStackTrace();
    }
}

public static void audio(int i)
{
InputStream music = null;
try
{
switch(i)
{
    case 1 : music = new FileInputStream(new File("./resources/audio/1.wav"));
        break;
    case 2 : music = new FileInputStream(new File("./resources/audio/2.wav"));
        break;
    case 3 : music = new FileInputStream(new File("./resources/audio/3.wav"));
        break;
    case 4 : music = new FileInputStream(new File("./resources/audio/4.wav"));
        break;
    case 5 : music = new FileInputStream(new File("./resources/audio/5.wav"));
        break;
    case 6 : music = new FileInputStream(new File("./resources/audio/6.wav"));
        break;
    case 7 : music = new FileInputStream(new File("./resources/audio/7.wav"));
        break;
    case 8 : music = new FileInputStream(new File("./resources/audio/8.wav"));
        break;
    case 9 : music = new FileInputStream(new File("./resources/audio/9.wav"));
        break;
    case 10 : music = new FileInputStream(new File("./resources/audio/10.wav"));
        break;
    case 11 : music = new FileInputStream(new File("./resources/audio/11.wav"));
        break;
    case 12 : music = new FileInputStream(new File("./resources/audio/12.wav"));
        break;
    case 13 : music = new FileInputStream(new File("./resources/audio/13.wav"));
        break;
    case 14 : music = new FileInputStream(new File("./resources/audio/14.wav"));
        break;
    case 15 : music = new FileInputStream(new File("./resources/audio/15.wav"));
        break;
    case 16 : music = new FileInputStream(new File("./resources/audio/16.wav"));
        break;
    case 17 : music = new FileInputStream(new File("./resources/audio/17.wav"));
        break;
    case 18 : music = new FileInputStream(new File("./resources/audio/18.wav"));
        break;
    case 19 : music = new FileInputStream(new File("./resources/audio/19.wav"));
        break;
    case 20 : music = new FileInputStream(new File("./resources/audio/20.wav"));
        break;
    case 21 : music = new FileInputStream(new File("./resources/audio/21.wav"));
        break;
    case 22 : music = new FileInputStream(new File("./resources/audio/22.wav"));
        break;
    case 23 : music = new FileInputStream(new File("./resources/audio/23.wav"));
        break;
    case 24 : music = new FileInputStream(new File("./resources/audio/24.wav"));
        break;
    case 25 : music = new FileInputStream(new File("./resources/audio/25.wav"));
        break;
    case 26 : music = new FileInputStream(new File("./resources/audio/26.wav"));
        break;
    case 27 : music = new FileInputStream(new File("./resources/audio/27.wav"));
        break;
    case 28 : music = new FileInputStream(new File("./resources/audio/28.wav"));
        break;
    case 29 : music = new FileInputStream(new File("./resources/audio/29.wav"));
        break;
    case 30 : music = new FileInputStream(new File("./resources/audio/30.wav"));
        break;
    case 31 : music = new FileInputStream(new File("./resources/audio/31.wav"));
        break;
    case 32 : music = new FileInputStream(new File("./resources/audio/32.wav"));
        break;
}
AudioStream audios = new AudioStream(music);
AudioPlayer.player.start(audios);
}
catch (Exception e)
{  
   //JOptionPane.showMessageDialog(null,e.getMessage()); 
} 
}
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception e) {
                }
                
               JFrame frame = new JFrame("JavaFX 2 in Swing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(false);
            }
        });
        Connect();
      start();
    }

    public void init() {
        fxContainer = new JFXPanel();
       fxContainer.setPreferredSize(new Dimension(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT));
        Platform.runLater(new Runnable() {
            
            @Override
            public void run() {

               createScene();
            }
        });
        
    }
    private void createScene() {
    }    
}