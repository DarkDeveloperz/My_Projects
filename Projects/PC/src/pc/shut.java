/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;
import static pc.PC.*;

/**
 *
 * @author akash
 */
public class shut extends javax.swing.JDialog {
    public String os = "";
    int lastX, lastY;

    /**
     * Creates new form shut
     */
    public shut(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
os = System.getProperty("os.name");
lb1.setText(os);
new Thread()
{
public void run()
{
byte c = 0;
while(c==0)
{
try
{   
Thread.sleep(1000);  
}
catch(Exception e)
{   
}
}   
}
}.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JLabel();
        restart = new javax.swing.JLabel();
        shutdown = new javax.swing.JLabel();
        logoff = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pc/imageedit_3_9295397844.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 30, 30));

        restart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restart.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                restartMouseMoved(evt);
            }
        });
        restart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restartMouseClicked(evt);
            }
        });
        getContentPane().add(restart, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 40, 40));

        shutdown.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shutdown.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                shutdownMouseMoved(evt);
            }
        });
        shutdown.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                shutdownFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                shutdownFocusLost(evt);
            }
        });
        shutdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shutdownMouseClicked(evt);
            }
        });
        getContentPane().add(shutdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, 40));

        logoff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoff.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                logoffMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                logoffMouseMoved(evt);
            }
        });
        logoff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoffMouseClicked(evt);
            }
        });
        getContentPane().add(logoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 30, 40, 40));

        time.setFont(new java.awt.Font("Digital-7", 0, 14)); // NOI18N
        time.setForeground(new java.awt.Color(153, 153, 153));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cancelMouseMoved(evt);
            }
        });
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 29, 30, 30));

        text.setFont(new java.awt.Font("Arabic Typesetting", 2, 14)); // NOI18N
        text.setForeground(new java.awt.Color(153, 153, 153));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                textMouseMoved(evt);
            }
        });
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 20));

        lb1.setFont(new java.awt.Font("Arabic Typesetting", 0, 14)); // NOI18N
        lb1.setForeground(new java.awt.Color(153, 153, 153));
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lb1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lb1MouseMoved(evt);
            }
        });
        lb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb1MousePressed(evt);
            }
        });
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 20));

        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 230, 50));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pc/shut.png"))); // NOI18N
        img.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imgMouseMoved(evt);
            }
        });
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        }
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void shutdownMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shutdownMouseMoved
        text.setText("SHUT DOWN");
    }//GEN-LAST:event_shutdownMouseMoved

    private void shutdownFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_shutdownFocusGained

    }//GEN-LAST:event_shutdownFocusGained

    private void shutdownFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_shutdownFocusLost

    }//GEN-LAST:event_shutdownFocusLost

    private void shutdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shutdownMouseClicked
        String command = "";
        a=0;
        time.setVisible(true);
        if(os.contains("Windows"))
        {
            command = "shutdown -s -t 120";
            new Thread()
            {
                public void run()
                {
                    for(byte i=120;i>=0;i--)
                    {
                        time.setText(i+"");
                        try
                        {
                            Thread.sleep(1000);
                            if(a==1)
                            {
                                this.stop();
                                time.setVisible(false);
                                time.setText("");
                            }
                        }
                        catch(Exception e)
                        {
                        }
                    }
                }
            }.start();
        }
        else if(os.contains("Linux"))
        {
            command = "shutdown -h now";
        }
        else if(os.contains("Mac"))
        {
            command = "shutdown -h now";
        }
        else
        {
            JOptionPane.showMessageDialog(null,"OS NOT YET SUPPORTED");
        }
        try
        {
            Runtime.getRuntime().exec(command);
        }
        catch(IOException e)
        {

        }
    }//GEN-LAST:event_shutdownMouseClicked

    private void restartMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restartMouseMoved
        text.setText("REBOOT");
    }//GEN-LAST:event_restartMouseMoved

    private void restartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restartMouseClicked
        String command = "";
        a=0;
        time.setVisible(true);
        if(os.contains("Windows"))
        {
            command = "shutdown -r -t 120";
            new Thread()
            {
                public void run()
                {
                    for(byte i=120;i>=0;i--)
                    {
                        time.setText(i+"");
                        try
                        {
                            Thread.sleep(1000);
                            if(a==1)
                            {
                                this.stop();
                                time.setVisible(false);
                                time.setText("");
                            }
                        }
                        catch(Exception e)
                        {
                        }
                    }
                }
            }.start();
        }
        else if(os.contains("Linux"))
        {
            //command = "shutdown -h now";
        }
        else if(os.contains("Mac"))
        {
            //command = "shutdown -h now";
        }
        else
        {
            JOptionPane.showMessageDialog(null,"OS NOT YET SUPPORTED");
        }
        try
        {
            Runtime.getRuntime().exec(command);
        }
        catch(IOException e)
        {

        }
    }//GEN-LAST:event_restartMouseClicked

    private void logoffMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoffMouseDragged
        //this.setLocation(evt.getLocationOnScreen());        // TODO add your handling code here:
    }//GEN-LAST:event_logoffMouseDragged

    private void logoffMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoffMouseMoved
        text.setText("LOGOUT");
    }//GEN-LAST:event_logoffMouseMoved

    private void logoffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoffMouseClicked
        String command = "";
        a=0;
        JOptionPane.showMessageDialog(null,"YOU ARE GOING TO BE LOGGED OUT IN 2 MINUTES");
        if(os.contains("Windows"))
        {
            command = "shutdown -l -t 120";
            new Thread()
            {
                public void run()
                {
                    for(byte i=120;i>=0;i--)
                    {
                        time.setText(i+"");
                        try
                        {
                            Thread.sleep(1000);
                            if(a==1)
                            {
                                this.stop();
                                time.setVisible(false);
                                time.setText("");
                            }
                        }
                        catch(Exception e)
                        {
                        }
                    }
                }
            }.start();
        }
        else if(os.contains("Linux"))
        {
            //command = "shutdown -h now";
        }
        else if(os.contains("Mac"))
        {
            //command = "shutdown -h now";
        }
        else
        {
            JOptionPane.showMessageDialog(null,"OS NOT YET SUPPORTED");
        }
        try
        {
            Runtime.getRuntime().exec(command);
        }
        catch(IOException e)
        {

        }
    }//GEN-LAST:event_logoffMouseClicked

    private void cancelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseMoved
        text.setText("CANCEL   ACTION");
    }//GEN-LAST:event_cancelMouseMoved

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        String command = "";
        a=1;
        time.setText("");
        if(os.contains("Windows"))
        {
            command = "shutdown /a";
        }
        else if(os.contains("Linux"))
        {
            //command = "shutdown -h now";
        }
        else if(os.contains("Mac"))
        {
            //command = "shutdown -h now";
        }
        else
        {
            JOptionPane.showMessageDialog(null,"OS NOT YET SUPPORTED");
        }
        try
        {
            Runtime.getRuntime().exec(command);
        }
        catch(IOException e)
        {

        }
    }//GEN-LAST:event_cancelMouseClicked

    private void textMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMouseMoved
        text.setText("");
    }//GEN-LAST:event_textMouseMoved

    private void imgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMouseMoved
exit.setVisible(true);
text.setText("");
    }//GEN-LAST:event_imgMouseMoved

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
exit.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseMoved

    private void lb1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb1MousePressed
lastX = evt.getXOnScreen();
lastY = evt.getYOnScreen();
    }//GEN-LAST:event_lb1MousePressed

    private void lb1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb1MouseDragged
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            setLocation(getLocationOnScreen().x + x - lastX,getLocationOnScreen().y + y - lastY);
            lastX = x;
            lastY = y;
    }//GEN-LAST:event_lb1MouseDragged

    private void lb1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb1MouseMoved
text.setText("");
    }//GEN-LAST:event_lb1MouseMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(shut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                shut dialog = new shut(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel cancel;
    public static javax.swing.JLabel exit;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel logoff;
    private javax.swing.JLabel restart;
    private javax.swing.JLabel shutdown;
    private javax.swing.JLabel text;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
