
package analog.clock;

import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;

public class Clock extends javax.swing.JDialog {
    int lastX, lastY;
    //int width = (Toolkit.getDefaultToolkit().getScreenSize().width )-220;
    wall w;
    
    public Clock(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
        w = new wall();
        int[] x = w.readwall();
        this.setLocation(x[0]-130,x[1]-80);

        new Thread()
        {
            public void run()
        {
           while(true)
        {
          
            Calendar cal = new GregorianCalendar();
            int hour = cal.get(cal.HOUR);
            int min = cal.get(cal.MINUTE);
            int sec = cal.get(cal.SECOND);
            ImageIcon img1 = new ImageIcon(".\\resources\\sec\\R"+sec+".png");
            second.setIcon(img1);
            ImageIcon img2 = new ImageIcon(".\\resources\\min\\B"+min+".png");
            minute.setIcon(img2);
            ImageIcon img3 = new ImageIcon(".\\resources\\hour\\L"+(hour*5+min*5/60)+".png");
            hour1.setIcon(img3);
            try
        {
            sleep(1000);
        }
            catch(Exception e)
        {   
        }
            }
        }
        }.start();  
        }                
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drag = new javax.swing.JLabel();
        second = new javax.swing.JLabel();
        minute = new javax.swing.JLabel();
        hour1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        clear = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragMouseDragged(evt);
            }
        });
        drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragMousePressed(evt);
            }
        });
        getContentPane().add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 140, 130));
        getContentPane().add(second, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 220, 250));
        getContentPane().add(minute, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 220, 250));
        getContentPane().add(hour1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 220, 250));

        exit.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analog/clock/imageedit_3_9295397844.png"))); // NOI18N
        exit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                exitMouseMoved(evt);
            }
        });
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitMouseReleased(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 30, 40));

        clear.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                clearMouseMoved(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, 90));

        clock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analog/clock/clock1.png"))); // NOI18N
        clock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clock.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                clockMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                clockMouseMoved(evt);
            }
        });
        clock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clockMousePressed(evt);
            }
        });
        getContentPane().add(clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clockMousePressed

    }//GEN-LAST:event_clockMousePressed

    private void clockMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clockMouseDragged
            
    }//GEN-LAST:event_clockMouseDragged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
exit.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void clockMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clockMouseMoved
exit.setVisible(true);
            
    }//GEN-LAST:event_clockMouseMoved

    private void exitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseReleased
System.exit(0);
    }//GEN-LAST:event_exitMouseReleased

    private void exitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseMoved
exit.setVisible(true);
    }//GEN-LAST:event_exitMouseMoved

    private void clearMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseMoved
exit.setVisible(false);
    }//GEN-LAST:event_clearMouseMoved

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
lastX = evt.getXOnScreen();
lastY = evt.getYOnScreen();
    }//GEN-LAST:event_dragMousePressed

    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            setLocation(getLocationOnScreen().x + x - lastX,getLocationOnScreen().y + y - lastY);
            lastX = x;
            lastY = y;
            w.writeWall((lastX)+"",(lastY)+"");
    }//GEN-LAST:event_dragMouseDragged

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
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Clock dialog = new Clock(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                exit.setVisible(false);
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clear;
    private javax.swing.JLabel clock;
    private javax.swing.JLabel drag;
    public static javax.swing.JLabel exit;
    private javax.swing.JLabel hour1;
    private javax.swing.JLabel minute;
    private javax.swing.JLabel second;
    // End of variables declaration//GEN-END:variables
}
