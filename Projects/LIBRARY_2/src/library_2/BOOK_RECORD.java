/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_2;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import static library_2.LIBRARY_2.audio;

/**
 *
 * @author akash
 */
public class BOOK_RECORD extends javax.swing.JFrame {
 byte q=0;
byte h=0;
int sa=0;
    /**
     * Creates new form BOOK_RECORD
     */
    public BOOK_RECORD() {
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

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setMaximumSize(new java.awt.Dimension(540, 280));
        setMinimumSize(new java.awt.Dimension(540, 280));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        getContentPane().add(lb1);
        lb1.setBounds(10, 10, 330, 17);

        lb2.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        getContentPane().add(lb2);
        lb2.setBounds(10, 40, 370, 18);
        getContentPane().add(lb3);
        lb3.setBounds(360, 0, 120, 100);

        jLabel1.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/turtle.png"))); // NOI18N
        jLabel1.setText("REGISTRATION NUMBER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 116, 210, 20);

        tf1.setBackground(new java.awt.Color(204, 204, 255));
        tf1.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf1KeyTyped(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(240, 120, 290, 21);

        jLabel2.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/stu.png"))); // NOI18N
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 146, 100, 20);

        tf2.setBackground(new java.awt.Color(204, 204, 255));
        tf2.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        getContentPane().add(tf2);
        tf2.setBounds(240, 150, 290, 21);

        jLabel3.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/books.png"))); // NOI18N
        jLabel3.setText("BOOK ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 176, 90, 20);

        tf3.setBackground(new java.awt.Color(204, 204, 255));
        tf3.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        tf3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf3KeyTyped(evt);
            }
        });
        getContentPane().add(tf3);
        tf3.setBounds(240, 180, 290, 21);

        jLabel4.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/books.png"))); // NOI18N
        jLabel4.setText("BOOK NAME");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 206, 120, 20);

        tf4.setBackground(new java.awt.Color(204, 204, 255));
        tf4.setFont(new java.awt.Font("DigifaceWide", 3, 12)); // NOI18N
        tf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf4ActionPerformed(evt);
            }
        });
        getContentPane().add(tf4);
        tf4.setBounds(240, 210, 290, 21);

        jButton11.setBackground(new java.awt.Color(153, 153, 153));
        jButton11.setFont(new java.awt.Font("DigifaceWide", 3, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/clear.png"))); // NOI18N
        jButton11.setText("CLEAR");
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(10, 249, 140, 20);

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
        jButton12.setBounds(360, 250, 170, 20);

        jButton13.setBackground(new java.awt.Color(153, 153, 153));
        jButton13.setFont(new java.awt.Font("DigifaceWide", 3, 14)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/save.png"))); // NOI18N
        jButton13.setText("SAVE DATA");
        jButton13.setBorder(null);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(180, 250, 150, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_2/ak.png"))); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 560, 280);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
jButton11.setIconTextGap(25); 
jButton12.setIconTextGap(25);
        try
        {
            tf1.requestFocus();
audio(17); 
try
{
String s1,s2,s3,s4;
s1=STUDENT_LOGIN_2.tf1.getText();
ImageIcon format;
 ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from INCHARGE_REG_NO");
       while(rs.next())
       {
           s2=rs.getString("REG_NO");
           s3=rs.getString("NAME");
           if(s1.equals(s2))
           {
               lb1.setText(s3);
               lb2.setText(STUDENT_LOGIN_2.tf1.getText());
               byte [] imagedata = rs.getBytes("pic");
    format = new ImageIcon(imagedata);
    lb3.setIcon(format);
           }
       }
}
catch (Exception e)
{
    
}
        }
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}
    }//GEN-LAST:event_formWindowOpened

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        tf1.setText(null);
        tf3.setText(null);
        tf4.setText(null);
        tf2.setText(null);
audio(32);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
audio(32);
        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_AS().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
try
{
    audio(32);
        byte t=0;
try
{
int s1=Integer.parseInt(tf3.getText());
ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from book_record");
       while(rs.next())
       {
         int s2=rs.getInt("b_id");
         if(s1==s2)
         {
            t=1;
         }
       }

}
catch(Exception e)
{
    
}

if(t==0)   
{
try
{

  ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from book_record where reg_no='"+tf1.getText()+"'");
       while(rs.next())
       {
             q++;
         
       }
}
catch(Exception e)
{
    
}
if(q<5)
{
        byte f=0;
        if((tf1.getText()=="") || (tf2.getText()=="") || (tf3.getText()=="") || (tf4.getText()==""))
{
  f=1; 
audio(20); 
  JOptionPane.showMessageDialog(null,"PLEASE FILL ALL THE DETAILS");
  
}
        if(f==0)
        {
        String s1 = tf1.getText();
        String s2=tf2.getText();
    int s3 = Integer.parseInt(tf3.getText());
        String s4 =tf4.getText();
        try
        {
         ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from book_record");
       while(rs.next())
       {
         sa=rs.getInt("s_no");
       }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "PLEASE FILL ALL THE DETAILS");  
        
        }
        try
        {
         PreparedStatement st = null;
st=LIBRARY_2.conn.prepareStatement("insert into book_record(s_no,name,reg_no,b_id,b_name,date) values(?,?,?,?,?,?)");
st.setInt(1,(++sa));
st.setString(2, s2);
st.setString(3, s1);
st.setInt(4, s3);
st.setString(5, s4);
java.sql.Date sqldate = new java.sql.Date(new java.util.Date().getTime());
st.setDate(6, sqldate);
st.executeUpdate();   
audio(18); 
JOptionPane.showMessageDialog(null, "DATA SAVED SUCCESSFULLY");
tf4.setText("");
tf3.setText("");
q=0;
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null, e.getMessage());   
         e.printStackTrace();
        }
        }
}
else
{
audio(11); 
            JOptionPane.showMessageDialog(null,"YOU CAN'T ISSUE MORE THAN 5 BOOKS");
        
        tf1.setText("");
        tf2.setText("");
        tf3.setText(null);
        tf4.setText(null);
}
}
else
{
audio(8);
            javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALID BOOK_ID");

       tf3.setText("");
       tf4.setText("");
}
q=0;
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}
    }//GEN-LAST:event_jButton13ActionPerformed

    private void tf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyTyped

    }//GEN-LAST:event_tf1KeyTyped

    private void tf3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf3KeyTyped

    }//GEN-LAST:event_tf3KeyTyped

    private void tf3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf3KeyPressed

    }//GEN-LAST:event_tf3KeyPressed

    private void tf1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyReleased
try
{
        if(tf1.getText().contains("RA"))
{
        if(tf1.getText().length()==15)
{
    tf3.requestFocus();
        try{
              
       ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from student_reg_no");
       while(rs.next())
       {
           if(tf1.getText().equals(rs.getString("reg_no")))
           {
               h=1;
               tf2.setText(rs.getString("name"));
              
           }
       }
        }
       catch(Exception e)
               {
               }
        
        
        if(h==0)
       {
           tf1.requestFocus();
audio(19);
            javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALID REGESTRATION NUMBER");
       tf1.requestFocus();
       tf1.setText("");
       tf2.setText("");
      
       h=0;
       tf1.requestFocus();
        }
}
}
else
{
if(tf1.getText().length()==15)
{
    tf3.requestFocus();
        try{
              
       ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from teacher_reg_no");
       while(rs.next())
       {
           if(tf1.getText().equals(rs.getString("reg_no")))
           {
               h=1;
               tf2.setText(rs.getString("name"));
              
           }
       }
        }
       catch(Exception e)
               {
               }
        
        
        if(h==0)
       {
           tf1.requestFocus();
audio(19);
            javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALID REGESTRATION NUMBER");
       tf1.requestFocus();
       tf1.setText("");
       tf2.setText("");
      
       h=0;
       tf1.requestFocus();
        }
}    
}
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}
    }//GEN-LAST:event_tf1KeyReleased

    private void tf3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf3KeyReleased
try
{
        if(tf3.getText().length()==4)
        {
        try{
         tf3.requestFocus();
       ResultSet rs=LIBRARY_2.stmt.executeQuery("select * from books");
       while(rs.next())
       {
           if(tf3.getText().equals(rs.getString("b_id")))
           {
               h=1;
               tf4.setText(rs.getString("book_name"));
           
           }
       }
        }
       catch(Exception e)
               {
               }
        
        }
        if(h==0 )
       {
           tf3.requestFocus();
audio(8);
            javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALID BOOK_ID");
     
       tf3.setText("");
       tf4.setText("");
       
    h=0;

        }
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}


    }//GEN-LAST:event_tf3KeyReleased

    private void tf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf4ActionPerformed

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
this.setLocation(evt.getLocationOnScreen());        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseDragged

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
            java.util.logging.Logger.getLogger(BOOK_RECORD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BOOK_RECORD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BOOK_RECORD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BOOK_RECORD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BOOK_RECORD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
