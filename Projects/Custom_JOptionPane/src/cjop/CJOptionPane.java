package cjop;

public class CJOptionPane {
    
public static int c = 0;
public static int status = 2;

public static JOptionPane Frame = new JOptionPane();

public static int showConfirmDialog(String que)
{

                JOptionPane.que.setText(que);
                Frame.con.setVisible(true);
                Frame.img.setVisible(false);
                Frame.ok.setVisible(false);
                Frame.yes.setVisible(true);
                Frame.no.setVisible(true);
                Frame.setVisible(true);
                
                while(c==0)
               {  
                try {
                      Thread.sleep(1);
                    } catch (InterruptedException ex) {
                }
               }
                c=0;
                return status;               
}

public static void showMessageDialog(String msg)
{

JOptionPane.que.setText(msg);  
Frame.img.setVisible(true);
Frame.con.setVisible(false);
Frame.yes.setVisible(false);
Frame.no.setVisible(false);
Frame.ok.setVisible(true);
Frame.setVisible(true); 

while(c==0)
{  
try {
Thread.sleep(1);
} catch (InterruptedException ex) {
}
}
c=0;
}
}
