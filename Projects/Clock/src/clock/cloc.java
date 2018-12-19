/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.*;
import static clock.Clock.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author akash
 */
public class cloc extends javax.swing.JDialog {
    int timerun = 0;
    int lastX, lastY;  
    byte i=1;
    byte j=1;
    wall w;
    
    /**
     * Creates new form cloc
     */
    public cloc(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try
        {
        initComponents();
        //this.setResizable(true);
        setBackground(new Color(0,0,0,0)); 
        w = new wall();
        int[] x = w.readwall();
        this.setLocation(x[0],x[1]);
new Thread()
{
@Override
public void run()
{
while(timerun==0)
{
audio(1);   
    try {  
        Thread.sleep(1000);
    } catch (InterruptedException ex) {
    }
}   
}
}.start();

        new Thread()
        {
            public void run()
        {
           while (timerun == 0) 
        {
            Calendar cal = new GregorianCalendar();
            java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
            int hour = cal.get(Calendar.HOUR);
            int min = cal.get(Calendar.MINUTE);
            int sec = cal.get(Calendar.SECOND);
            int AM_PM = cal.get(Calendar.AM_PM);
            int month = cal.get(Calendar.MONTH);
            int day = cal.get(Calendar.DAY_OF_WEEK);
            switch(month)
            {
                case 0: lb6.setIcon(new ImageIcon("./resources/audio/month/janruary.png"));
                    break;
                case 1: lb6.setIcon(new ImageIcon("./resources/audio/month/february.png"));
                    break;
                case 2: lb6.setIcon(new ImageIcon("./resources/audio/month/march.png"));
                    break;
                case 3: lb6.setIcon(new ImageIcon("./resources/audio/month/april.png"));
                    break;
                case 4: lb6.setIcon(new ImageIcon("./resources/audio/month/may.png"));
                    break;
                case 5: lb6.setIcon(new ImageIcon("./resources/audio/month/june.png"));
                    break;
                case 6: lb6.setIcon(new ImageIcon("./resources/audio/month/july.png"));
                    break;
                case 7: lb6.setIcon(new ImageIcon("./resources/audio/month/august.png"));
                    break;
                case 8: lb6.setIcon(new ImageIcon("./resources/audio/month/september.png"));
                    break;
                case 9: lb6.setIcon(new ImageIcon("./resources/audio/month/october.png"));
                    break;
                case 10: lb6.setIcon(new ImageIcon("./resources/audio/month/november.png"));
                    break;
                case 11: lb6.setIcon(new ImageIcon("./resources/audio/month/december.png"));
            }
            switch(day)
            {
                case 1 : lb3.setIcon(new ImageIcon("./resources/audio/day/sunday.png"));
                    break;
                case 2 : lb3.setIcon(new ImageIcon("./resources/audio/day/monday.png"));
                    break;
                case 3 : lb3.setIcon(new ImageIcon("./resources/audio/day/tuesday.png"));
                    break;
                case 4 : lb3.setIcon(new ImageIcon("./resources/audio/day/wednesday.png"));
                    break;
                case 5 : lb3.setIcon(new ImageIcon("./resources/audio/day/thursday.png"));
                    break;
                case 6 : lb3.setIcon(new ImageIcon("./resources/audio/day/friday.png"));
                    break;
                 case 7 : lb3.setIcon(new ImageIcon("./resources/audio/day/saturday.png"));
            }
            lb5.setText(date+"");
            String dn = null;
            if(AM_PM == 1)
        {
            dn = "PM";
        }
            else
        {
            dn = "AM";
        }
            if(dn.equals("PM") && hour == 0)
            {
            String time = 12 + " : " + min + " : " + sec + "  " + dn;
            clock.setText(time);
            }
            else
            {
            String time = hour + " : " + min + " : " + sec + "  " + dn;
            clock.setText(time);
            }
             
            

if(i == 0)
{
lb9.setVisible(true);
try
{
int h =Integer.parseInt(tf2.getText());
int m =Integer.parseInt(tf4.getText());
if (h == hour && m == min && tf3.getText().equals(dn))
{
audio(3);   
Thread.sleep(15000);
j++;
}
if(j==5)
{
    i=1;
    j=0;
        tf2.setText("00");
        tf4.setText("00");
        tf3.setText("AM");
        tf2.setVisible(false);
        tf3.setVisible(false);
        tf4.setVisible(false);
        lb8.setVisible(false);
        tf7.setVisible(false);
        lb9.setVisible(false);
}
}
catch(Exception e)
{
}
}
        }
        }
        }.start();
        }
        catch(Exception e)
        {     
        }    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf7 = new javax.swing.JLabel();
        tf3b2 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        tf3b1 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        tf3b = new javax.swing.JLabel();
        set = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        tf2b = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf7.setFont(new java.awt.Font("Arabic Typesetting", 2, 18)); // NOI18N
        tf7.setForeground(new java.awt.Color(51, 255, 0));
        tf7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tf7.setText("SET");
        tf7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tf7MouseReleased(evt);
            }
        });
        getContentPane().add(tf7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 30, -1));

        tf3b2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tf3b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clock/block.png"))); // NOI18N
        getContentPane().add(tf3b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 70, 20));

        lb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clock/1.png"))); // NOI18N
        lb7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb7MouseClicked(evt);
            }
        });
        getContentPane().add(lb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 30, 30));

        lb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clock/c1.png"))); // NOI18N
        lb4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb4MouseClicked(evt);
            }
        });
        getContentPane().add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 30, 30));

        tf4.setFont(new java.awt.Font("Arabic Typesetting", 2, 18)); // NOI18N
        tf4.setForeground(new java.awt.Color(51, 255, 51));
        tf4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf4.setText("00");
        tf4.setBorder(null);
        tf4.setOpaque(false);
        tf4.setSelectedTextColor(new java.awt.Color(255, 0, 0));
        tf4.setSelectionColor(new java.awt.Color(0, 0, 0));
        tf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf4ActionPerformed(evt);
            }
        });
        getContentPane().add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 30, 20));

        tf3b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clock/block.png"))); // NOI18N
        getContentPane().add(tf3b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 70, 20));

        tf3.setFont(new java.awt.Font("Arabic Typesetting", 0, 18)); // NOI18N
        tf3.setForeground(new java.awt.Color(51, 255, 51));
        tf3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf3.setText("AM");
        tf3.setBorder(null);
        tf3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf3.setOpaque(false);
        tf3.setSelectedTextColor(new java.awt.Color(255, 0, 0));
        tf3.setSelectionColor(new java.awt.Color(0, 0, 0));
        tf3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf3MouseClicked(evt);
            }
        });
        getContentPane().add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 40, 20));

        tf3b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tf3b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clock/block.png"))); // NOI18N
        getContentPane().add(tf3b, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 60, 20));

        set.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        set.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setMouseClicked(evt);
            }
        });
        getContentPane().add(set, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 20, 30));

        lb3.setFont(new java.awt.Font("Digital-7", 0, 14)); // NOI18N
        lb3.setForeground(new java.awt.Color(0, 204, 0));
        lb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 180, 100));

        lb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb1MouseClicked(evt);
            }
        });
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 20, 20));

        lb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clock/cross.png"))); // NOI18N
        lb9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb9MouseClicked(evt);
            }
        });
        getContentPane().add(lb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 30));

        lb6.setBackground(new java.awt.Color(204, 204, 204));
        lb6.setFont(new java.awt.Font("Arabic Typesetting", 2, 24)); // NOI18N
        lb6.setForeground(new java.awt.Color(0, 204, 0));
        lb6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 20));

        lb8.setFont(new java.awt.Font("Digital-7", 1, 14)); // NOI18N
        lb8.setForeground(new java.awt.Color(153, 153, 153));
        lb8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clock/b1.png"))); // NOI18N
        lb8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 60, 20));

        tf2.setFont(new java.awt.Font("Arabic Typesetting", 2, 18)); // NOI18N
        tf2.setForeground(new java.awt.Color(51, 255, 51));
        tf2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf2.setText("00");
        tf2.setBorder(null);
        tf2.setOpaque(false);
        tf2.setSelectedTextColor(new java.awt.Color(255, 0, 0));
        tf2.setSelectionColor(new java.awt.Color(0, 0, 0));
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        getContentPane().add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 30, 20));

        tf2b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clock/block.png"))); // NOI18N
        getContentPane().add(tf2b, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, 20));

        lb5.setFont(new java.awt.Font("Arabic Typesetting", 2, 14)); // NOI18N
        lb5.setForeground(new java.awt.Color(102, 204, 0));
        getContentPane().add(lb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, 20));

        clock.setBackground(new java.awt.Color(0, 0, 0));
        clock.setFont(new java.awt.Font("Arabic Typesetting", 2, 30)); // NOI18N
        clock.setForeground(new java.awt.Color(102, 204, 0));
        clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clock.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 210, 40));

        img.setBackground(new java.awt.Color(0, 0, 0));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clock/virtualclock2new.png"))); // NOI18N
        img.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        img.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                imgMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imgMouseMoved(evt);
            }
        });
        img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgMousePressed(evt);
            }
        });
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 140));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lb7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb7MouseClicked
        try
        {
            new Thread()
            {
                public void run()
                {
                    if(a==0)
                    {
                        a=1;
                        lb7.setIcon(new ImageIcon("./resources/audio/2.png"));
                    }
                    else
                    {
                        a=0;
                        lb7.setIcon(new ImageIcon("./resources/audio/1.png"));
                    }
                }
            }.start();
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_lb7MouseClicked

    private void imgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMouseDragged
   try
        {
            new Thread()
            {
                public void run()
                {
                    int x = evt.getXOnScreen();
                    int y = evt.getYOnScreen();
                    setLocation(getLocationOnScreen().x + x - lastX,getLocationOnScreen().y + y - lastY);
                    lastX = x;
                    lastY = y;
                 w.writeWall((lastX)+"",(lastY)+"");
                }
            }.start();
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_imgMouseDragged

    private void imgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMouseMoved

    }//GEN-LAST:event_imgMouseMoved

    private void imgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMousePressed
        lastX = evt.getXOnScreen();
        lastY = evt.getYOnScreen();
    }//GEN-LAST:event_imgMousePressed

    private void lb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb1MouseClicked
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
    }//GEN-LAST:event_lb1MouseClicked

    private void setMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setMouseClicked
        try
        {
            new Thread()
            {
                public void run()
                {
                    b++;
                    if(b%2 != 0)
                    {
                        lb7.setVisible(true);
                        lb4.setVisible(true);
                    }
                    else
                    {
                        lb7.setVisible(false);
                        lb4.setVisible(false);
                        tf4.setVisible(false);
                        tf2.setVisible(false);
                        tf3.setVisible(false);
                        lb8.setVisible(false);
                        tf7.setVisible(false);
tf2b.setVisible(false);
tf3b1.setVisible(false);
tf3b2.setVisible(false);
tf3b.setVisible(false);
                        c=0;
                    }
                }
            }.start();
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_setMouseClicked

    private void lb9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb9MouseClicked
        try
        {
            new Thread()
            {
                public void run()
                {
                    i=1;
                    j=0;
                    tf2.setText("00");
                    tf4.setText("00");
                    tf3.setText("AM");
                    tf2.setVisible(false);
                    tf3.setVisible(false);
                    tf4.setVisible(false);
                    lb8.setVisible(false);
                    tf7.setVisible(false);
                    lb9.setVisible(false);
                    d=1;
                    JOptionPane.showMessageDialog(null, "ALARAM CANCELED");
                }
            }.start();
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_lb9MouseClicked

    private void tf3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf3MouseClicked
        if(tf3.getText().equals("AM"))
        {
            tf3.setText("PM");
        }
        else
        {
            tf3.setText("AM");
        }
    }//GEN-LAST:event_tf3MouseClicked

    private void lb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb4MouseClicked
        try
        {
            new Thread()
            {
                public void run()
                {
                    c++;
                    if(c %2 == 1)
                    {
                        tf4.setVisible(true);
                        tf2.setVisible(true);
                        tf3.setVisible(true);
                        lb8.setVisible(true);
                        tf7.setVisible(true);
tf2b.setVisible(true);
tf3b1.setVisible(true);
tf3b2.setVisible(true);
tf3b.setVisible(true);
                    }
                    else
                    {
                        tf4.setVisible(false);
                        tf2.setVisible(false);
                        tf3.setVisible(false);
                        lb8.setVisible(false);
                        tf7.setVisible(false);
tf2b.setVisible(false);
tf3b1.setVisible(false);
tf3b2.setVisible(false);
tf3b.setVisible(false);
                    }
                }
            }.start();
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_lb4MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
this.setOpacity(0);
lb8.setVisible(false);
tf4.setVisible(false);
tf2.setVisible(false);
tf3.setVisible(false);
lb7.setVisible(false);
lb4.setVisible(false);
tf7.setVisible(false);
lb9.setVisible(false);
tf2b.setVisible(false);
tf3b1.setVisible(false);
tf3b2.setVisible(false);
tf3b.setVisible(false);
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

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed

    }//GEN-LAST:event_tf2ActionPerformed

    private void tf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf4ActionPerformed

    private void tf7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf7MouseReleased
try
        {
            new Thread()
            {
                public void run()
                {
                    tf2.setVisible(false);
                    tf3.setVisible(false);
                    tf7.setVisible(false);
                    tf4.setVisible(false);
                    lb8.setVisible(false);
tf2b.setVisible(false);
tf3b1.setVisible(false);
tf3b2.setVisible(false);
tf3b.setVisible(false);
                    if(tf2.getText().length() !=0 && tf2.getText().length() <=2 && Integer.parseInt(tf2.getText())<=12 && tf4.getText().length() !=0 && tf4.getText().length() <=2 && Integer.parseInt(tf4.getText())<60)
                    {
                        JOptionPane.showMessageDialog(null,"ALARM SAVED");
                        i=0;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"ALARM NOT SAVED");
                    }
                }
            }.start();
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_tf7MouseReleased

    private void imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMouseClicked

    }//GEN-LAST:event_imgMouseClicked
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
            java.util.logging.Logger.getLogger(cloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cloc dialog = new cloc(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel clock;
    private javax.swing.JLabel img;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JLabel set;
    private javax.swing.JTextField tf2;
    private javax.swing.JLabel tf2b;
    private javax.swing.JTextField tf3;
    private javax.swing.JLabel tf3b;
    private javax.swing.JLabel tf3b1;
    private javax.swing.JLabel tf3b2;
    private javax.swing.JTextField tf4;
    private javax.swing.JLabel tf7;
    // End of variables declaration//GEN-END:variables
}
