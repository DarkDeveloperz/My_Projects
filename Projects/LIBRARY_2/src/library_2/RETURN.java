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
public class RETURN extends javax.swing.JFrame {
    public static byte c=0;
   boolean b=false;
   static int sa=0;
   byte d=0;
    public void count(byte d)
    {
        if(d==4)
        {
        try{
              
       ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from books");
       while(rs.next())
       {
           if(tf1.getText().equals(rs.getString("b_id")))
           {
               b=true;
               tf2.setText(rs.getString("book_name"));
           }
       }
        }
       catch(Exception e)
               {
               }
        if(!b && d==4)
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
     * Creates new form RETURN
     */
    public RETURN() {
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
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jButton11 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(710, 215));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(710, 218));
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
        jLabel1.setBounds(60, 0, 100, 18);

        tf1.setBackground(new java.awt.Color(204, 204, 255));
        tf1.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        getContentPane().add(tf1);
        tf1.setBounds(10, 20, 184, 21);

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton2.setText("2");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 60, 60, 17);

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
        jButton1.setBounds(10, 50, 70, 17);

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/write.png"))); // NOI18N
        jButton3.setText("3");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(120, 50, 70, 17);

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
        jButton5.setBounds(70, 90, 60, 17);

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
        jButton4.setBounds(10, 80, 70, 17);

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
        jButton6.setBounds(120, 80, 70, 17);

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
        jButton8.setBounds(70, 120, 60, 17);

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
        jButton7.setBounds(10, 110, 70, 17);

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
        jButton9.setBounds(120, 110, 70, 17);

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
        jButton10.setBounds(70, 150, 61, 17);

        jLabel2.setFont(new java.awt.Font("DigifaceWide", 3, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/books.png"))); // NOI18N
        jLabel2.setText("BOOK NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 168, 130, 20);

        tf2.setBackground(new java.awt.Color(204, 204, 255));
        tf2.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        getContentPane().add(tf2);
        tf2.setBounds(10, 190, 330, 21);

        ta1.setBackground(new java.awt.Color(204, 204, 255));
        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane1.setViewportView(ta1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(350, 20, 350, 190);

        jButton11.setBackground(new java.awt.Color(153, 153, 153));
        jButton11.setFont(new java.awt.Font("DigifaceWide", 3, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/save.png"))); // NOI18N
        jButton11.setText("RETURN");
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(210, 20, 130, 20);

        jButton14.setBackground(new java.awt.Color(153, 153, 153));
        jButton14.setFont(new java.awt.Font("DigifaceWide", 3, 14)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/clear.png"))); // NOI18N
        jButton14.setText("CLEAR");
        jButton14.setBorder(null);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(210, 50, 130, 19);

        jButton15.setBackground(new java.awt.Color(153, 153, 153));
        jButton15.setFont(new java.awt.Font("DigifaceWide", 3, 14)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/exit.png"))); // NOI18N
        jButton15.setText("LOGOUT");
        jButton15.setBorder(null);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(210, 110, 130, 20);

        jButton16.setBackground(new java.awt.Color(153, 153, 153));
        jButton16.setFont(new java.awt.Font("DigifaceWide", 3, 14)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/color.png"))); // NOI18N
        jButton16.setText("BACK");
        jButton16.setBorder(null);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(210, 80, 130, 19);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/ak.png"))); // NOI18N
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 710, 260);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
audio(32);
        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_AS().setVisible(true);
            }
        });       // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
setVisible(false);
audio(32);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SELECT().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
tf1.setText(null);
tf2.setText(null);
c=0;
audio(32);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
tf1.setText(tf1.getText()+"1");
c++;
count(c);
count1(c);
audio(32);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
tf1.setText(tf1.getText()+"2");
c++;
count(c);
count1(c);   
audio(32);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
tf1.setText(tf1.getText()+"3");
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

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
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
        
        byte b=0;
    byte d=5;
    byte f=5;
    byte h=0;
        if (c < 4)
{
audio(8);
    JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALID BOOK_ID");
tf1.setText(null);
tf2.setText("");
//c=0;
}
else
{
    byte i=0;
        try{
           String s1,s2,s3,s4,a1,a2,s10;
           s1=STUDENT_LOGIN_2.tf1.getText();
           s2="ISSUED";
           s10="RENEWED";
           a1=tf1.getText();
       ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from issued_book_details");
       while(rs.next())
       {
           s3=rs.getString("regestration_no");
           s4=rs.getString("type");
           a2=rs.getString("book_id");
           if(s1.equals(s3)&& (s4.equals(s2) || s4.equals(s10)) && a1.equals(a2))
           {
               h=1;
               i=1;
try{
           String s5,s6,s7;
           String s8="UNAVAILABLE";
           s5=tf1.getText();
       ResultSet rs1=LIBRARY_2.stmt.executeQuery("select * from books");
       while(rs1.next())
       {
           s6=rs1.getString("b_id");
           s7=rs1.getString("status");
           if(s7.equals(s8) && s5.equals(s6))
           {
b=1;
d=1;

               Calendar cal = Calendar.getInstance();
try
{
 String s9="AVAILABLE";       
String sql = "update books set status='"+s9+"' where b_id='"+tf1.getText()+"'";

PreparedStatement pst = null;

pst = LIBRARY_2.conn.prepareStatement(sql);
pst.execute();
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null,e.getMessage());
}
        try{
            
              ResultSet rs2=LIBRARY_2.stmt.executeQuery("select * from returned_book_details");
       while(rs2.next())
       {
         sa=rs2.getInt("s_no");
       }
        String reg= STUDENT_LOGIN_2.tf1.getText();
String name = SELECT.lb1.getText().replaceFirst("WELCOME", "");
String bid = tf1.getText();
String bname = tf2.getText();
PreparedStatement st = null;
st=LIBRARY_2.conn.prepareStatement("insert into returned_book_details(s_no,returned_by,book_name,book_id,regestration_no,date,time,type) values(?,?,?,?,?,?,?,?)");
st.setInt(1,(++sa));
st.setString(2, name);
st.setString(3, bname);
st.setString(4, bid);
st.setString(5, reg);
java.sql.Date sqldate = new java.sql.Date(new java.util.Date().getTime());
st.setDate(6, sqldate);
java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
st.setTimestamp(7, date);
st.setString(8, "RETURNED");
st.executeUpdate();
        }
        catch(Exception e)
        {
       
        }
 ta1.append("\n-------------------------------------------------------------------------------");
ta1.append("\n COLLEGE                            :  SRM NCR");
ta1.append("\n SERIAL NUMBER               :  " +(sa));
ta1.append("\n BOOK ISSUED TO              : "+SELECT.lb1.getText().replaceFirst("WELCOME",""));
ta1.append("\n REGESTRATION NO          :  "+STUDENT_LOGIN_2.tf1.getText());
ta1.append("\n BOOK NAME                        :  "+tf2.getText());  
ta1.append("\n BOOK ID                               :  "+tf1.getText());      
ta1.append("\n RETURN DATE                    :  "+cal.getTime());
ta1.append("\n------------------------RETURN SUCCESSFULL--------------------------");
ta1.append("\n-------------------------------------------------------------------------------");  
try
{      
String sql1 = "delete from renewed_book_details where book_id='"+tf1.getText()+"'";
String sql2 = "delete from issued_book_details where book_id='"+tf1.getText()+"'";
String sql3="delete from book_record where reg_no='"+STUDENT_LOGIN_2.tf1.getText()+"' and b_id='"+tf1.getText()+"'";
PreparedStatement pst = null;
PreparedStatement pst1 = null;
PreparedStatement pst2 = null;
pst = LIBRARY_2.conn.prepareStatement(sql1);
pst.execute();
pst1 = LIBRARY_2.conn.prepareStatement(sql2);
pst1.execute();
pst2 = LIBRARY_2.conn.prepareStatement(sql3);
pst2.execute();
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null,e.getMessage());
}
audio(15);
JOptionPane.showMessageDialog(null,"BOOK RETURNED SUCCESSFULLY");
tf1.setText("");
tf2.setText("");
c=0;
}
               
       }
       if(h==0)
       {
audio(8);
            javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALID BOOK_ID");
       tf1.requestFocus();
       tf1.setText("");
       tf2.setText("");        
       }
       }
       catch(Exception e)
       {
        
       }            
             
           }
           
       }
       if(i==0)
           {
             if(i==0)
           {
audio(8);
    JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALID BOOK_ID");
tf1.setText(null);
tf2.setText("");        
c=0;
           }
           }
        }
       catch(Exception e)
       {
       }

    }
        }
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}
d=0;
    }//GEN-LAST:event_jButton11ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
audio(7);
jButton11.setIconTextGap(10);
jButton14.setIconTextGap(20);
jButton15.setIconTextGap(10);
jButton16.setIconTextGap(25);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(RETURN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RETURN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RETURN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RETURN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RETURN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
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
