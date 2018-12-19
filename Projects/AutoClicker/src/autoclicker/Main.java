/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoclicker;

/**
 *
 * @author akash
 */


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.MouseEvent;


public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * @throws java.awt.AWTException
     */
    public static void main(String[] args) throws InterruptedException, AWTException {
        // TODO code application logic here
       // Scanner scanner = new Scanner(System.in);
      //  System.out.println("---AutoClicker---");
        
    //    System.out.print("how much clicks would you like: ");
        int a = 10;//scanner.nextInt();
        
     //   System.out.print("how much delay would you like: ");
        int del = 500;//scanner.nextInt();
        
       // System.out.println("the program will start at 3 seconds.");
        
         Thread.sleep(3000);
         
        Robot robot = new Robot();
        robot.setAutoDelay(del);
        for (int i = 0; i < a; i++) {
            
        robot.mousePress(MouseEvent.BUTTON1_MASK);
        robot.mouseRelease(MouseEvent.BUTTON1_MASK);
        
        }
        System.out.println("AutoClicker Finished");
        
    }
    
}