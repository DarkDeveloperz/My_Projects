/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author akash
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        wall w = new wall();
        int x = w.readWall();
        if(x==0)
        {
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cal dialog = new Cal(new javax.swing.JFrame(), true);
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
        if(x==1)
        {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                small dialog = new small(new javax.swing.JFrame(), true);
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
    
}
