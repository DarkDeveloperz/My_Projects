/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;
import java.io.*;
import sun.audio.*;

/**
 *
 * @author akash
 */
public class Clock {
public static byte a=0,b=0,c=0,d=0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cloc dialog = new cloc(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setOpacity(0);
                dialog.setVisible(true);
            }
        });
    }
public static void audio(int i)
{
InputStream music = null;
try
{
if(a==0 && i==1)
{
music = new FileInputStream(new File("./resources/audio/1.wav"));
}
if(i==3)
{
music = new FileInputStream(new File("./resources/audio/3.wav")); 
}
if(a==1 && d==0)
{
music.close();
}
AudioStream audios = new AudioStream(music);
AudioPlayer.player.start(audios);
}
catch (Exception e)
{   
} 
}   
}
