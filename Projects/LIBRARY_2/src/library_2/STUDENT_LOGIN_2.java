/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_2;

import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import static library_2.LIBRARY_2.audio;

/**
 *
 * @author akash
 */

public class STUDENT_LOGIN_2 extends javax.swing.JFrame {
 
String s3;
   byte b=3,c=0;
private void fn1(int d)
{
if (d==13)
{
pf1.requestFocus();
c=0;
b=0;
}
}
    /**
     * Creates new form STUDENT_LOGIN_2
     */
    public STUDENT_LOGIN_2() {
        initComponents();
        setIcon();
pf1.setEchoChar('~');
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        lb2 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        pf1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(575, 220));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/save.png"))); // NOI18N
        jButton1.setText("PROCEED");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(440, 50, 129, 20);

        jLabel1.setFont(new java.awt.Font("DigifaceWide", 3, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/manage.png"))); // NOI18N
        jLabel1.setText("ENTER YOUR REGISTRATION NUMBER ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 430, 22);

        tf1.setBackground(new java.awt.Color(204, 204, 255));
        tf1.setFont(new java.awt.Font("Malgun Gothic", 3, 12)); // NOI18N
        tf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf1FocusGained(evt);
            }
        });
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf1KeyReleased(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(20, 27, 400, 23);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton3.setText("2");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(170, 100, 110, 17);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton2.setText("1");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 100, 110, 17);

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton4.setText("3");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(310, 100, 110, 17);

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton6.setText("5");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(170, 130, 110, 17);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton5.setText("4");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(20, 130, 110, 17);

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton7.setText("6");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(310, 130, 110, 17);

        jButton9.setBackground(new java.awt.Color(102, 102, 102));
        jButton9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton9.setText("8");
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(170, 160, 110, 17);

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton8.setText("7");
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(20, 160, 110, 17);

        jButton10.setBackground(new java.awt.Color(102, 102, 102));
        jButton10.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton10.setText("9");
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(310, 160, 110, 17);

        jButton11.setBackground(new java.awt.Color(102, 102, 102));
        jButton11.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton11.setText("0");
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(170, 190, 110, 17);

        jButton13.setBackground(new java.awt.Color(102, 102, 102));
        jButton13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/exit.png"))); // NOI18N
        jButton13.setText("EXIT");
        jButton13.setBorder(null);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(440, 150, 129, 20);

        lb2.setFont(new java.awt.Font("DigifaceWide", 3, 18)); // NOI18N
        lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/greenfile.png"))); // NOI18N
        lb2.setText("ENTER YOUR PASSWORD");
        getContentPane().add(lb2);
        lb2.setBounds(20, 50, 330, 22);

        jButton14.setBackground(new java.awt.Color(102, 102, 102));
        jButton14.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/clear.png"))); // NOI18N
        jButton14.setText("CLEAR");
        jButton14.setBorder(null);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(440, 100, 129, 20);

        pf1.setBackground(new java.awt.Color(204, 204, 255));
        pf1.setMinimumSize(new java.awt.Dimension(6, 23));
        getContentPane().add(pf1);
        pf1.setBounds(20, 70, 400, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/00.png"))); // NOI18N
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 580, 220);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try
{
    audio(32);
        if(LOGIN_AS.c==1)
{
        try{
           String s1,s2,s3,s4;
           boolean b=false;
           s1=tf1.getText();
           s3=pf1.getText();
       ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from STUDENT_REG_NO");
       while(rs.next())
       {
           s2=rs.getString("REG_NO");
           s4=rs.getString("PASSWORD");
           if(s1.equals(s2) && s3.equals(s4))
           {
               b=true;
               setVisible(false);
               java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SELECT().setVisible(true);
            }
        });
           }
       }
        if(!b)
       {
audio(5);
 javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALID REGESTRATION NUMBER AND PASSWORD");
       tf1.requestFocus();
       }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e.getMessage());
       }
}

if(LOGIN_AS.c==2)
{
        try{
           String s1,s2,s3,s4;
           boolean b=false;
           s1=tf1.getText();
           s3=pf1.getText();
       ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from TEACHER_REG_NO");
       while(rs.next())
       {
           s2=rs.getString("REG_NO");
           s4=rs.getString("PASSWORD");
           if(s1.equals(s2) && s3.equals(s4))
           {
               b=true;
               setVisible(false);
               java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SELECT().setVisible(true);
            }
        });
           }
       }
        if(!b)
       {
audio(5);
 javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALID REGESTRATION NUMBER AND PASSWORD");
       tf1.requestFocus();
       }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e.getMessage());
       }
}

if(LOGIN_AS.c==3)
{
        try{
           String s1,s2,s3,s4;
           boolean b=false;
           s1=tf1.getText();
           s3=pf1.getText();
       ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from INCHARGE_REG_NO");
       while(rs.next())
       {
           s2=rs.getString("REG_NO");
           s4=rs.getString("PASSWORD");
           if(s1.equals(s2) && s3.equals(s4))
           {
               b=true;
               setVisible(false);
               java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BOOK_RECORD().setVisible(true);
            }
        });
           }
       }
        if(!b)
       {
audio(5);
 javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALID REGESTRATION NUMBER AND PASSWORD");
       tf1.requestFocus();
       }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e.getMessage());
       }
}
if(LOGIN_AS.c==4)
{
        try{
           String s1,s2,s3,s4;
           boolean b=false;
           s1=tf1.getText();
           s3=pf1.getText();
       ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from AO_REG_NO");
       while(rs.next())
       {
           s2=rs.getString("REG_NO");
           s4=rs.getString("PASSWORD");
           if(s1.equals(s2) && s3.equals(s4))
           {
               b=true;
               setVisible(false);
               java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ACCOUNT_OFFICE().setVisible(true);
            }
        });
           }
       }
        if(!b)
       {
audio(5);
 javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALID REGESTRATION NUMBER AND PASSWORD");
      tf1.requestFocus();
       }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e.getMessage());
       }
}
if(LOGIN_AS.c==5)
{
        try{
           String s1,s2,s3,s4;
           boolean b=false;
           s1=tf1.getText();
           s3=pf1.getText();
       ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from management_reg_no");
       while(rs.next())
       {
           s2=rs.getString("REG_NO");
           s4=rs.getString("PASSWORD");
           if(s1.equals(s2) && s3.equals(s4))
           {
               b=true;
               setVisible(false);
               java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MANAGEMENT().setVisible(true);
            }
        });
           }
       }
        if(!b)
       {
audio(5);
 javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALID REGESTRATION NUMBER AND PASSWORD");
       tf1.requestFocus();
       }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e.getMessage());
       }
}
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
    e.printStackTrace();
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
try
{
   jButton1.setIconTextGap(10);
   jButton14.setIconTextGap(20);
   jButton13.setIconTextGap(20);

        tf1.requestFocus();
       if(tf1.isFocusOwner()==true)
        {
            b=1;
        }
audio(4);
        if (LOGIN_AS.c==1)
        {
    tf1.setText("RA");
    s3="RA";
        }
if (LOGIN_AS.c==2)
{
    tf1.setText("TR");
    s3="TR";
}
if (LOGIN_AS.c==3)
{
    tf1.setText("LI");
    s3="LI";
}
if (LOGIN_AS.c==4)
{
    tf1.setText("AO");
    s3="AO";
}
if (LOGIN_AS.c==5)
{
    tf1.setText("MT");
    s3="MT";
}
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
audio(32);
        if(b==0)
{
    pf1.setText(pf1.getText()+"1");
}
else
{
    tf1.setText(tf1.getText()+"1");
    c++;
    fn1(c);
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
audio(32);
        if(b==0)
{
    pf1.setText(pf1.getText()+"2");
}
else
{
    tf1.setText(tf1.getText()+"2");
    c++;
    fn1(c);
}       // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
audio(32);
        if(b==0)
{
    pf1.setText(pf1.getText()+"3");
}
else
{
    tf1.setText(tf1.getText()+"3");
    c++;
    fn1(c);
}      // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
audio(32);
        if(b==0)
{
    pf1.setText(pf1.getText()+"4");
}
else
{
    tf1.setText(tf1.getText()+"4");
    c++;
    fn1(c);
}       // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
audio(32);
        if(b==0)
{
    pf1.setText(pf1.getText()+"5");
}
else
{
    tf1.setText(tf1.getText()+"5");
    c++;
    fn1(c);
}       // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
audio(32);
        if(b==0)
{
    pf1.setText(pf1.getText()+"6");
}
else
{
    tf1.setText(tf1.getText()+"6");
    c++;
    fn1(c);
}      // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
audio(32);
        if(b==0)
{
    pf1.setText(pf1.getText()+"7");
}
else
{
    tf1.setText(tf1.getText()+"7");
    c++;
    fn1(c);
}       // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
audio(32);
        if(b==0)
{
    pf1.setText(pf1.getText()+"8");
}
else
{
    tf1.setText(tf1.getText()+"8");
    c++;
    fn1(c);
}       // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
audio(32);
        if(b==0)
{
    pf1.setText(pf1.getText()+"9");
}
else
{
    tf1.setText(tf1.getText()+"9");
    c++;
    fn1(c);
}      // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
audio(32);
        if(b==0)
{
    pf1.setText(pf1.getText()+"0");
}
else
{
    tf1.setText(tf1.getText()+"0");
    c++;
    fn1(c);
}       // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
pf1.setText("");
        tf1.setText(s3);
        tf1.requestFocus();
        b=1;
        audio(32);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
setVisible(false);
audio(32);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_AS().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton13ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed

    }//GEN-LAST:event_tf1ActionPerformed

    private void tf1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyReleased
if(tf1.getText().length()==15)
{
    pf1.requestFocus();
    b=0;
}
    }//GEN-LAST:event_tf1KeyReleased

    private void tf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusGained

    }//GEN-LAST:event_tf1FocusGained

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
this.setLocation(evt.getLocationOnScreen());        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseDragged

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
            java.util.logging.Logger.getLogger(STUDENT_LOGIN_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STUDENT_LOGIN_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STUDENT_LOGIN_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STUDENT_LOGIN_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STUDENT_LOGIN_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb2;
    private javax.swing.JPasswordField pf1;
    public static javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
