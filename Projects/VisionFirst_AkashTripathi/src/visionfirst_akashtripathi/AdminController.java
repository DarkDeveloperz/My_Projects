/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionfirst_akashtripathi;

import com.jfoenix.controls.JFXButton;
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
import static visionfirst_akashtripathi.FXML_LoginController.pst;
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
public class AdminController implements Initializable {

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
    
    @FXML
    private JFXButton edit,delete,approve;
    
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
        try{
        fadeIn();
        
        rs = connection.createStatement().executeQuery("select * from company");
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
    
    @FXML
    void approve(ActionEvent event) {
        try{
            if(table.getSelectionModel().getSelectedItem()!=null){
        coy_name = table.getSelectionModel().getSelectedItem().getC_name();           
            pst = connection.prepareStatement("select * from company");
            rs = pst.executeQuery();
            while(rs.next())
                    {
                        if((rs.getString("company_name")).equals(coy_name) && (rs.getString("status")).equals("unapproved")) 
                        {
        pst = connection.prepareStatement("update company set status='approved' where company_name='"+coy_name+"'");
        pst.execute(); 
        tray.setTray("Approved", "Company Approved Successfully", Img, Paint.valueOf("transparent") , AnimationType.POPUP);
        tray.showAndDismiss(Duration.seconds(2));
        
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
                    }

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
    void delete(ActionEvent event) {
        try{ 
            if(table.getSelectionModel().getSelectedItem()!=null){
        coy_name = table.getSelectionModel().getSelectedItem().getC_name();         
        pst = connection.prepareStatement("delete from company where company_name='"+coy_name+"'");
        pst.execute();        
        table.getItems().removeAll(table.getSelectionModel().getSelectedItem());
        tray.setTray("Deleted", "Data Deleted Successfully", Img, Paint.valueOf("transparent") , AnimationType.POPUP);
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
    void edit(ActionEvent event) {
        try{
            if(table.getSelectionModel().getSelectedItem()!=null){             
               coy_name = table.getSelectionModel().getSelectedItem().getC_name();  
               coy_add = table.getSelectionModel().getSelectedItem().getC_add(); 
               created_by_name = table.getSelectionModel().getSelectedItem().getCreated_by();
                fadeout();
        Stage curstage = (Stage) ap.getScene().getWindow();
        //curstage.initStyle(StageStyle.TRANSPARENT);
        Parent next = FXMLLoader.load(getClass().getResource("Edit.fxml"));
        
        
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
    
    
    @FXML
    void add(ActionEvent event) {
        try{
            
            fadeout();
        Stage curstage = (Stage) ap.getScene().getWindow();
        //curstage.initStyle(StageStyle.TRANSPARENT);
        Parent next = FXMLLoader.load(getClass().getResource("Add.fxml"));
        
        
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
        catch(Exception e){
            tray.setTray("Exception", e.getMessage(), Img, Paint.valueOf("transparent") , AnimationType.POPUP);
            tray.showAndDismiss(Duration.seconds(2));
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
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
