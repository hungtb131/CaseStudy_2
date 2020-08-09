package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sample.model.Task;
import sample.model.User;
import sample.model.UserManagement;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginUserName;

    @FXML
    private PasswordField loginPassword;

    @FXML
    private Button loginbutton;

    @FXML
    private Button loginSignUpButton;

    @FXML
    void doLogin(MouseEvent event) throws IOException {
        String login = loginUserName.getText();
        String password = loginPassword.getText();

        if (checkLogin(login,password)) {
            Task task1 = new Task("20","21","Ăn","backlog");
            Task task2 = new Task("20","21","Ngủ","backlog");
            Task task3 = new Task("20","21","Chơi","backlog");
            Task task4 = new Task("20","21","Học","backlog");
            Task task5 = new Task("20","21","Nhậu","backlog");

            ObservableList<Task> tasks = FXCollections.observableArrayList(task1,task2,task3,task4,task5);

            ListView<Task> listView = new ListView<>(tasks);

            Parent root = FXMLLoader.load(getClass().getResource("../view/tasklist.fxml"));

            Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } else {
            System.out.println("ReEnter");
        }
    }

    private boolean checkLogin(String login, String password) throws IOException {
        String path = "src\\sample\\data\\users.txt";
        UserManagement userManagement = new UserManagement(path);
        ArrayList<User> users = userManagement.readFile();

        for (User user : users) {
            if (user.getUserName().equals(login) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    @FXML
    void initialize() {
        assert loginUserName != null : "fx:id=\"loginUserName\" was not injected: check your FXML file 'login.fxml'.";
        assert loginPassword != null : "fx:id=\"loginPassword\" was not injected: check your FXML file 'login.fxml'.";
        assert loginbutton != null : "fx:id=\"loginbutton\" was not injected: check your FXML file 'login.fxml'.";
        assert loginSignUpButton != null : "fx:id=\"loginSignUpButton\" was not injected: check your FXML file 'login.fxml'.";

    }
}
