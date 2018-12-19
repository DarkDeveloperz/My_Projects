/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

 
package clockfx;

import static clockfx.ClockFX.a;
import static clockfx.ClockFX.d;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXColorPicker;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import com.jfoenix.controls.JFXToggleButton;
import com.jfoenix.effects.JFXDepthManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.util.Duration;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author akash
 */
public class FXMLDocumentController implements Initializable {
    
    wall w;
    
    @FXML
    private AnchorPane parent,top_bar,clock_view,stopwatch_view,alarm_view,calander_view,power_view;
    
    @FXML
    private ImageView clock,alarm,stopwatch,calander,power,off,plus,info,audio,opacity,depth,theme;
    
    @FXML
    private JFXColorPicker colorPicker,colorPicker1;
    
    @FXML
    private Slider slider,depthslider;
       
    @FXML
    private JFXToggleButton stopwatch_start,alarm_start;
    
    @FXML
    private JFXTextField hh,mm;
    
    @FXML
    private JFXComboBox<?> am_pm;
    
    @FXML
    private JFXDatePicker date;

    @FXML
    private JFXTimePicker time;
    
    @FXML
    private JFXCheckBox glass;
    
    @FXML
    private Label text,month,hour,minute,dn,c1,day,date1,hh1,mm1,ss1,c2,c3,c4,text1,text2,text3,text4,text5,text6,text7;
       
    JFXDepthManager manager;
    
    int timerun = 0;
    
    
    
      @FXML
    void handleCheck(MouseEvent event) {
        int x = w.readCount();
        if(glass.isPressed())
        {
            x++;    
        }
        
        if(x%2!=0)
        {           
            top_bar.setStyle("-fx-background-radius:6");
            clock_view.setStyle("-fx-background-radius:6");
            alarm_view.setStyle("-fx-background-radius:6");
            stopwatch_view.setStyle("-fx-background-radius:6");
            calander_view.setStyle("-fx-background-radius:6");
            power_view.setStyle("-fx-background-radius:6");
            w.writeCount(x+"");
            
        }
        else
        {
            top_bar.setStyle("-fx-background-radius:");
            clock_view.setStyle("-fx-background-radius:");
            alarm_view.setStyle("-fx-background-radius:");
            stopwatch_view.setStyle("-fx-background-radius:");
            calander_view.setStyle("-fx-background-radius:");
            power_view.setStyle("-fx-background-radius:");
            
             if(x==2)
             {
                 x=0;
                  w.writeCount(x+"");
             }
        }

    }
   
    
    
    @FXML
    void changeColor(ActionEvent event){
        
    Color selectedColor = colorPicker.getValue();
    colorPicker1.setValue(selectedColor);
    stopwatch_start.setToggleColor(selectedColor);
    stopwatch_start.setUnToggleColor(selectedColor);
    stopwatch_start.setUnToggleLineColor(Color.WHITE);
    alarm_start.setToggleColor(selectedColor);
    alarm_start.setUnToggleColor(selectedColor);
    alarm_start.setUnToggleLineColor(Color.WHITE);

    top_bar.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectedColor.toString()), CornerRadii.EMPTY, Insets.EMPTY)));    
    clock_view.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectedColor.toString()), CornerRadii.EMPTY, Insets.EMPTY))); 
    stopwatch_view.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectedColor.toString()), CornerRadii.EMPTY, Insets.EMPTY))); 
    alarm_view.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectedColor.toString()), CornerRadii.EMPTY, Insets.EMPTY))); 
    calander_view.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectedColor.toString()), CornerRadii.EMPTY, Insets.EMPTY))); 
    power_view.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectedColor.toString()), CornerRadii.EMPTY, Insets.EMPTY))); 

    String color = toRGBCode(selectedColor);
    w.writeBgColor(color,selectedColor);

    glass.setStyle("-jfx-checked-color:"+color+"");
        
//slider.getStyleClass().add("sliderStyle");

    }
    
     public  String toRGBCode( Color color )
    {
        
        return String.format( "#%02X%02X%02X", (int)( color.getRed() * 255 ), (int)( color.getGreen() * 255 ),(int)( color.getBlue() * 255 ) );
    }
    
    
    @FXML
    void changeFontColor(ActionEvent event) {

        Color selectedColor = colorPicker1.getValue();
        colorPicker1.setValue(colorPicker.getValue());
        text.setTextFill(selectedColor);
        month.setTextFill(selectedColor);
        hour.setTextFill(selectedColor);
        minute.setTextFill(selectedColor);
        dn.setTextFill(selectedColor);
        c1.setTextFill(selectedColor);
        day.setTextFill(selectedColor);
        date1.setTextFill(selectedColor);
        hh1.setTextFill(selectedColor);
        mm1.setTextFill(selectedColor);
        ss1.setTextFill(selectedColor);
        c2.setTextFill(selectedColor);
        c3.setTextFill(selectedColor);
        stopwatch_start.setTextFill(selectedColor);
        hh.setFocusColor(selectedColor);
        hh.setUnFocusColor(selectedColor);
        c4.setTextFill(selectedColor);
        mm.setFocusColor(selectedColor);
        mm.setUnFocusColor(selectedColor);
        am_pm.setFocusColor(selectedColor);
        am_pm.setUnFocusColor(selectedColor);
        alarm_start.setTextFill(selectedColor);
        text1.setTextFill(selectedColor);
        text2.setTextFill(selectedColor);
        text3.setTextFill(selectedColor);
        text4.setTextFill(selectedColor);
        text5.setTextFill(selectedColor);
        text6.setTextFill(selectedColor);
        text7.setTextFill(selectedColor);
        
    String color = toRGBCode(selectedColor);
    w.writeFontColor(color);
    
    }
    
    @FXML
    void changeDepth(MouseEvent event) 
    {
        
     depthslider.valueProperty().addListener(new javafx.beans.value.ChangeListener() {
            @Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
                
                manager.setDepth(clock, (int) depthslider.getValue());
                manager.setDepth(alarm, (int) depthslider.getValue());
                manager.setDepth(stopwatch, (int) depthslider.getValue());
                manager.setDepth(calander, (int) depthslider.getValue());
                manager.setDepth(power, (int) depthslider.getValue());
                manager.setDepth(off, (int) depthslider.getValue());
                manager.setDepth(stopwatch_start, (int) depthslider.getValue());
                manager.setDepth(alarm_start, (int) depthslider.getValue());
                manager.setDepth(plus, (int) depthslider.getValue());
                manager.setDepth(date, (int) depthslider.getValue());
                manager.setDepth(time, (int) depthslider.getValue());
                manager.setDepth(info, (int) depthslider.getValue());
                manager.setDepth(audio, (int) depthslider.getValue());
                manager.setDepth(depth, (int) depthslider.getValue());
                manager.setDepth(opacity, (int) depthslider.getValue());
                manager.setDepth(theme, (int) depthslider.getValue());
                manager.setDepth(month, (int) depthslider.getValue());
                manager.setDepth(hour, (int) depthslider.getValue());
                manager.setDepth(minute, (int) depthslider.getValue());
                manager.setDepth(dn, (int) depthslider.getValue());
                manager.setDepth(c1, (int) depthslider.getValue());
                manager.setDepth(day, (int) depthslider.getValue());
                manager.setDepth(date1, (int) depthslider.getValue());
                manager.setDepth(hh1, (int) depthslider.getValue());
                manager.setDepth(mm1, (int) depthslider.getValue());
                manager.setDepth(ss1, (int) depthslider.getValue());
                manager.setDepth(c2, (int) depthslider.getValue());
                manager.setDepth(c3, (int) depthslider.getValue());
                manager.setDepth(hh, (int) depthslider.getValue());
                manager.setDepth(mm, (int) depthslider.getValue());
                manager.setDepth(c4, (int) depthslider.getValue());
                manager.setDepth(am_pm, (int) depthslider.getValue());
                manager.setDepth(text, (int) depthslider.getValue());
                manager.setDepth(text1, (int) depthslider.getValue());
                manager.setDepth(text2, (int) depthslider.getValue());
                manager.setDepth(text3, (int) depthslider.getValue());
                manager.setDepth(text4, (int) depthslider.getValue());
                manager.setDepth(text5, (int) depthslider.getValue());
                manager.setDepth(text6, (int) depthslider.getValue());
                manager.setDepth(text7, (int) depthslider.getValue());
                manager.setDepth(slider,(int) depthslider.getValue());
                manager.setDepth(depthslider,(int) depthslider.getValue());
                
                w.writeDepth(((int) depthslider.getValue())+"");
            }
        });    
    }
    
    @FXML
    void changeOpacity(MouseEvent event)
    {
        slider.valueProperty().addListener(new javafx.beans.value.ChangeListener() {
            @Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
            parent.setOpacity(slider.getValue());   
            w.writeOpacity((slider.getValue())+"");
            }
        });

    }

    @FXML
    private void handleButtonAction(MouseEvent event) {
        
        if(event.getTarget() == clock)
        {
            clock_view.setVisible(true);
            stopwatch_view.setVisible(false);
            alarm_view.setVisible(false);
            calander_view.setVisible(false);
            power_view.setVisible(false);
            makeFadeInTransition(clock_view,500);
        }
        
        else if(event.getTarget() == alarm)
        {
            alarm_view.setVisible(true);
            clock_view.setVisible(false);
            stopwatch_view.setVisible(false);         
            calander_view.setVisible(false);
            power_view.setVisible(false);
            makeFadeInTransition(alarm_view,500);
        }
        
        else if(event.getTarget() == stopwatch)
        {
            stopwatch_view.setVisible(true);
            clock_view.setVisible(false);       
            alarm_view.setVisible(false);
            calander_view.setVisible(false);
            power_view.setVisible(false);
            makeFadeInTransition(stopwatch_view,500);
        }
        
        else if(event.getTarget() == calander)
        {
            calander_view.setVisible(true);
            clock_view.setVisible(false);
            stopwatch_view.setVisible(false);
            alarm_view.setVisible(false);
            power_view.setVisible(false);
            makeFadeInTransition(calander_view,500);
            
    /* String z[] = w.readBgColor();
     String v = z[0];
     String w = z[1];
     changeBgColor(v,w);*/
        }
        
        else if(event.getTarget() == power)
        {
            power_view.setVisible(true);
            clock_view.setVisible(false);
            stopwatch_view.setVisible(false);
            alarm_view.setVisible(false);
            calander_view.setVisible(false);           
            makeFadeInTransition(power_view,500);
        }
        
        else if(event.getTarget() == top_bar)
        {
            makeFadeOutTransition(clock_view,500);
            makeFadeOutTransition(stopwatch_view,500);
            makeFadeOutTransition(alarm_view,500);
            makeFadeOutTransition(calander_view,500);
            makeFadeOutTransition(power_view,500);   
        }

        else if(event.getTarget() ==  off)
        {
            System.exit(0);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
/*new Thread()
{
@Override
public void run()
{
while(timerun==0)
{
InputStream music = null;
try
{
if(a==0)
{
music = new FileInputStream(new File("./audio/1.wav"));
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
    try {  
        Thread.sleep(1000);
    } catch (InterruptedException ex) {
    }
}   
}
}.start();*/

new Thread()
{
    @Override
    public void run()
    {
        while(timerun==0)
{
        Calendar cal = new GregorianCalendar();
        int a = cal.get(Calendar.MONTH);
        switch(a)
        {
            case 0 : month.setText("Janruary");
                break;
            case 1 : month.setText("February");
                break;
            case 2 : month.setText("March");
                break;
            case 3 : month.setText("April");
                break;
            case 4 : month.setText("May");
                break;
            case 5 : month.setText("June");
                break;
            case 6 : month.setText("July");
                break;
            case 7 : month.setText("August");
                break;
            case 8 : month.setText("September");
                break;
            case 9 : month.setText("October");
                break;
            case 10 : month.setText("November");
                break;
            case 11 : month.setText("December");
                break;
        }
        
        int AM_PM = cal.get(Calendar.AM_PM);
        String dn1 = null;
        if(AM_PM == 1)
        {
            dn1 = "PM";
        }
            else
        {
            dn1 = "AM";
        }
        dn.setText(dn1);
        
       
      
        
}
    }
}.start();



        
       top_bar.setOpacity(0);
       makeFadeInTransition(top_bar,3500);
       colorPicker.setValue(Color.rgb(21, 101, 192));
       colorPicker1.setValue(Color.rgb(21, 101, 192));
       
       manager = new JFXDepthManager();
       
       w = new wall();
       
       double x = w.readOpacity();
       parent.setOpacity(x);
       slider.setValue(x);
       
       int y = w.readDepth();
       changeDepth(y);
       depthslider.setValue(y);
     
       colorPicker.setFocusTraversable(false);

     String z[] = w.readBgColor();
     String v = z[0];
     String a = z[1];
     changeBgColor(v,a);
     
     String b = w.readFontColor();
     changeFontColor(b);
     
     int c = w.readCount();
     if(c%2==0)
        {
            top_bar.setStyle("-fx-background-radius:");
            clock_view.setStyle("-fx-background-radius:");
            alarm_view.setStyle("-fx-background-radius:");
            stopwatch_view.setStyle("-fx-background-radius:");
            calander_view.setStyle("-fx-background-radius:");
            power_view.setStyle("-fx-background-radius:");
        }
        else
        {
            top_bar.setStyle("-fx-background-radius:6");
            clock_view.setStyle("-fx-background-radius:6");
            alarm_view.setStyle("-fx-background-radius:6");
            stopwatch_view.setStyle("-fx-background-radius:6");
            calander_view.setStyle("-fx-background-radius:6");
            power_view.setStyle("-fx-background-radius:6");
            glass.setSelected(true);
  
        }

    }    

    private void makeFadeInTransition(Node x, int d) {
        
      FadeTransition ft = new FadeTransition();
      ft.setDuration(Duration.millis(d));
      ft.setNode(x);
      ft.setFromValue(0);
      ft.setToValue(1);
      ft.play();
      
    }
    
    private void makeFadeOutTransition(Node x, int d) {
        
      FadeTransition ft = new FadeTransition();
      ft.setDuration(Duration.millis(d));
      ft.setNode(x);
      ft.setFromValue(1);
      ft.setToValue(0);
      ft.play();
      
    }

    private void changeDepth(int y) {
        
                manager.setDepth(clock, y);
                manager.setDepth(alarm, y);
                manager.setDepth(stopwatch, y);
                manager.setDepth(calander, y);
                manager.setDepth(power, y);
                manager.setDepth(off, y);
                manager.setDepth(stopwatch_start, y);
                manager.setDepth(alarm_start, y);
                manager.setDepth(plus, y);
                manager.setDepth(info, y);
                manager.setDepth(audio, y);
                manager.setDepth(depth,y);
                manager.setDepth(opacity, y);
                manager.setDepth(theme, y);
                manager.setDepth(month, y);
                manager.setDepth(hour, y);
                manager.setDepth(minute, y);
                manager.setDepth(dn, y);
                manager.setDepth(c1, y);
                manager.setDepth(day, y);
                manager.setDepth(date1, y);
                manager.setDepth(hh1, y);
                manager.setDepth(mm1, y);
                manager.setDepth(ss1, y);
                manager.setDepth(c2, y);
                manager.setDepth(c3, y);
                manager.setDepth(hh, y);
                manager.setDepth(mm, y);
                manager.setDepth(c4, y);
                manager.setDepth(am_pm, y);
                manager.setDepth(date, y);
                manager.setDepth(time, y);
                manager.setDepth(text, y);
                manager.setDepth(text1, y);
                manager.setDepth(text2, y);
                manager.setDepth(text3, y);
                manager.setDepth(text4, y);
                manager.setDepth(text5, y);
                manager.setDepth(text6, y);
                manager.setDepth(text7, y);
                manager.setDepth(slider,y);
                manager.setDepth(depthslider,y);
        
    }

    private void changeBgColor(String v, String w) {
        
        Color c = Color.valueOf(v);
        colorPicker1.setValue(c);
        colorPicker.setValue(c);
        Color d = Color.valueOf(w);
        
    top_bar.setBackground(new Background(new BackgroundFill(Paint.valueOf(d.toString()),CornerRadii.EMPTY, Insets.EMPTY)));    
    clock_view.setBackground(new Background(new BackgroundFill(Paint.valueOf(d.toString()), CornerRadii.EMPTY, Insets.EMPTY))); 
    stopwatch_view.setBackground(new Background(new BackgroundFill(Paint.valueOf(d.toString()), CornerRadii.EMPTY, Insets.EMPTY))); 
    alarm_view.setBackground(new Background(new BackgroundFill(Paint.valueOf(d.toString()), CornerRadii.EMPTY, Insets.EMPTY))); 
    calander_view.setBackground(new Background(new BackgroundFill(Paint.valueOf(d.toString()), CornerRadii.EMPTY, Insets.EMPTY))); 
    power_view.setBackground(new Background(new BackgroundFill(Paint.valueOf(d.toString()), CornerRadii.EMPTY, Insets.EMPTY))); 
    
    top_bar.setStyle("-fx-background-color:"+d+"");
    clock_view.setStyle("-fx-background-color:"+d+"");
    stopwatch_view.setStyle("-fx-background-color:"+d+"");
    alarm_view.setStyle("-fx-background-color:"+d+"");
    calander_view.setStyle("-fx-background-color:"+d+"");
    power_view.setStyle("-fx-background-color:"+d+"");
    glass.setStyle("-jfx-checked-color:"+v+"");
    
    

     //slider.lookupAll(".track").forEach(n -> n.setStyle("-fx-background-color:black"));
    
    top_bar.applyCss();
    clock_view.applyCss();
    stopwatch_view.applyCss();
    alarm_view.applyCss();
    calander_view.applyCss();
    power_view.applyCss();
    
    stopwatch_start.setToggleColor(c);
    stopwatch_start.setUnToggleColor(c);
    stopwatch_start.setUnToggleLineColor(Color.WHITE);
    alarm_start.setToggleColor(c);
    alarm_start.setUnToggleColor(c);
    alarm_start.setUnToggleLineColor(Color.WHITE);

    date.setDefaultColor(c);
    time.setDefaultColor(c);
    time.applyCss();
    date.applyCss();

    }

    private void changeFontColor(String b) {
        
        Color c = Color.valueOf(b);
        text.setTextFill(c);
        month.setTextFill(c);
        hour.setTextFill(c);
        minute.setTextFill(c);
        dn.setTextFill(c);
        c1.setTextFill(c);
        day.setTextFill(c);
        date1.setTextFill(c);
        hh1.setTextFill(c);
        mm1.setTextFill(c);
        ss1.setTextFill(c);
        c2.setTextFill(c);
        c3.setTextFill(c);
        stopwatch_start.setTextFill(c);
        hh.setFocusColor(c);
        hh.setUnFocusColor(c);
        c4.setTextFill(c);
        mm.setFocusColor(c);
        mm.setUnFocusColor(c);
        am_pm.setFocusColor(c);
        am_pm.setUnFocusColor(c);
        alarm_start.setTextFill(c);
        text1.setTextFill(c);
        text2.setTextFill(c);
        text3.setTextFill(c);
        text4.setTextFill(c);
        text5.setTextFill(c);
        text6.setTextFill(c);
        text7.setTextFill(c);
       
    }
  
}

