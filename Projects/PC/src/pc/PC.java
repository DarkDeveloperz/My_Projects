/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc;

/**
 *
 * @author akash
 */
public class PC {
public static byte a=1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                shut dialog = new shut(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.exit.setVisible(false);
                dialog.setVisible(true);
            }
        });
    }   
}
