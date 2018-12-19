/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewerfx;

import animatefx.animation.FlipInY;
import animatefx.animation.FlipOutY;
import animatefx.animation.RubberBand;
import animatefx.animation.SlideInLeft;
import animatefx.animation.SlideInRight;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.effects.JFXDepthManager;
import static imageviewerfx.ImageViewerFX.connection;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
//import java.awt.event.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.util.Duration;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;
import javafx.scene.control.Tooltip;


/**
 *
 * @author akash
 */
public class FXMLDocumentController implements Initializable {
    
    public ImageViewerFX loginmodel = new ImageViewerFX();
    PreparedStatement pst = null;
    ResultSet rs = null;    
    
    JFXDepthManager manager;  
    
    InputStream music = null;
    AudioStream audios = null;   
    
    public static String name;
    String last_loc = null;
    File selectedFile;
    File[] fList;
    File directory;
    DosFileAttributes dos;
    int length,img_width,img_height,currentIndex=0;  
    
    byte audio,bulb,settings_count = 0;    
    public static int width = (Toolkit.getDefaultToolkit().getScreenSize().width);
    public static int height = (Toolkit.getDefaultToolkit().getScreenSize().height);
    FilenameFilter fileNameFilter = new FilenameFilter() {
   
            @Override
            public boolean accept(File dir, String name) {
               if(name.lastIndexOf('.')>0) {
               
                  // get last index for '.' char
                  int lastIndex = name.lastIndexOf('.');
                  
                  // get extension
                  String str = name.substring(lastIndex);
                  
                  // match path name extension
                  if(str.equals(".png") || str.equals(".jpg") || str.equals(".gif")) {
                     return true;
                  }
               }
               
               return false;
            }
         };
    
    @FXML
    private AnchorPane ap;
    
    @FXML
    private StackPane sp;
    
    @FXML
    private ImageView img,logo;
    
    @FXML
    private JFXButton open,min,close_btn,settings,audio_on,audio_off,delete,bulb_on,bulb_off,pre_img,next_img,FXViewer,hide;
       
    @FXML
    private Label lbl,file_name,pwidth,pwidthval,pheight,pheightval,ptype,ptypeval,ploc,plocval,psize,psizeval;  
    
    DropShadow e = new DropShadow();   
    final Tooltip tip = new Tooltip();
    final Tooltip tip1 = new Tooltip();
    final Tooltip tip2 = new Tooltip();
    
    @FXML
    void close(MouseEvent event) {
        try{
        connection.close();
        System.exit(0);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
   @FXML
    void minimize(ActionEvent event) {
        
        Stage stage = (Stage)ap.getScene().getWindow();
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }
    
    @FXML
    void audio(MouseEvent event) {
       
        try {
            if(audio == 1)
            {
            music = new FileInputStream(new File("1.wav"));
            audios = new AudioStream(music);
            AudioPlayer.player.start(audios);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
      tip.setText("Open File");      
      open.setTooltip(tip);
      tip.getStyleClass().add("tooltip");
      tip1.setText("Hide File");
      tip1.getStyleClass().add("tooltip");
      hide.setTooltip(tip1);
      tip2.getStyleClass().add("tooltip");
      tip2.setText("Delete File");      
      delete.setTooltip(tip2);
        
    }
    
    void bulb(){
        try {
            if(bulb == 1)
            {
            
            }
            else{
            
               

            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    @FXML
    void soft_settings(MouseEvent event) {
    try{           
        switch(settings_count)
            {
                case 0 : 
                            audio_on.setVisible(true);
                            audio_off.setVisible(true);
                            bulb_on.setVisible(true);
                            bulb_off.setVisible(true);
                            settings_count = 1;
                            
                         //   new FadeInLeft(audio_on).play();
                            TranslateTransition transition = new TranslateTransition();
                            transition.setDuration(Duration.seconds(1));
                            transition.setToX(600);
                            transition.setToY(0);
                            transition.setNode(audio_on);
                            transition.play();
      
                            TranslateTransition transition1 = new TranslateTransition();
                            transition1.setDuration(Duration.seconds(1));
                            transition1.setToX(-600);
                            transition1.setToY(0);
                            transition1.setNode(audio_off);
                            transition1.play();
                            
                            TranslateTransition transition4 = new TranslateTransition();
                            transition4.setDuration(Duration.seconds(1));
                            transition4.setToX(600);
                            transition4.setToY(0);
                            transition4.setNode(bulb_on);
                            transition4.play();
      
                            TranslateTransition transition5 = new TranslateTransition();
                            transition5.setDuration(Duration.seconds(1));
                            transition5.setToX(-600);
                            transition5.setToY(0);
                            transition5.setNode(bulb_off);
                            transition5.play();
                            
              
                break;
              
                case 1 :
                            new Thread(){
                                public void run(){
                                    
                                    TranslateTransition transition2 = new TranslateTransition();
                                    transition2.setDuration(Duration.seconds(1));
                                    transition2.setToX(0);
                                    transition2.setToY(0);
                                    transition2.setNode(audio_on);
                                    transition2.play();
      
                                    TranslateTransition transition3 = new TranslateTransition();
                                    transition3.setDuration(Duration.seconds(1));
                                    transition3.setToX(0);
                                    transition3.setToY(0);
                                    transition3.setNode(audio_off);
                                    transition3.play();
                                    
                                    TranslateTransition transition6 = new TranslateTransition();
                                    transition6.setDuration(Duration.seconds(1));
                                    transition6.setToX(0);
                                    transition6.setToY(0);
                                    transition6.setNode(bulb_on);
                                    transition6.play();
      
                                    TranslateTransition transition7 = new TranslateTransition();
                                    transition7.setDuration(Duration.seconds(1));
                                    transition7.setToX(0);
                                    transition7.setToY(0);
                                    transition7.setNode(bulb_off);
                                    transition7.play();
                                    
                                    try{
                                        sleep(1000);
                                    }
                                    catch(Exception e){
                                        System.out.println(e.getMessage());
                                    }
      
                                    audio_on.setVisible(false);
                                    audio_off.setVisible(false);
                                    bulb_on.setVisible(false);
                                    bulb_off.setVisible(false);
                                    settings_count = 0;
                                    }
                                    }.start();       
    
}
        
        try{
            
            pst = loginmodel.connection.prepareStatement("select * from settings");
            rs = pst.executeQuery();
            while(rs.next())
                    {
                        if((rs.getInt("audio"))==1) 
                        {
                            new Thread(){
                                public void run(){
                            audio_on.getStyleClass().add("sg");
                            audio_off.getStyleClass().remove("sg");
                            audio=1; 
                                }
                            }.start();
                            
                        }
                        if((rs.getInt("audio"))==0)
                        {
                            new Thread(){
                                public void run(){
                            audio_off.getStyleClass().add("sg"); 
                            audio_on.getStyleClass().remove("sg");
                            audio=0;
                                }
                            }.start();
                            
                        }
                        
                        if((rs.getInt("bulb"))==1) 
                        {
                            new Thread(){
                                public void run(){
                            bulb_on.getStyleClass().add("sg");
                            bulb_off.getStyleClass().remove("sg");
                            bulb=1; 
                                }
                            }.start();
                            
                        }
                        if((rs.getInt("bulb"))==0)
                        {
                            new Thread(){
                                public void run(){
                            bulb_off.getStyleClass().add("sg"); 
                            bulb_on.getStyleClass().remove("sg");
                            bulb=0;
                                }
                            }.start();
                            
                        }
                        
                    }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
      
          /* FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Settings.fxml"));
           Parent root1 = (Parent) fxmlLoader.load();
           Stage stage = new Stage();
           stage.setTitle("Settings");
           stage.setScene(new Scene(root1));
           stage.show();*/
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    
    @FXML
    void delete_file(Event event) {
        
        if(selectedFile != null){
        sp.setVisible(true);
        BoxBlur blur = new BoxBlur(3,3,3);
        JFXDialogLayout content = new JFXDialogLayout();
        content.setPrefWidth(600);        
        Text t1 = new Text("Delete File");
        t1.setFont(Font.font("Orbitron Black", FontWeight.BOLD, FontPosture.REGULAR, 30));
        content.setHeading(t1);
        Text t2 = new Text("Are you sure you want to delete this file? \n\n"
        +"After deletion it can't be restored from the Recycle Bin.");
        t2.setFont(Font.font("Orbitron Black", FontWeight.LIGHT, FontPosture.REGULAR, 12));
        content.setBody(t2);
        JFXDialog dialog = new JFXDialog(sp,content,JFXDialog.DialogTransition.CENTER);
        img.setEffect(blur);
        JFXButton button1 = new JFXButton("Yes");
        button1.getStyleClass().add("button1");
        button1.getStyleClass().remove("button");
        JFXButton button2 = new JFXButton(" No ");
        button2.getStyleClass().remove("button");
        button2.getStyleClass().add("button2");
        button1.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void handle(ActionEvent event){            
            dialog.close();                     
            new FlipOutY(img).play();            
            setTitleOnStage(fList[currentIndex+1].getName(),event);
       //     new Thread(){
        //        public void run(){
                    try{
                    fList[currentIndex].delete();                                       
                    img.setEffect(new BoxBlur(0,0,0));
                    setShadow();
                    sp.setVisible(false);                      
                    Thread.sleep(500);       
                    img.setImage(null);
                    Thread.sleep(500); 
                    new FlipInY(img).play();
 try{  
            currentIndex++;
            if(currentIndex==length){
                currentIndex = 0;
            }   
            
            Image image = new Image(fList[currentIndex].toURI().toString());
            img.setImage(image);            
            img_width = (int) image.getWidth();
            img_height = (int) image.getHeight();
            checkDimentions(img_width, img_height);
            centerImage(img);  
            setBackgroundColor(image);
            refreshList();
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }                    
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
    //            }
   //         }.start();
            
        }
        });
        
        button2.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void handle(ActionEvent event){
            dialog.close();
            sp.setVisible(false);
            img.setEffect(new BoxBlur(0,0,0));    
            setShadow();
        }
        });
        content.setActions(button1,button2);
        dialog.show();           
        }
          
    }
    
    @FXML
    void hide_file(ActionEvent event) {
        if(selectedFile != null){
        hide(event);
        }
    }
    
    @FXML
    void audio_off_clicked(ActionEvent event) {
    try{
        audio=0;        
        audio_on.setStyle("-fx-border-color: black");
        audio_off.setStyle("-fx-border-color: aqua");        
        String query = "update settings set audio=0 where audio=1";
        pst = loginmodel.connection.prepareStatement(query);
        pst.execute();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void audio_on_clicked(ActionEvent event) {
    try{
        audio=1;
        audio_off.setStyle("-fx-border-color: black");
        audio_on.setStyle("-fx-border-color: aqua");       
        String query = "update settings set audio=1 where audio=0";
        pst = loginmodel.connection.prepareStatement(query);
        pst.execute();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    @FXML
    void bulb_off_clicked(ActionEvent event) {
        try{
        bulb=0;        
        bulb_on.setStyle("-fx-border-color: black");
        bulb_off.setStyle("-fx-border-color: aqua");        
        String query = "update settings set bulb=0 where bulb=1";
        pst = loginmodel.connection.prepareStatement(query);
        pst.execute();
        bulb();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void bulb_on_clicked(ActionEvent event) {
        try{
        bulb=1;
        bulb_off.setStyle("-fx-border-color: black");
        bulb_on.setStyle("-fx-border-color: aqua");       
        String query = "update settings set bulb=1 where bulb=0";
        pst = loginmodel.connection.prepareStatement(query);
        pst.execute();
        bulb();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    @FXML  //img dragged
    void animation(MouseEvent event) {
        new RubberBand(img).play();
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
    try{     
            FileChooser fc = new FileChooser();
            pst = loginmodel.connection.prepareStatement("select * from settings");
            rs = pst.executeQuery();
            while(rs.next())
            {
               last_loc = rs.getString("last_loc");
            }
        fc.setInitialDirectory(new File(last_loc));
        fc.getExtensionFilters().addAll(new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"));
        selectedFile = fc.showOpenDialog(null);
        fc.setTitle("Open Image");
        name = selectedFile.getPath();       
        File file = new File(name);      
        Image image = new Image(file.toURI().toString());
        String ext = getFileExtension(file);
        img.setImage(image);              
        setTitleOnStage(selectedFile.getName(),event);
        img_width = (int) image.getWidth();
        img_height = (int) image.getHeight();
        checkDimentions(img_width, img_height);
        centerImage(img);      
        name = selectedFile.getParent();
        directory = new File(name);
        String path = directory.getParent();     
        fList = directory.listFiles(fileNameFilter); //apply file filters here and above to only show image format files
        length = directory.listFiles(fileNameFilter).length;        
        currentIndex = indexOf(fList, selectedFile);
        new RubberBand(img).play();
        setBackgroundColor(image);       
        pst = loginmodel.connection.prepareStatement("update settings set last_loc='"+name+"'");
        pst.execute();
        sp.setLayoutX((width/2)-250);
        sp.setLayoutY((height/2)-120); 
        
        preImg(event);
        nextImg(event); //these 2 lines are used because the initial image was not comming to center.
        
        
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {      
      
      lbl.setPrefSize(width, height);
      delete.setLayoutX((width/2)+100);   
      hide.setLayoutX((width/2)-100);
      manager.setDepth(img, 500);
      manager.setDepth(close_btn,500);
      manager.setDepth(min, 500);
      manager.setDepth(open, 500);
      audio_on.setVisible(false);
      audio_off.setVisible(false);
      bulb_on.setVisible(false);
      bulb_off.setVisible(false);
      
      pwidth.setLayoutX((width/2)-100);
      pwidthval.setLayoutX((width/2)+100);
      pwidth.setVisible(false);
      pwidthval.setVisible(false);
      
      pheight.setLayoutX((width/2)-100);
      pheightval.setLayoutX((width/2)+100);
      pheight.setVisible(false);
      pheightval.setVisible(false);
      
      ptype.setLayoutX((width/2)-100);
      ptypeval.setLayoutX((width/2)+100);
      ptype.setVisible(false);
      ptypeval.setVisible(false);
      
      ploc.setLayoutX((width/2)-100);
      plocval.setLayoutX((width/2)+100);
      ploc.setVisible(false);
      plocval.setVisible(false);
      
      psize.setLayoutX((width/2)-100);
      psizeval.setLayoutX((width/2)+100);
      psize.setVisible(false);
      psizeval.setVisible(false);
      
      
       
      
      
 /*     new Thread(){
          public void run(){
              try{
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_WINDOWS);
    robot.keyPress(KeyEvent.VK_D);
    robot.keyRelease(KeyEvent.VK_D);
    robot.keyRelease(KeyEvent.VK_WINDOWS);
              }
              catch(Exception e){
                  
              }
          }
      }.start();*/
      try
      {
            pst = loginmodel.connection.prepareStatement("select * from settings");
            rs = pst.executeQuery();
            audio = (byte)rs.getInt("audio");
            bulb = (byte)rs.getInt("bulb");
            bulb();
      }
      catch(Exception e){
          System.out.println(e.getMessage());
      }
          
    startupAnimations();      
    /*      if(loginmodel.isDBConnected()){
          System.out.println("DBConnected");
      }
      else{
          System.out.println("DB is not Connected");
      }*/  
    }
    
    @FXML
    void showProperties(MouseEvent event) {
        if(event.getClickCount()==2){
            BoxBlur blur = new BoxBlur(3,3,3);
            img.setEffect(blur);
            //setShadow();
            Image image = img.getImage();
            
            pwidth.setVisible(true);
            pwidthval.setVisible(true);
            pwidthval.setText(""+image.getWidth());    
            
            pheight.setVisible(true);
            pheightval.setVisible(true);            
            pheightval.setText(""+image.getHeight());
            
            ptype.setVisible(true);
            ptypeval.setVisible(true);
            ptypeval.setText(""+getFileExtension(fList[currentIndex]));
            
            ploc.setVisible(true);
            plocval.setVisible(true);
            plocval.setText(name);
            
            psize.setVisible(true);
            psizeval.setVisible(true);
            psizeval.setText(""+fList[currentIndex].length()/1024+" KB");    
            
            
            
        }
        else{
            img.setEffect(new BoxBlur(0,0,0));
            setShadow();
            pwidth.setVisible(false);
            pwidthval.setVisible(false);
            
            pheight.setVisible(false);
            pheightval.setVisible(false);
            
            ptype.setVisible(false);
            ptypeval.setVisible(false);
            
            ploc.setVisible(false);
            plocval.setVisible(false);
            
            psize.setVisible(false);
            psizeval.setVisible(false);
        }
    }

public static void centerImage(ImageView imgView) {
        Image img = imgView.getImage();

        if (img != null) {
            double w = 0;
            double h = 0;
            
            double ratioX = imgView.getFitWidth() / img.getWidth();
            double ratioY = imgView.getFitHeight() / img.getHeight();

            double reducCoeff = 0;
            if(ratioX >= ratioY) {
                reducCoeff = ratioY;
            } else {
                reducCoeff = ratioX;
            }

            w = img.getWidth() * reducCoeff;
            h = img.getHeight() * reducCoeff;

            imgView.setX((imgView.getFitWidth() - w) / 2);
            imgView.setY((imgView.getFitHeight() - h) / 2);

        }
    }

@FXML
void nextImg(ActionEvent event){
    try{
    if(selectedFile != null){   
            currentIndex++;
            if(currentIndex==length){
                currentIndex = 0;
            }            
            Image image = new Image(fList[currentIndex].toURI().toString());
            img.setImage(image);
            setTitleOnStage(fList[currentIndex].getName(),event);
            img_width = (int) image.getWidth();
            img_height = (int) image.getHeight();
            checkDimentions(img_width, img_height);
            centerImage(img);  
            new SlideInRight(img).play();
       //     setBackgroundColor(image);
            
            pwidth.setVisible(false);
            pwidthval.setVisible(false);
            
            pheight.setVisible(false);
            pheightval.setVisible(false);
            
            ptype.setVisible(false);
            ptypeval.setVisible(false);
            
            ploc.setVisible(false);
            plocval.setVisible(false);
            
            psize.setVisible(false);
            psizeval.setVisible(false);
            
        //    img.setEffect(new BoxBlur(0,0,0));
            setShadow();
    }
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

@FXML
void preImg(ActionEvent event) {
try{
    if(selectedFile != null){
            if(currentIndex==0){
                currentIndex = length;
            }
            currentIndex--;            
            Image image = new Image(fList[currentIndex].toURI().toString());
            img.setImage(image);
            setTitleOnStage(fList[currentIndex].getName(),event);
            img_width = (int) image.getWidth();
            img_height = (int) image.getHeight();
            checkDimentions(img_width, img_height);
            centerImage(img);  
            new SlideInLeft(img).play();
           // setBackgroundColor(image);
            
            pwidth.setVisible(false);
            pwidthval.setVisible(false);
            
            pheight.setVisible(false);
            pheightval.setVisible(false);
            
            ptype.setVisible(false);
            ptypeval.setVisible(false);
            
            ploc.setVisible(false);
            plocval.setVisible(false);
            
            psize.setVisible(false);
            psizeval.setVisible(false);
            
         //   img.setEffect(new BoxBlur(0,0,0));
            setShadow();
    }
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

    @FXML
    void changeImage(KeyEvent event) {
        try{
        if(event.getCode().toString().equals("LEFT")){
            //preImg code
            if(selectedFile != null){
            if(currentIndex==0){
                currentIndex = length;
            }
            currentIndex--;            
            Image image = new Image(fList[currentIndex].toURI().toString());
            img.setImage(image);
            file_name.setText(fList[currentIndex].getName());
            img_width = (int) image.getWidth();
            img_height = (int) image.getHeight();
            checkDimentions(img_width, img_height);
            centerImage(img);  
            new SlideInLeft(img).play();
           // setBackgroundColor(image);
            
            pwidth.setVisible(false);
            pwidthval.setVisible(false);
            
            pheight.setVisible(false);
            pheightval.setVisible(false);
            
            ptype.setVisible(false);
            ptypeval.setVisible(false);
            
            ploc.setVisible(false);
            plocval.setVisible(false);
            
            psize.setVisible(false);
            psizeval.setVisible(false);
            
          //  img.setEffect(new BoxBlur(0,0,0));
            setShadow();
    }
        }
        
        if(event.getCode().toString().equals("RIGHT")){
            //nextImg code
            if(selectedFile != null){   
            currentIndex++;
            if(currentIndex==length){
                currentIndex = 0;
            }            
            Image image = new Image(fList[currentIndex].toURI().toString());
            img.setImage(image);
            file_name.setText(fList[currentIndex].getName());
            img_width = (int) image.getWidth();
            img_height = (int) image.getHeight();
            checkDimentions(img_width, img_height);
            centerImage(img);  
            new SlideInRight(img).play();
          //  setBackgroundColor(image);
            
            pwidth.setVisible(false);
            pwidthval.setVisible(false);
            
            pheight.setVisible(false);
            pheightval.setVisible(false);
            
            ptype.setVisible(false);
            ptypeval.setVisible(false);
            
            ploc.setVisible(false);
            plocval.setVisible(false);
            
            psize.setVisible(false);
            psizeval.setVisible(false);
            
        //    img.setEffect(new BoxBlur(0,0,0));
            setShadow();
    }
        }
        if(event.getCode().toString().equals("DELETE")){
            delete_file(event);
        }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

private int indexOf(File[] files, File f) {
    for (int i=0; i < files.length; i++)  {
       if (files[i].equals(f)) {
          return i;
       } 
    }
    return -1;
}

public void setBackgroundColor(Image image){
 /*       int color = image.getPixelReader().getArgb(5,5);
        int red = (color >> 16) & 0xff;
        int green = (color >> 8) & 0xff;
        int blue = color & 0xff;
        lbl.setStyle("-fx-background-color: rgba("+red+","+green+","+blue+","+0.3+")");*/
}

void setTitleOnStage(String name, Event event ){
        Stage stage = (Stage)ap.getScene().getWindow();
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        stage.setTitle("FX Viewer - "+name);
        file_name.setText(name);
}

void checkDimentions(int img_width, int img_height){
        if(img_height <= 500 || img_width <=500){
        if(img_height <=500 && img_width <=500){
        img.setFitWidth(width);
        img.setFitHeight(img_height); 
        img.setTranslateY((height/2)-(img_height/2)-40);
        }
        else{      
            img.setFitWidth(width);
            img.setFitHeight(img_height);
            img.setTranslateY((height/2)-(img_height/2)-40);
            img.setTranslateX(width/2);    
        }
        
        }
        else{                     
            img.setFitWidth(width);
            img.setFitHeight(height-120);
            img.setTranslateY(0);
        }
        img.setPreserveRatio(true);

}

void setShadow(){
    e.setWidth(0);
    e.setHeight(0);
    e.setOffsetX(0);
    e.setOffsetY(0);
    e.setRadius(10);
    img.setEffect(e);
}

private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }

public void hide(Event event){
new FlipOutY(img).play();
setTitleOnStage(fList[currentIndex+1].getName(),event);
new FlipInY(img).play();
try{  
    
       Path p = Paths.get(""+fList[currentIndex]+"");
       dos = Files.readAttributes(p, DosFileAttributes.class);
       Files.setAttribute(p, "dos:hidden", true);
      // System.out.println(dos.isHidden());
    
            currentIndex++;
            if(currentIndex==length){
                currentIndex = 0;
            }            
            Image image = new Image(fList[currentIndex].toURI().toString());
            img.setImage(image);            
            img_width = (int) image.getWidth();
            img_height = (int) image.getHeight();
            checkDimentions(img_width, img_height);
            centerImage(img);  
            setBackgroundColor(image);  
            refreshList();  // to refresh the list of image files
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }         
}

public void refreshList(){
        fList = directory.listFiles(fileNameFilter); //apply file filters here and above to only show image format files
        length = directory.listFiles(fileNameFilter).length;        
        currentIndex = indexOf(fList, fList[currentIndex-1]);
}


void startupAnimations(){
      RotateTransition rotate = new RotateTransition(Duration.seconds(3), settings);
      rotate.setByAngle(360);
      rotate.setDelay(Duration.seconds(1));
      rotate.setRate(1);
      rotate.setCycleCount(1);
      rotate.play();
      
      RotateTransition rotate1 = new RotateTransition(Duration.seconds(3), close_btn);
      rotate1.setByAngle(360);
      rotate1.setDelay(Duration.seconds(1));
      rotate1.setRate(1);
      rotate1.setCycleCount(1);
      rotate1.play();
      
      RotateTransition rotate2 = new RotateTransition(Duration.seconds(3), min);
      rotate2.setByAngle(360);
      rotate2.setDelay(Duration.seconds(1));
      rotate2.setRate(1);
      rotate2.setCycleCount(1);
      rotate2.play();
                            
      RotateTransition rotate3 = new RotateTransition(Duration.seconds(3), open);
      rotate3.setByAngle(360);
      rotate3.setDelay(Duration.seconds(1));
      rotate3.setRate(1);
      rotate3.setCycleCount(1);
      rotate3.play();      
      
      TranslateTransition transition = new TranslateTransition();
      transition.setDuration(Duration.seconds(2));
      transition.setToX(80);
      transition.setToY(0);
      transition.setAutoReverse(true);
      transition.setCycleCount(2);
      transition.setNode(logo);
      transition.play();
      

     /* settings.setLayoutX(50);
      settings.setLayoutY(50);
      TranslateTransition transition = new TranslateTransition();
      transition.setDuration(Duration.seconds(3));
      transition.setToX(500);
      transition.setToY(500);
      transition.setAutoReverse(true);
      transition.setCycleCount(Animation.INDEFINITE);
      transition.setNode(settings);
      transition.play();
      
      ScaleTransition scale = new ScaleTransition(Duration.seconds(3), settings);
      scale.setCycleCount(Animation.INDEFINITE);
      scale.setAutoReverse(true);
      scale.setToX(2);
      scale.setToY(2);
      scale.play();
      
      RotateTransition rotate = new RotateTransition(Duration.seconds(2), min);
      rotate.setByAngle(360);
      rotate.setDelay(Duration.seconds(1));
      rotate.setRate(10);
      rotate.setCycleCount(10);
      rotate.play();
      
      Circle cir = new Circle(200);
      cir.setLayoutX(00);
      cir.setLayoutY(00);
      PathTransition pt = new PathTransition();
      pt.setNode(min);
      pt.setPath(cir);
      pt.setDuration(Duration.seconds(2));
      pt.setAutoReverse(true);
      pt.setCycleCount(Animation.INDEFINITE);
      pt.play();*/
      
  /* works only for shapes, not for buttons
      FillTransition fill = new FillTransition(Duration.seconds(3), settings, Color.green, Color.BLUE);
      fill.setCycleCount(Animation.INDEFINITE);
      fill.setAutoReverse(true);
      fill.play();*/
}

    
}
// Developed by : Akash Tripathi on 12/12/2018. I am a software developer, graphics designer, web developer
// I have worked on many softwares, websites and graphics
// My work can be seen on my personal portfolio website: darkdeveloperz.github.io.