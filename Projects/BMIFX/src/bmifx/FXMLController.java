package bmifx;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
       @FXML
    private Button button;

    @FXML
    private TextField weightdis;

    @FXML
    private TextField heightinch;

    @FXML
    private TextField heightfeet;

    @FXML
    private TextField bmidis;

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        double weight = Double.parseDouble(weightdis.getText());
        
        double feet = Double.parseDouble(heightfeet.getText());
        
        double inch = Double.parseDouble(heightinch.getText());
        
        double finalheight = (feet*0.3048)+(inch*0.0254);
        
        double bmi = weight / (finalheight*finalheight);
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        
        bmidis.setText(String.valueOf(df.format(bmi)));
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
