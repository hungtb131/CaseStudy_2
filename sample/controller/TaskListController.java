package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class TaskListController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private GridPane gridTaskList;

    @FXML
    private Label labelBacklog;

    @FXML
    private Label labelDone;

    @FXML
    private Label labelReview;

    @FXML
    private Label labelDoing;

    @FXML
    private ListView<?> listBacklog;

    @FXML
    private ListView<?> listDoing;

    @FXML
    private ListView<?> listReview;

    @FXML
    private ListView<?> listDone;

    @FXML
    void initialize() {
        assert gridTaskList != null : "fx:id=\"gridTaskList\" was not injected: check your FXML file 'tasklist.fxml'.";
        assert labelBacklog != null : "fx:id=\"labelBacklog\" was not injected: check your FXML file 'tasklist.fxml'.";
        assert labelDone != null : "fx:id=\"labelDone\" was not injected: check your FXML file 'tasklist.fxml'.";
        assert labelReview != null : "fx:id=\"labelReview\" was not injected: check your FXML file 'tasklist.fxml'.";
        assert labelDoing != null : "fx:id=\"labelDoing\" was not injected: check your FXML file 'tasklist.fxml'.";
        assert listBacklog != null : "fx:id=\"listBacklog\" was not injected: check your FXML file 'tasklist.fxml'.";
        assert listDoing != null : "fx:id=\"listDoing\" was not injected: check your FXML file 'tasklist.fxml'.";
        assert listReview != null : "fx:id=\"listReview\" was not injected: check your FXML file 'tasklist.fxml'.";
        assert listDone != null : "fx:id=\"listDone\" was not injected: check your FXML file 'tasklist.fxml'.";

    }


}
