/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml_sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author master
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private Label label;
    @FXML private TextField altroTextField;
    @FXML private RadioButton altroRadioButton;
    
    @FXML
    private void altroButtonAction(ActionEvent event) {
        if(altroTextField.isDisable()){
            altroTextField.setDisable(false);
        }
        else{
            altroTextField.setDisable(true);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
