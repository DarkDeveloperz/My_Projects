package all_file_opener;

public class ALL_FILE_OPENER {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJDialog dialog = new NewJDialog(new javax.swing.JFrame(), true);
                dialog.exit.setVisible(false);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setOpacity(0);
                dialog.setVisible(true);
            }
        });
        
        /*try
{
/*File f = new File("APP.bat");    
FileWriter fw = new FileWriter(f);
fw.write("@echo off \r\n");
fw.write("@echo hello \r\n");
fw.write("pause \r\n");
fw.write("\"C:\\Program Files (x86)\\Smart Clock\\Clock.jar\"");
fw.close();             //one type
    
    
    
Runtime obj = Runtime.getRuntime();
    obj.exec("shutdown -s -t 120");                    type 2
    
Runtime obj = Runtime.getRuntime();
   // obj.exec("Programpath Filepath");   
    //obj.exec("\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"");
//obj.exec("\"C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe\" \"D:\\VIDEOS\\HINDI\\VIDEO SONGS\\1.mp4\"");
obj.exec("c:\\Windows\\explorer.exe \"APP.bat");
        obj.exec("taskkill /f /im explorer.exe "); 
}
catch(Exception e)
{
    
}*/

    }
    
}
