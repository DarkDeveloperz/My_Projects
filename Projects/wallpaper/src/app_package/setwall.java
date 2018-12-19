/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_package;

import static app_package.GUI.l1;
import javax.swing.ImageIcon;

/**
 *
 * @author akash
 */
public class setwall {
    public void setwall()
    {
       wall g = new wall();
        if(g.readwall().equals("wall1"))
        {
           ImageIcon  I1= new ImageIcon(getClass().getResource("/images/1.jpg"));
l1.setIcon(I1); 
        }
        else if(g.readwall().equals("wall2"))
        {
           ImageIcon  I1= new ImageIcon(getClass().getResource("/images/06.jpg"));
l1.setIcon(I1);  
        }
        else if(g.readwall().equals("wall3"))
        {
            ImageIcon  I1= new ImageIcon(getClass().getResource("/images/08.jpg"));
l1.setIcon(I1);    
        }
        else if(g.readwall().equals("wall4"))
        {
         ImageIcon  I1= new ImageIcon(getClass().getResource("/images/09.jpg"));
l1.setIcon(I1);      
        }
        else
        {
             ImageIcon  I1= new ImageIcon(getClass().getResource("/images/8.jpg"));
l1.setIcon(I1);   
                }
    }
    
}
