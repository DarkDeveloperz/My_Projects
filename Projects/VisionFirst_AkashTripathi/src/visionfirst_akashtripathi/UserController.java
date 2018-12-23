/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionfirst_akashtripathi;

import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.util.Duration;
import tray.animations.AnimationType;
import tray.notification.TrayNotification;
import static visionfirst_akashtripathi.AdminController.coy_add;
import static visionfirst_akashtripathi.AdminController.coy_name;
import static visionfirst_akashtripathi.AdminController.created_by_name;
import static visionfirst_akashtripathi.FXML_LoginController.pst;
import static visionfirst_akashtripathi.VisionFirst_AkashTripathi.connection;
import static visionfirst_akashtripathi.VisionFirst_AkashTripathi.height;
import static visionfirst_akashtripathi.VisionFirst_AkashTripathi.width;
import static visionfirst_akashtripathi.VisionFirst_AkashTripathi.xOffset;
import static visionfirst_akashtripathi.VisionFirst_AkashTripathi.yOffset;

/**
 * FXML Controller class
 *
 * @author akash
 */
public class UserController implements Initializable {

    /**
     * Initializes the controller class.
     */
TrayNotification tray = new TrayNotification();
    Image Img = new Image("/images/avatar.png");
    
    @FXML
    private AnchorPane ap;
    
    @FXML
    private JFXTextField c_name,c_add,created_by;
    
    @FXML
    void close(MouseEvent event) {
        try{
        connection.close();
        System.exit(0);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
    @FXML
    void minimize(ActionEvent event) {      
        Stage stage = (Stage)ap.getScene().getWindow();
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }
    
    @FXML
    void back(ActionEvent event) {
        try {
            fadeout();
            Stage curstage = (Stage) ap.getScene().getWindow();
            //curstage.initStyle(StageStyle.TRANSPARENT);
            Parent next = FXMLLoader.load(getClass().getResource("FXML_Login.fxml"));
            
            
            next.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
            
            Scene newscene = new Scene(next);
            newscene.setFill(javafx.scene.paint.Color.TRANSPARENT);
            
            curstage.setScene(newscene);
            
            curstage.setResizable(false);
            curstage.setX(width/2-150);
            curstage.setY(height/2-300);
            
            next.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    xOffset = event.getSceneX();
                    yOffset = event.getSceneY();
                }
            });
            next.setOnMouseDragged(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    curstage.setX(event.getScreenX() - xOffset);
                    curstage.setY(event.getScreenY() - yOffset);
                }
            });
        } catch (IOException e) {
        tray.setTray("Exception", e.getMessage(), Img, Paint.valueOf("transparent") , AnimationType.POPUP);
        tray.showAndDismiss(Duration.seconds(2));
        System.out.println(e.getMessage());
        e.printStackTrace();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        fadeIn();
    }    
    
    public void fadeIn(){
    FadeTransition ft = new FadeTransition();
    ft.setDuration(Duration.seconds(1));
    ft.setNode(ap);
    ft.setFromValue(0);
    ft.setToValue(1);
    ft.play();
    }
    
    public void fadeout(){
    FadeTransition ft = new FadeTransition();
    ft.setDuration(Duration.seconds(1));
    ft.setNode(ap);
    ft.setFromValue(1);
    ft.setToValue(0);
    ft.play();
}
    
    @FXML
    void reset(ActionEvent event) {
        c_name.setText(null);
        c_add.setText(null);
        created_by.setText(null);
    }

    @FXML
    void save(ActionEvent event) {
try{
             if(c_name.getText()!=null && c_add.getText()!=null && created_by.getText()!=null){
                pst = connection.prepareStatement("insert into company values('0','"+c_name.getText()+"','"+c_add.getText()+"','"+created_by.getText()+"','unapproved')");
                pst.execute();
                reset(event);
                tray.setTray("Update Status", "Data Updated Successfully", Img, Paint.valueOf("transparent") , AnimationType.POPUP);
                tray.showAndDismiss(Duration.seconds(2));
            }
            else{
                tray.setTray("Query Status", "Please Fill All The Details", Img, Paint.valueOf("transparent") , AnimationType.POPUP);
                tray.showAndDismiss(Duration.seconds(2));
            }  
         }
        catch (Exception e) {
        tray.setTray("Exception", e.getMessage(), Img, Paint.valueOf("transparent") , AnimationType.POPUP);
        tray.showAndDismiss(Duration.seconds(2));
        System.out.println(e.getMessage());
        e.printStackTrace();
        }
    }
    
    @FXML
    void list(MouseEvent event) {
        try {
            fadeout();
            Stage curstage = (Stage) ap.getScene().getWindow();
            //curstage.initStyle(StageStyle.TRANSPARENT);
            Parent next = FXMLLoader.load(getClass().getResource("List.fxml"));
            
            
            next.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
            
            Scene newscene = new Scene(next);
            newscene.setFill(javafx.scene.paint.Color.TRANSPARENT);
            
            curstage.setScene(newscene);
            
            curstage.setResizable(false);
            curstage.setX(width/2-300);
            curstage.setY(height/2-200);
            
            next.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    xOffset = event.getSceneX();
                    yOffset = event.getSceneY();
                }
            });
            next.setOnMouseDragged(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    curstage.setX(event.getScreenX() - xOffset);
                    curstage.setY(event.getScreenY() - yOffset);
                }
            });
        } catch (IOException e) {
        tray.setTray("Exception", e.getMessage(), Img, Paint.valueOf("transparent") , AnimationType.POPUP);
        tray.showAndDismiss(Duration.seconds(2));
        System.out.println(e.getMessage());
        e.printStackTrace();
        }
    }
    
}
