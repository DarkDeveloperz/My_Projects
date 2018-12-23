/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionfirst_akashtripathi;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.util.Duration;
import tray.animations.AnimationType;
import tray.notification.TrayNotification;
import static visionfirst_akashtripathi.VisionFirst_AkashTripathi.*;

/**
 *
 * @author akash
 */
public class FXML_LoginController implements Initializable {
    
    TrayNotification tray = new TrayNotification();
    Image Img = new Image("/images/avatar.png");
    
    public static PreparedStatement pst = null;
    public static ResultSet rs = null; 
    
    String role;
    boolean login_status = false;
        
    @FXML
    private AnchorPane ap;

    @FXML
    private Label bg,login,register,l_email,l_mobile,l_role,l_password,form_bg,l_user_name,l_user_name1,l_password1;
    
    @FXML
    private JFXTextField user_name,email,mobile,user_name1;
    
    @FXML
    private JFXButton close_btn,min_btn,submit,reset,submit1;
       
    @FXML
    private JFXPasswordField password,password1;
    
    @FXML
    private JFXRadioButton admin,user;  
    
    @FXML
    private ImageView image;
    
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
    private void submit(ActionEvent event) {
        try{
            if(admin.isSelected()==true){
                role = "admin";
            }
            else if(user.isSelected()==true){
                role = "user";
            }
            else{
                role = null;
            }
            
            if(user_name.getText()!=null && email.getText()!=null && mobile.getText()!=null && password.getText()!=null && role!=null){
                pst = connection.prepareStatement("insert into user values('"+user_name.getText()+"','"+email.getText()+"','"+mobile.getText()+"','"+password.getText()+"','"+role+"')");
                pst.execute();
                reset(event);
                tray.setTray("Query Status", "Data Entered Successfully", Img, Paint.valueOf("transparent") , AnimationType.POPUP);
                tray.showAndDismiss(Duration.seconds(2));
            }
            else{
                tray.setTray("Query Status", "Please Fill All The Details", Img, Paint.valueOf("transparent") , AnimationType.POPUP);
                tray.showAndDismiss(Duration.seconds(2));
            }  
        }
        catch(Exception e){
            tray.setTray("Exception", e.getMessage(), Img, Paint.valueOf("transparent") , AnimationType.POPUP);
            tray.showAndDismiss(Duration.seconds(2));
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
    @FXML
    void lSubmit(ActionEvent event) {
        try{           
            if(user_name1.getText()!=null && password1.getText()!=null){
            pst = connection.prepareStatement("select * from user");
            rs = pst.executeQuery();
            while(rs.next())
                    {
                        if((rs.getString("name")).equals(user_name1.getText()) && (rs.getString("password")).equals(password1.getText())) 
                        {
                            tray.setTray("Login Status", "Logged In Successfully", Img, Paint.valueOf("transparent") , AnimationType.POPUP);
                            tray.showAndDismiss(Duration.seconds(2));
                            login_status = true;
                            reset(event);
                            fadeout(rs.getString("role"));
                            break;
                        }
                    }
                if(login_status == false){
                tray.setTray("Login Status", "Incorrect Details", Img, Paint.valueOf("transparent") , AnimationType.POPUP);
                tray.showAndDismiss(Duration.seconds(2));
                }
                
            }
            else{
                tray.setTray("Query Status", "Please Fill All The Details", Img, Paint.valueOf("transparent") , AnimationType.POPUP);
                tray.showAndDismiss(Duration.seconds(2));
            }  
        }
        catch(Exception e){
            tray.setTray("Exception", e.getMessage(), Img, Paint.valueOf("transparent") , AnimationType.POPUP);
            tray.showAndDismiss(Duration.seconds(2));
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
    @FXML
    private void reset(Event event) {
        user_name.setText(null);
        user_name1.setText(null);
        email.setText(null);
        mobile.setText(null);
        password.setText(null);
        password1.setText(null);
        admin.setSelected(false);
        user.setSelected(false);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        admin.setSelectedColor(javafx.scene.paint.Color.WHITE);
        admin.setUnSelectedColor(javafx.scene.paint.Color.WHITE);
        user.setSelectedColor(javafx.scene.paint.Color.WHITE);
        user.setUnSelectedColor(javafx.scene.paint.Color.WHITE);
        l_user_name1.setVisible(false);
        user_name1.setVisible(false);
        l_password1.setVisible(false);
        password1.setVisible(false);
        submit1.setVisible(false);
        fadeIn();
    }    
    
    @FXML
    void login_clicked(MouseEvent event) {
        reset(event);
        email.setVisible(false);
        mobile.setVisible(false);
        admin.setVisible(false);
        user.setVisible(false);
        password.setVisible(false);
        user_name.setVisible(false);
        l_email.setVisible(false);
        l_mobile.setVisible(false);
        l_role.setVisible(false);
        l_password.setVisible(false);
        l_user_name.setVisible(false);
        submit.setVisible(false);
        
        l_user_name1.setVisible(true);
        user_name1.setVisible(true);
        l_password1.setVisible(true);
        password1.setVisible(true);
        submit1.setVisible(true);
        
    }
    
    @FXML
    void register_clicked(MouseEvent event) {
        reset(event);
        email.setVisible(true);
        mobile.setVisible(true);
        admin.setVisible(true);
        user.setVisible(true);
        password.setVisible(true);
        user_name.setVisible(true);
        l_email.setVisible(true);
        l_mobile.setVisible(true);
        l_role.setVisible(true);
        l_password.setVisible(true);
        l_user_name.setVisible(true);
        submit.setVisible(true);
        
        l_user_name1.setVisible(false);
        user_name1.setVisible(false);
        l_password1.setVisible(false);
        password1.setVisible(false);
        submit1.setVisible(false);
        
    }
    
public void fadeout(String role){
    FadeTransition ft = new FadeTransition();
    ft.setDuration(Duration.seconds(0.5));
    ft.setNode(ap);
    ft.setFromValue(1);
    ft.setToValue(0);
    
    ft.setOnFinished(new EventHandler<ActionEvent>(){
        @Override
        public void handle(ActionEvent event) {
            loadnext(role);
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });
    ft.play();
}

public void loadnext(String role){
    try{
        if(role.equals("admin")){
        Stage curstage = (Stage) ap.getScene().getWindow();
        //curstage.initStyle(StageStyle.TRANSPARENT);
        Parent next = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        
        
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
        }
        else{
            Stage curstage = (Stage) ap.getScene().getWindow();
        //curstage.initStyle(StageStyle.TRANSPARENT);
        Parent next = FXMLLoader.load(getClass().getResource("User.fxml"));
        
        
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
        }
    }
    catch(Exception e){
        tray.setTray("Exception", e.getMessage(), Img, Paint.valueOf("transparent") , AnimationType.POPUP);
        tray.showAndDismiss(Duration.seconds(2));
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
}

    public void fadeIn(){
    FadeTransition ft = new FadeTransition();
    ft.setDuration(Duration.seconds(0.5));
    ft.setNode(ap);
    ft.setFromValue(0);
    ft.setToValue(1);
    ft.play();
    }
    
    
}
