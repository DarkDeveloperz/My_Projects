/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch_run;

import java.awt.Color;
import java.io.File;
import java.io.InputStream;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author akash
 */
public class small extends javax.swing.JDialog {
    int lastX, lastY;
    String filename=null;
    /**
     * Creates new form small
     */
    public small(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
        ta1.setVisible(false);
        ta2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cross = new javax.swing.JLabel();
        ta2 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 30, 40));

        tf1.setFont(new java.awt.Font("Arabic Typesetting", 2, 14)); // NOI18N
        tf1.setForeground(new java.awt.Color(153, 153, 153));
        tf1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 280, 20));

        jLabel6.setFont(new java.awt.Font("Arabic Typesetting", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Select Batch File");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 190, 20));

        cross.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        cross.setForeground(new java.awt.Color(255, 0, 0));
        cross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cross.setText("X");
        cross.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crossMouseClicked(evt);
            }
        });
        getContentPane().add(cross, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 20, 20));

        ta2.setBackground(new java.awt.Color(0, 0, 0));
        ta2.setBorder(null);
        ta2.setForeground(new java.awt.Color(153, 153, 153));
        ta2.setAutoscrolls(true);
        ta2.setFont(new java.awt.Font("Arabic Typesetting", 2, 18)); // NOI18N
        ta2.setOpaque(false);

        ta1.setEditable(false);
        ta1.setColumns(20);
        ta1.setFont(new java.awt.Font("Arabic Typesetting", 2, 18)); // NOI18N
        ta1.setForeground(new java.awt.Color(255, 255, 255));
        ta1.setRows(5);
        ta1.setBorder(null);
        ta1.setOpaque(false);
        ta2.setViewportView(ta1);

        getContentPane().add(ta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batch_run/imageedit_3_9295397844.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 10, 30, 30));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batch_run/bat.png"))); // NOI18N
        img.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                imgMouseDragged(evt);
            }
        });
        img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                imgMouseReleased(evt);
            }
        });
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 150));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMousePressed
lastX = evt.getXOnScreen();
lastY = evt.getYOnScreen();
    }//GEN-LAST:event_imgMousePressed

    private void imgMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMouseReleased
            
    }//GEN-LAST:event_imgMouseReleased

    private void imgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMouseDragged
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            setLocation(getLocationOnScreen().x + x - lastX,getLocationOnScreen().y + y - lastY);
            lastX = x;
            lastY = y;
    }//GEN-LAST:event_imgMouseDragged

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged

    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Thread()
        {
            public void run()
            {
                try
                {
                    Process p = Runtime.getRuntime().exec(tf1.getText());
                    InputStream is = p.getInputStream();
                    int i = 0;
                    StringBuffer sb = new StringBuffer();
                    while((i=is.read()) !=-1)
                    {
                        sb.append((char) i);
                    }
                    ta1.setText(sb.toString());
                    ta1.setBackground(new Color(0,0,0,0));
                    ta2.getViewport().setOpaque(false);
                    ta1.setVisible(true);
                    ta2.setVisible(true);
                    cross.setVisible(true);
                }
                catch(Exception e)
                {

                }
            }
        }.start();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed

    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new Thread()
        {
            public void run()
            {
                try
                {
                    FileNameExtensionFilter filter = new FileNameExtensionFilter("Batch","bat");
                    JFileChooser c = new JFileChooser("D:/");
                    c.addChoosableFileFilter(filter);
                    int result = c.showSaveDialog(null);
                    if(result == JFileChooser.APPROVE_OPTION)
                    {
                        File f = c.getSelectedFile();
                        filename=f.getAbsolutePath();
                        tf1.setText(filename);
                    }
                }
                catch(Exception e)
                {

                }
            }
        }.start();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void crossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crossMouseClicked
        ta1.setVisible(false);
        ta2.setVisible(false);
        cross.setVisible(false);
        tf1.setText("");
    }//GEN-LAST:event_crossMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        try
        {
            this.setOpacity(1);
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
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
this.setOpacity(0);
ta1.setVisible(false);
ta2.setVisible(false);
cross.setVisible(false);        
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
} 
    }//GEN-LAST:event_formWindowOpened

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(small.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(small.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(small.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(small.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                small dialog = new small(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel cross;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextArea ta1;
    private javax.swing.JScrollPane ta2;
    private javax.swing.JLabel tf1;
    // End of variables declaration//GEN-END:variables
}
