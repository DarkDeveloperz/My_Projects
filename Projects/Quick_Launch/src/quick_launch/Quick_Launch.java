/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quick_launch;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

/**
 *
 * @author akash
 */
public class Quick_Launch {

    public void fb()
    {
        try
        {
         Desktop.getDesktop().browse(URI.create("https://www.facebook.com"));
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null, "Not Supported");
        }
    }
    public void twitter()
    {
        try
        {
         Desktop.getDesktop().browse(URI.create("https://www.twitter.com"));
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null, "Not Supported");
        }
    }
    public void amazon()
    {
        try
        {
         Desktop.getDesktop().browse(URI.create("https://www.amazon.com"));
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null, "Not Supported");
        }
    }
    public void you()
    {
        try
        {
         Desktop.getDesktop().browse(URI.create("https://www.youtube.com"));
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null, "Not Supported");
        }
    }

    public static void main(String[] args) {
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Quick dialog = new Quick(new javax.swing.JFrame(), true);
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
    
}
