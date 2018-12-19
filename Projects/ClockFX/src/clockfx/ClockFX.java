/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockfx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author akash
 */
public class ClockFX extends Application {
    private double xOffset = 0;
    private double yOffset = 0;
    wall w;
    public static byte a=0,d=0;
    
    @Override
    public void start(Stage stage) throws Exception {

        Image image = new Image("/images/softicon.png");
        stage.getIcons().add(image);
        
        w = new wall();
        int[] x = w.readwall();
        stage.setX(x[0]);
        stage.setY(x[1]);
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        stage.initStyle(StageStyle.TRANSPARENT);
       
        Scene scene = new Scene(root);
        scene.setFill(javafx.scene.paint.Color.TRANSPARENT);

    root.getStylesheets().add(getClass().getResource("sheet.css").toExternalForm());
      
       
        stage.setScene(scene);
        stage.show();
        
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
                w.writeWall((event.getScreenX() - xOffset)+"",(event.getScreenY() - yOffset)+"");
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);      
    }
    
    /*public static void audio(int i)
{
InputStream music = null;
try
{
if(a==0 && i==1)
{
music = new FileInputStream(new File("/audio/1.wav"));
}
if(i==3)
{
music = new FileInputStream(new File("/audio/3.wav")); 
}
if(a==1 && d==0)
{
music.close();
}
AudioStream audios = new AudioStream(music);
AudioPlayer.player.start(audios);
}
catch (Exception e)
{   
} 
}   */
    
}
