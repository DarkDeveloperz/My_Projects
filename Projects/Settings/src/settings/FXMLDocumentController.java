/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author akash
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ImageView btn_settings,btn_user,btn_exit,btn_awards;
    
    @FXML
    private AnchorPane h_settings,h_user,topbar;
    
    @FXML
    private void handleButtonAction(MouseEvent event) {
        if(event.getTarget() == btn_settings)
        {
            h_settings.setVisible(true);
            h_user.setVisible(false);
        }
        else if(event.getTarget() == btn_user)
        {
            h_user.setVisible(true);
            h_settings.setVisible(false);
        }
        else if(event.getTarget() == btn_awards)
        {
            h_user.setVisible(false);
            h_settings.setVisible(false);
        }
        else if(event.getTarget() == btn_exit)
        {
            System.exit(0);
        }

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
