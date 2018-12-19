/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hang;

/**
 *
 * @author akash
 */
public class Hang {
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
int timerun = 0;
new Thread()
{
public void run()
{
while (timerun == 0) 
{  
new Thread()
{
public void run(){
byte c = 0;
while(c==0)
{
try
{   
Thread.sleep(20000);  
}
catch(Exception e)
{   
}
}   
}
}.start();    
}
}
}.start();
    }   
}
