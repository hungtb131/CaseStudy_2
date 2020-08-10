package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField signupFirstname;

    @FXML
    private TextField signupLastname;

    @FXML
    private TextField signupPassword;

    @FXML
    private TextField signupUserName;

    @FXML
    private CheckBox signupCheckboxMale;

    @FXML
    private CheckBox signupCheckboxFemale;

    @FXML
    private TextField signupLocation;

    @FXML
    private Button SignupButton;

    @FXML
    private CheckBox signupCheckboxLGBT;

    @FXML
    void signupFirstname(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert signupFirstname != null : "fx:id=\"signupFirstname\" was not injected: check your FXML file 'signup.fxml'.";
        assert signupLastname != null : "fx:id=\"signupLastname\" was not injected: check your FXML file 'signup.fxml'.";
        assert signupPassword != null : "fx:id=\"signupPassword\" was not injected: check your FXML file 'signup.fxml'.";
        assert signupUserName != null : "fx:id=\"signupUserName\" was not injected: check your FXML file 'signup.fxml'.";
        assert signupCheckboxMale != null : "fx:id=\"signupCheckboxMale\" was not injected: check your FXML file 'signup.fxml'.";
        assert signupCheckboxFemale != null : "fx:id=\"signupCheckboxFemale\" was not injected: check your FXML file 'signup.fxml'.";
        assert signupLocation != null : "fx:id=\"signupLocation\" was not injected: check your FXML file 'signup.fxml'.";
        assert SignupButton != null : "fx:id=\"SignupButton\" was not injected: check your FXML file 'signup.fxml'.";
        assert signupCheckboxLGBT != null : "fx:id=\"signupCheckboxLGBT\" was not injected: check your FXML file 'signup.fxml'.";

    }
    private void creatUser(){
        String name = signupFirstname.getText();
        String lastName = signupLastname.getText();
        String userName = signupUserName.getText();
        String password = signupPassword.getText();
        String location = signupLocation.getText();
        String gender = "";
        if (signupCheckboxFemale.isSelected()){
            gender = "Female";
        }else if (signupCheckboxMale.isSelected()){
            gender = "Male";
        }else {
            gender = "LGBT";
        }

    }

}