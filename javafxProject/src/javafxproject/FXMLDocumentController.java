/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author HP
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private Button fx_btn_SignUp;

    @FXML
    private Button fx_btn_login;

    @FXML
    private TextField fx_label_password;

    @FXML
    private TextField fx_label_username;

    @FXML
    private Button fx_newAccount;

    @FXML
    private TextField fx_signUp_CNE;

    @FXML
    private TextField fx_signUp_ConfirmPassword;

    @FXML
    private TextField fx_signUp_password;

    @FXML

    private TextField fx_signUp_username;

    @FXML
    private Hyperlink fx_text_forget_password;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
