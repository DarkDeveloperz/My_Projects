/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewerfx;

import java.sql.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author akash
 */
public class ImageViewerFX extends Application {
    
    private double xOffset = 0;
    private double yOffset = 0;
    
    public static Connection connection;
    public static Statement stmt = null;
    
    public ImageViewerFX(){
        connection = DBConnection.connector();
        if(connection == null){
            System.out.println("Connection failed");
        }
    }
    
   /* public boolean isDBConnected(){
        try{
        return !connection.isClosed();
        }
        catch(Exception e){
            return false;
        }
    }*/
    
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Image image = new Image("/images/icon.png");
        stage.getIcons().add(image);
       
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        stage.initStyle(StageStyle.TRANSPARENT);
        
        root.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
        
        Scene scene = new Scene(root);
        scene.setFill(javafx.scene.paint.Color.TRANSPARENT);
                
                
        stage.setTitle("FX Viewer");
        stage.setScene(scene);
        stage.show();
        stage.setMaximized(true);
        stage.setResizable(false);

        
     /*   root.setOnMousePressed(new EventHandler<MouseEvent>() {
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
            }
        });           */
        

      
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);       
    }
    
}
// Developed by : Akash Tripathi on 12/12/2018. I am a software developer, graphics designer, web developer
// I have worked on many softwares, websites and graphics
// My work can be seen on my personal portfolio website: darkdeveloperz.github.io.