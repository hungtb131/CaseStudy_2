package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.model.Task;
import sample.model.TaskManager;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TaskListController implements Initializable {
    @FXML
    private TableView<Task> table;

    @FXML
    private TableColumn<Task, Integer> numbOderColumn;

    @FXML
    private TableColumn<Task, String> dateColumn;

    @FXML
    private TableColumn<Task, String> contentColumn;

    @FXML
    private TableColumn<Task, String> timingColumn;

    @FXML
    private TableColumn<Task, String> statusColumn;

    private ObservableList<Task> taskList;

    @FXML
    private TextField numbOderText;

    @FXML
    private TextField dateText;

    @FXML
    private TextField contentText;

    @FXML
    private TextField timingText;

    @FXML
    private TextField statusText;

    @FXML
    private Button add;

    @FXML
    private Button del;

    @FXML
    private Button save;

    private ArrayList<Task> taskArrayList = new ArrayList<>();

    private String path = "C:\\Users\\hungt\\IdeaProjects\\JAVAFX_HelloWorld\\src\\sample\\data\\Tasklist.txt";

    private TaskManager taskManager = new TaskManager(path);


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<Task> myTasklist = new ArrayList<>();
        try {
            myTasklist = taskManager.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        taskList = FXCollections.observableArrayList(
                myTasklist
        );
        numbOderColumn.setCellValueFactory(new PropertyValueFactory<Task,Integer>("numbOder"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<Task,String>("dayCreated"));
        contentColumn.setCellValueFactory(new PropertyValueFactory<Task,String>("taskContent"));
        timingColumn.setCellValueFactory(new PropertyValueFactory<Task,String>("timing"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<Task, String>("status"));
        table.setItems(taskList);
    }

    public void add (ActionEvent e){
        Task newTask = new Task();
        newTask.setNumbOder(Integer.parseInt(numbOderText.getText()));
        newTask.setDayCreated(dateText.getText());
        newTask.setTaskContent(contentText.getText());
        newTask.setTiming(timingText.getText());
        newTask.setStatus(statusText.getText());
        taskList.add(newTask);
    }

    public void del (ActionEvent e){
        Task selected = table.getSelectionModel().getSelectedItem();
        taskList.remove(selected);
    }


    public void save(ActionEvent actionEvent) throws IOException {
        Task newTask = new Task();

        String numOder = numbOderText.getText();
        newTask.setNumbOder(Integer.parseInt(numOder));
        newTask.setDayCreated(dateText.getText());
        newTask.setTaskContent(contentText.getText());
        newTask.setTiming(timingText.getText());
        newTask.setStatus(statusText.getText());

        taskArrayList.add(newTask);

        taskManager.setTasklist(taskArrayList);
        taskManager.wrireFile();
    }
}