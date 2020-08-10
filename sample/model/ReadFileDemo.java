package sample.model;

import java.io.IOException;

public class ReadFileDemo {
    public static void main(String[] args) throws IOException {
//        String path = "src\\sample\\data\\users.txt";
//        UserManagement userManagement = new UserManagement(path);
//        userManagement.setUsers(userManagement.readFile());
//        userManagement.display();

        String path = "C:\\Users\\hungt\\IdeaProjects\\JAVAFX_HelloWorld\\src\\sample\\data\\Tasklist.txt";

        TaskManager taskManager = new TaskManager(path);
        taskManager.setTasklist(taskManager.readFile());
        taskManager.display();
    }
}