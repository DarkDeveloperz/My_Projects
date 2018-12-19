/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.tray.icon;

import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author akash
 */
public class SystemTrayIcon {
    static TrayIcon trayIcon;
public SystemTrayIcon()
{
showTrayIcon();   
}
public static void showTrayIcon() 
{
if(!SystemTray.isSupported())
{
    System.out.println("Error, Your PC is too old");
    System.exit(0);
    return;
}
final PopupMenu pm = new PopupMenu();
trayIcon = new TrayIcon(CreateIcon("/images/Icon.png","TrayIcon"));
final SystemTray tray = SystemTray.getSystemTray();
trayIcon.setToolTip("Version - 1.0 \n Project Jarvis");
Menu displaymenu = new Menu("Akash");
//Add components / menu items
MenuItem menu = new MenuItem("About");
MenuItem exit = new MenuItem("Exit");
MenuItem erroritem = new MenuItem("Error");
MenuItem warningitem = new MenuItem("Warning");
MenuItem normalitem = new MenuItem("Normal");
MenuItem infoitem = new MenuItem("Info");
//populate the pop up menu
pm.add(menu);
pm.addSeparator();
pm.add(exit);
//populate the message displaymenu
displaymenu.add(erroritem);
displaymenu.add(warningitem);
displaymenu.add(normalitem);
displaymenu.add(infoitem);

trayIcon.setPopupMenu(pm);

menu.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
    JOptionPane.showMessageDialog(null,"Made by AK");
    }
});
exit.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
    tray.remove(trayIcon);
    System.exit(0);
    }
});

try
{
tray.add(trayIcon);    
}
catch(Exception e)
{    
}
} 
protected static Image CreateIcon(String path, String desc)
{
URL imageURL = SystemTrayIcon.class.getResource(path);
return (new ImageIcon(imageURL , desc)).getImage();
}
}
