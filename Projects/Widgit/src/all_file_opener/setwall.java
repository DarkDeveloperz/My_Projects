/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all_file_opener;

import static all_file_opener.NewJDialog.img;
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
           ImageIcon  I1= new ImageIcon(getClass().getResource("/images/1.png"));
img.setIcon(I1); 
        }
        if (g.readwall().equals("wall2"))
        {
           ImageIcon  I1= new ImageIcon(getClass().getResource("/images/2.png"));
img.setIcon(I1);  
        }
    }
    
}
