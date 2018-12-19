package all_file_opener;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NewJDialog extends javax.swing.JDialog {
    wall w;
    int lastX, lastY;
    int width = (Toolkit.getDefaultToolkit().getScreenSize().width )-310;
    Runtime obj = Runtime.getRuntime();

    public NewJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        w = new wall();
        setwall sw = new setwall();
        sw.setwall();
        setBackground(new Color(0,0,0,0));
        this.setLocation(width, 10);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JLabel();
        fb = new javax.swing.JLabel();
        power = new javax.swing.JLabel();
        chrome = new javax.swing.JLabel();
        note = new javax.swing.JLabel();
        pc = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        pre = new javax.swing.JLabel();
        hover = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_file_opener/imageedit_3_9295397844.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 30, 30));

        fb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fbMouseReleased(evt);
            }
        });
        getContentPane().add(fb, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 20, 40));

        power.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        power.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                powerMouseReleased(evt);
            }
        });
        getContentPane().add(power, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 50, 30, 40));

        chrome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chrome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                chromeMouseReleased(evt);
            }
        });
        getContentPane().add(chrome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 30, 40));

        note.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        note.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noteMouseClicked(evt);
            }
        });
        getContentPane().add(note, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 30, 30));

        pc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pc.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pcMouseMoved(evt);
            }
        });
        pc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pcMouseReleased(evt);
            }
        });
        getContentPane().add(pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, 30));

        next.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        next.setForeground(new java.awt.Color(204, 204, 204));
        next.setText(">>");
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nextMouseReleased(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 20, 20));

        pre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pre.setForeground(new java.awt.Color(204, 204, 204));
        pre.setText("<<");
        pre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                preMouseReleased(evt);
            }
        });
        getContentPane().add(pre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, 20, 20));

        hover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverMouseMoved(evt);
            }
        });
        getContentPane().add(hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 300, 100));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.png"))); // NOI18N
        img.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                imgMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imgMouseMoved(evt);
            }
        });
        img.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                imgFocusLost(evt);
            }
        });
        img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgMousePressed(evt);
            }
        });
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
this.setOpacity(0);   
exit.setVisible(false);
try 
{
for(float i=0; i<=1 ; i=i+(float)0.1 ) 
{         
Thread.sleep(110);
this.setOpacity(i);
}
}
catch(Exception e)
{    
JOptionPane.showMessageDialog(null,e.getMessage());
} 
    }//GEN-LAST:event_formWindowOpened

    private void imgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMousePressed
lastX = evt.getXOnScreen();
lastY = evt.getYOnScreen();
    }//GEN-LAST:event_imgMousePressed

    private void imgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMouseDragged
int x = evt.getXOnScreen();
int y = evt.getYOnScreen();
setLocation(getLocationOnScreen().x + x - lastX,getLocationOnScreen().y + y - lastY);
lastX = x;
lastY = y;
    }//GEN-LAST:event_imgMouseDragged

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
this.setOpacity(1);
        try
        {
            for(float i=1; i>=0 ; i=i-(float)0.1 )
            {
                Thread.sleep(110);
                this.setOpacity(i);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void imgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMouseMoved
exit.setVisible(true);
    }//GEN-LAST:event_imgMouseMoved

    private void imgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_imgFocusLost
exit.setVisible(false);
    }//GEN-LAST:event_imgFocusLost

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
exit.setVisible(false);
    }//GEN-LAST:event_formWindowLostFocus

    private void hoverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverMouseMoved
exit.setVisible(false);
    }//GEN-LAST:event_hoverMouseMoved

    private void pcMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcMouseReleased
new Thread()
{
  public void run()
  {
try
{
obj.exec("c:\\Windows\\explorer.exe");
}
catch(Exception e)
{   
JOptionPane.showMessageDialog(null,e.getMessage());
}
  }
}.start();
    }//GEN-LAST:event_pcMouseReleased

    private void pcMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcMouseMoved

    }//GEN-LAST:event_pcMouseMoved

    private void noteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noteMouseClicked
new Thread()
{
   public void run()
   {
        try 
{
obj.exec("\"C:\\Program Files (x86)\\Notepad++\\notepad++.exe\"");
} 
catch (Exception ex) 
{
    JOptionPane.showMessageDialog(null,ex.getMessage());
}
   }
}.start();
    }//GEN-LAST:event_noteMouseClicked

    private void chromeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chromeMouseReleased
new Thread()
{
   public void run()
   {
        try 
{
obj.exec("\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"");    
}
catch(Exception e)
{   
    JOptionPane.showMessageDialog(null,e.getMessage());
}
   }
}.start();
    }//GEN-LAST:event_chromeMouseReleased

    private void powerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_powerMouseReleased
new Thread()
{
   public void run()
   {
        try 
{
obj.exec("shutdown -s -t 60");    
}
catch(Exception e)
{   
    JOptionPane.showMessageDialog(null,e.getMessage());
}
   }
}.start();
    }//GEN-LAST:event_powerMouseReleased

    private void fbMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fbMouseReleased

        new Thread()
{
   public void run()
   {try
        {
         Desktop.getDesktop().browse(URI.create("https://www.facebook.com"));
        }
        catch(Exception e)
        {
JOptionPane.showMessageDialog(null,e.getMessage());
        }
   }
}.start();
    }//GEN-LAST:event_fbMouseReleased

    private void nextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseReleased
ImageIcon  I1= new ImageIcon(getClass().getResource("/images/2.png"));
img.setIcon(I1); 
w.writeWall("wall2");
    }//GEN-LAST:event_nextMouseReleased

    private void preMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preMouseReleased
ImageIcon  I1= new ImageIcon(getClass().getResource("/images/1.png"));
img.setIcon(I1); 
w.writeWall("wall1");
    }//GEN-LAST:event_preMouseReleased

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJDialog dialog = new NewJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chrome;
    public static javax.swing.JLabel exit;
    private javax.swing.JLabel fb;
    private javax.swing.JLabel hover;
    public static javax.swing.JLabel img;
    private javax.swing.JLabel next;
    private javax.swing.JLabel note;
    private javax.swing.JLabel pc;
    private javax.swing.JLabel power;
    private javax.swing.JLabel pre;
    // End of variables declaration//GEN-END:variables
}
