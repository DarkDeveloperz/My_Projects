/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

/**
 *
 * @author akash
 */
public class SEARCH {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                searchresult dialog = new searchresult(new javax.swing.JFrame(), true);
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
}
