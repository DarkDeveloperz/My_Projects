/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_2;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Calendar;
import static library_2.LIBRARY_2.audio;

/**
 *
 * @author akash
 */
public class RENEW extends javax.swing.JFrame {
 public static byte c=0;
 int sa;
 int count=0;
 byte d=0;
 public static  int a=0;

    public void count(byte d)
    {
        if(d==4)
        {
            byte g=0;
        try{
              
       ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from books");
       while(rs.next())
       {
           if(tf1.getText().equals(rs.getString("b_id")))
           {
               g=1;
               tf2.setText(rs.getString("book_name"));
           }
       }
        }
       catch(Exception e)
               {
               }
        if(g==0 && d==4)
       {
           tf1.requestFocus();
audio(8);
javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALID BOOK_ID");
       tf1.requestFocus();
       tf1.setText("");
       tf2.setText("");
       c=0;
       tf1.requestFocus();
        }
        }
    }
    
    public void count1(byte e)
    {
     if(e>4)   
     {
audio(8);
    javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALID BOOK_ID");
       tf1.setText("");
       tf2.setText("");
       c=0;
          tf1.requestFocus();
     }
    }
    /**
     * Creates new form RENEW
     */
    public RENEW() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(740, 230));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("DigifaceWide", 3, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/books.png"))); // NOI18N
        jLabel1.setText("BOOK ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 10, 90, 18);

        tf1.setBackground(new java.awt.Color(204, 204, 255));
        tf1.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        getContentPane().add(tf1);
        tf1.setBounds(10, 36, 210, 21);

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton3.setText("2");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(70, 70, 90, 17);

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton2.setText("3");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(140, 60, 80, 17);

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton5.setText("5");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(70, 100, 90, 17);

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton4.setText("4");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 90, 80, 17);

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton6.setText("6");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(140, 90, 80, 17);

        jButton8.setBackground(new java.awt.Color(153, 153, 153));
        jButton8.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton8.setText("8");
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(70, 130, 90, 17);

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton7.setText("7");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(10, 120, 80, 17);

        jButton9.setBackground(new java.awt.Color(153, 153, 153));
        jButton9.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton9.setText("9");
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(140, 120, 80, 17);

        jButton10.setBackground(new java.awt.Color(153, 153, 153));
        jButton10.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton10.setText("0");
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(70, 160, 90, 17);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton1.setText("1");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 60, 80, 17);

        ta1.setBackground(new java.awt.Color(204, 204, 255));
        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane1.setViewportView(ta1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(380, 40, 350, 180);

        jLabel2.setFont(new java.awt.Font("DigifaceWide", 3, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/books.png"))); // NOI18N
        jLabel2.setText("BOOK NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 180, 130, 18);

        tf2.setBackground(new java.awt.Color(204, 204, 255));
        tf2.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        getContentPane().add(tf2);
        tf2.setBounds(10, 200, 350, 21);

        jButton11.setBackground(new java.awt.Color(153, 153, 153));
        jButton11.setFont(new java.awt.Font("DigifaceWide", 3, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/color.png"))); // NOI18N
        jButton11.setText("BACK");
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(230, 120, 130, 19);

        jButton12.setBackground(new java.awt.Color(153, 153, 153));
        jButton12.setFont(new java.awt.Font("DigifaceWide", 3, 14)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/exit.png"))); // NOI18N
        jButton12.setText("LOGOUT");
        jButton12.setBorder(null);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(230, 160, 130, 19);

        jButton13.setBackground(new java.awt.Color(153, 153, 153));
        jButton13.setFont(new java.awt.Font("DigifaceWide", 3, 14)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/save.png"))); // NOI18N
        jButton13.setText("RENEW");
        jButton13.setBorder(null);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(230, 40, 130, 19);

        jButton15.setBackground(new java.awt.Color(153, 153, 153));
        jButton15.setFont(new java.awt.Font("DigifaceWide", 3, 14)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/clear.png"))); // NOI18N
        jButton15.setText("CLEAR");
        jButton15.setBorder(null);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(230, 80, 130, 19);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/Un.png"))); // NOI18N
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 750, 240);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tf1.setText(tf1.getText()+"1");
        c++;
        count(c);
        count1(c);      
        audio(32);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 tf1.setText(tf1.getText()+"3");
        c++;
        count(c);
        count1(c);   
        audio(32);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 tf1.setText(tf1.getText()+"2");
        c++;
        count(c);
        count1(c); 
        audio(32);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 tf1.setText(tf1.getText()+"4");
        c++;
        count(c);
        count1(c);   
        audio(32);// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 tf1.setText(tf1.getText()+"5");
        c++;
        count(c);
        count1(c); 
        audio(32);// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 tf1.setText(tf1.getText()+"6");
        c++;
        count(c);
        count1(c);  
        audio(32);// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 tf1.setText(tf1.getText()+"7");
        c++;
        count(c);
        count1(c); 
        audio(32);// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 tf1.setText(tf1.getText()+"8");
        c++;
        count(c);
        count1(c); 
        audio(32);// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 tf1.setText(tf1.getText()+"9");
        c++;
        count(c);
        count1(c);  
        audio(32);// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
 tf1.setText(tf1.getText()+"0");
        c++;
        count(c);
        count1(c);  
        audio(32);// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
audio(7);
jButton11.setIconTextGap(35);
jButton13.setIconTextGap(25);
jButton15.setIconTextGap(25);
jButton12.setIconTextGap(15);
    }//GEN-LAST:event_formWindowOpened

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
setVisible(false);
audio(32);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SELECT().setVisible(true);
            }
        });   
        c=0;
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
audio(32);
        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_AS().setVisible(true);
            }
        });   
        c=0;        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
tf1.setText(null);
c=0;
tf2.setText(null);
audio(32);// TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
try
{
    audio(32);
        byte z=0;
        try
{
String s1 = STUDENT_LOGIN_2.tf1.getText();

 ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from fine");
 while(rs.next())
       {
         String  s3=rs.getString("regestration_no");

         if(s1.equals(s3))
           {
           z=1;  
           if(d==0)
           {
audio(23);
    JOptionPane.showMessageDialog(null, "FIRST CLEAR YOUR DUES");
tf1.setText(null);
tf2.setText("");
c=0;
d=1;
           }
           }
       }
 
}
catch (Exception e)
{
    
           }
        if(z==0)
        {
        byte g=0;
        if (c < 4)
{
audio(8);
    JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALID BOOK_ID");
tf1.setText(null);
tf2.setText("");
}
else
 {
     try
    {
        String s1,s3,s4,s5,s6,s7;
           s1=STUDENT_LOGIN_2.tf1.getText();          
           s7="RENEWED";
           s5=tf1.getText();
       ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from renewed_book_details");
       while(rs.next())
       {
           s3=rs.getString("regestration_no");
           s4=rs.getString("type");
           s6=rs.getString("book_id");
           if(s1.equals(s3)&& s4.equals(s7)&& s5.equals(s6))
           {
        g=1;
           }
       }
       if(g==0)
       {
audio(8);
    /* */         javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALID BOOK_ID");
       tf1.setText("");
       tf2.setText("");
       c=0;
          tf1.requestFocus();
       }
    }
     catch(Exception e)
     {
         
     }
     if(g==1)
     {
     try
    {
        String s1,s3,s4,s5,s6,s7;
           s1=STUDENT_LOGIN_2.tf1.getText();
          
           s7="RENEWED";
           s5=tf1.getText();
       ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from renewed_book_details");
       while(rs.next())
       {
           s3=rs.getString("regestration_no");
           s4=rs.getString("type");
           s6=rs.getString("book_id");
           if(s1.equals(s3)&& s4.equals(s7)&& s5.equals(s6))
           {
        count++;
           }
       }
       a=count;
       count=0;
       if(a<4)
       {
        Calendar cal = Calendar.getInstance();
try
{
    Calendar cal1 = Calendar.getInstance();
    cal1.add(Calendar.DATE, 15);
String a1=cal1.getTime().toString();
String sql1="update issued_book_details set type='RENEWED' where regestration_no='"+STUDENT_LOGIN_2.tf1.getText()+"'and book_id='"+tf1.getText()+"'";
String sql2="update issued_book_details set due_date='"+a1+"' where regestration_no='"+STUDENT_LOGIN_2.tf1.getText()+"'and book_id='"+tf1.getText()+"'and type = 'RENEWED'";
PreparedStatement pst1 = null;
PreparedStatement pst2 = null;
pst1 = LIBRARY_2.conn.prepareStatement(sql1);
pst2 = LIBRARY_2.conn.prepareStatement(sql2);
pst1.execute();
pst2.execute();
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null,e.getMessage());
}
        try{
            
              ResultSet rs2=LIBRARY_2.stmt.executeQuery("select * from renewed_book_details");
       while(rs2.next())
       {
         sa=rs2.getInt("s_no");
       }
        String reg= STUDENT_LOGIN_2.tf1.getText();
String name = SELECT.lb1.getText().replaceFirst("WELCOME", "");
String bid = tf1.getText();
String bname = tf2.getText();
PreparedStatement st = null;
st=LIBRARY_2.conn.prepareStatement("insert into renewed_book_details(s_no,renewed_by,book_name,book_id,regestration_no,date,time,type) values(?,?,?,?,?,?,?,?)");
st.setInt(1,(++sa));
st.setString(2, name);
st.setString(3, bname);
st.setString(4, bid);
st.setString(5, reg);
java.sql.Date sqldate = new java.sql.Date(new java.util.Date().getTime());
st.setDate(6, sqldate);
java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
st.setTimestamp(7, date);
st.setString(8, "RENEWED");
st.executeUpdate();
        }
        catch(Exception e)
        {
       
        }
 ta1.append("\n-------------------------------------------------------------------------------");
ta1.append("\n COLLEGE                            :  SRM UNIVERSITY");
ta1.append("\n SERIAL NUMBER               :  " +(sa));
ta1.append("\n BOOK ISSUED TO              : "+SELECT.lb1.getText().replaceFirst("WELCOME",""));
ta1.append("\n REGESTRATION NO          :  "+STUDENT_LOGIN_2.tf1.getText());
ta1.append("\n BOOK NAME                        :  "+tf2.getText());  
ta1.append("\n BOOK ID                               :  "+tf1.getText());      
ta1.append("\n RENEW DATE                    :  "+cal.getTime());
cal.add(Calendar.DATE, 14);
ta1.append("\n DUE DATE                           :  "+cal.getTime());
ta1.append("\n------------------------RENEW SUCCESSFULL--------------------------");
ta1.append("\n-------------------------------------------------------------------------------");
c=0; 
audio(14);
JOptionPane.showMessageDialog(null,"BOOK RENEWED SUCCESSFULLY");
tf1.setText("");
tf2.setText("");
       }
       else
       {
audio(12);    
JOptionPane.showMessageDialog(null,"YOU CAN NOT RENEW THIS BOOK ANY MORE, RETURN THIS BOOK");
tf1.setText(null);
tf2.setText(null);
c=0;    
       }
    }
     
       catch(Exception e)
               {
               
               }
     }
 }
        c=0;
        }
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}
d=0;
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
this.setLocation(evt.getLocationOnScreen());        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseDragged

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
            java.util.logging.Logger.getLogger(RENEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RENEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RENEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RENEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RENEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
