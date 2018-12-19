package mp3.player;

public class CJOptionPane {
    
public static int c = 0;

public static JOptionPane Frame = new JOptionPane();

public static void showMessageDialog(String msg)
{

JOptionPane.que.setText(msg);  
Frame.img.setVisible(true);
Frame.ok.setVisible(true);
Frame.cross.setVisible(false);
Frame.ok1.setVisible(false);
Frame.img1.setVisible(false);
Frame.input.setVisible(false);
Frame.loc.setVisible(false);
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

public static String showInputDialog()
{
Frame.img.setVisible(false);
Frame.ok.setVisible(false);
Frame.cross.setVisible(true);
Frame.ok1.setVisible(true);
Frame.img1.setVisible(true);
Frame.input.setVisible(true);
Frame.loc.setVisible(true);
Frame.setVisible(true); 

while(c==0)
{  
try {
Thread.sleep(1);
} catch (InterruptedException ex) {
}
}
c=0;
return Frame.input.getText();
}
}
