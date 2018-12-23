/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionfirst_akashtripathi;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Statement;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import tray.animations.AnimationType;
import tray.notification.TrayNotification;

/**
 *
 * @author akash
 */
public class VisionFirst_AkashTripathi extends Application {
    
    public static int width = (Toolkit.getDefaultToolkit().getScreenSize().width);
    public static int height = (Toolkit.getDefaultToolkit().getScreenSize().height);
    
    public static double xOffset = 0;
    public static double yOffset = 0;
    
    public static Connection connection;
    public static Statement stmt = null;
    
    public VisionFirst_AkashTripathi(){
        connection = DBConnection.connector();
        
        TrayNotification tray = new TrayNotification();
        Image Img = new Image("/images/avatar.png");
        
        if(connection == null){
            tray.setTray("Database Status", "Database Not Connected", Img, Paint.valueOf("transparent") , AnimationType.POPUP);
        }
        else{
            tray.setTray("Database Status", "Database Connected Successfully", Img, Paint.valueOf("transparent") , AnimationType.POPUP);       
        }
         tray.showAndDismiss(Duration.seconds(2)); 
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Image image = new Image("/images/icon.png");
        stage.getIcons().add(image);        
        
        Parent root = FXMLLoader.load(getClass().getResource("FXML_Login.fxml"));
        stage.initStyle(StageStyle.TRANSPARENT);
        
        root.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
        
        Scene scene = new Scene(root);
        scene.setFill(javafx.scene.paint.Color.TRANSPARENT);
        
        stage.setTitle("Vision First Assignment ( Akash Tripathi )");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        stage.setX(width/2-150);
        stage.setY(height/2-300);
        
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
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
