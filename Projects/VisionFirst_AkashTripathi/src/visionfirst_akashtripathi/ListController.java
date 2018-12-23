/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionfirst_akashtripathi;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.util.Duration;
import tray.animations.AnimationType;
import tray.notification.TrayNotification;
import static visionfirst_akashtripathi.FXML_LoginController.rs;
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
public class ListController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    TrayNotification tray = new TrayNotification();
    Image Img = new Image("/images/avatar.png");
    
    public static String coy_name,coy_add,created_by_name = null;
    
    
    @FXML
    private AnchorPane ap;
    
    @FXML
    private TableView<ModelTable> table;

    @FXML
    private TableColumn<ModelTable, String> col_sno;

    @FXML
    private TableColumn<ModelTable, String> col_c_name;

    @FXML
    private TableColumn<ModelTable, String> col_c_add;

    @FXML
    private TableColumn<ModelTable, String> col_createdby;  
    
    @FXML
    private TableColumn<ModelTable, String> col_status;
    
    ObservableList<ModelTable> oblist = FXCollections.observableArrayList();
    
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
    void backon(ActionEvent event) {
        try {
            fadeout();
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
        try{
        fadeIn();
        
        rs = connection.createStatement().executeQuery("select * from company where created_by='User'");
        while(rs.next())
                    {
                       oblist.add(new ModelTable(rs.getString("sno"),
                               rs.getString("company_name"),
                               rs.getString("company_address"),
                               rs.getString("created_by"),
                               rs.getString("status")));
                    }
        
        col_sno.setCellValueFactory(new PropertyValueFactory<>("sno"));
        col_c_name.setCellValueFactory(new PropertyValueFactory<>("c_name"));
        col_c_add.setCellValueFactory(new PropertyValueFactory<>("c_add"));
        col_createdby.setCellValueFactory(new PropertyValueFactory<>("created_by"));
        col_status.setCellValueFactory(new PropertyValueFactory<>("status"));
        table.setItems(oblist);
        
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
    
     public void fadeout(){
    FadeTransition ft = new FadeTransition();
    ft.setDuration(Duration.seconds(1));
    ft.setNode(ap);
    ft.setFromValue(1);
    ft.setToValue(0);
    ft.play();
}
    
}
