/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_package;

import javax.swing.ImageIcon;

/**
 *
 * @author akash
 */
public class GUI extends javax.swing.JFrame {
    wall w;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        w = new wall();
        setwall sw = new setwall();
        sw.setwall();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wall1 = new javax.swing.JButton();
        wall2 = new javax.swing.JButton();
        wall3 = new javax.swing.JButton();
        wall4 = new javax.swing.JButton();
        wall5 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wall1.setText("wall5");
        wall1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wall1ActionPerformed(evt);
            }
        });
        getContentPane().add(wall1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        wall2.setText("wall2");
        wall2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wall2ActionPerformed(evt);
            }
        });
        getContentPane().add(wall2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        wall3.setText("wall3");
        wall3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wall3ActionPerformed(evt);
            }
        });
        getContentPane().add(wall3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        wall4.setText("wall4");
        wall4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wall4ActionPerformed(evt);
            }
        });
        getContentPane().add(wall4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        wall5.setText("wall1");
        wall5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wall5ActionPerformed(evt);
            }
        });
        getContentPane().add(wall5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void wall5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wall5ActionPerformed
ImageIcon  I1= new ImageIcon(getClass().getResource("/images/1.jpg"));
l1.setIcon(I1);
w.writeWall("wall1");
    }//GEN-LAST:event_wall5ActionPerformed

    private void wall2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wall2ActionPerformed
ImageIcon  I1= new ImageIcon(getClass().getResource("/images/06.jpg"));
l1.setIcon(I1); 
w.writeWall("wall2");// TODO add your handling code here:
    }//GEN-LAST:event_wall2ActionPerformed

    private void wall3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wall3ActionPerformed
ImageIcon  I1= new ImageIcon(getClass().getResource("/images/08.jpg"));
l1.setIcon(I1);    
w.writeWall("wall3");// TODO add your handling code here:
    }//GEN-LAST:event_wall3ActionPerformed

    private void wall4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wall4ActionPerformed
ImageIcon  I1= new ImageIcon(getClass().getResource("/images/09.jpg"));
l1.setIcon(I1);   
w.writeWall("wall4");// TODO add your handling code here:
    }//GEN-LAST:event_wall4ActionPerformed

    private void wall1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wall1ActionPerformed
ImageIcon  I1= new ImageIcon(getClass().getResource("/images/8.jpg"));
l1.setIcon(I1);    
w.writeWall("wall5");// TODO add your handling code here:
    }//GEN-LAST:event_wall1ActionPerformed

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
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel l1;
    private javax.swing.JButton wall1;
    private javax.swing.JButton wall2;
    private javax.swing.JButton wall3;
    private javax.swing.JButton wall4;
    private javax.swing.JButton wall5;
    // End of variables declaration//GEN-END:variables
}
