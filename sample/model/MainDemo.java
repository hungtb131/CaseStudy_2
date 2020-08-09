package sample.model;

import java.io.*;
import java.util.ArrayList;

public class MainDemo {
    public static void main(String[] args) throws IOException {
        User user1 = new User("Trinh","Hung","hungtrinh","123456","ND","male");
        String path = "C:\\Users\\hungt\\IdeaProjects\\JAVAFX_HelloWorld\\src\\sample\\data\\" + user1.getUserName() + "tasklist.txt";
        File file = new File(path);

        ArrayList<Task> tasklist = new ArrayList<>();

//        Task task1 = new Task("20","21","Ăn","backlog");
//        Task task2 = new Task("20","21","Ngủ","backlog");
//        Task task3 = new Task("20","21","Chơi","backlog");
//        Task task4 = new Task("20","21","Học","backlog");
//        Task task5 = new Task("20","21","Nhậu","backlog");
//
//        tasklist.add(task1);
//        tasklist.add(task2);
//        tasklist.add(task3);
//        tasklist.add(task4);
//        tasklist.add(task5);
//
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        for (Task task : tasklist) {
//            objectOutputStream.writeObject(task);

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Task task = null;
        try {
            while ((task = (Task) objectInputStream.readObject()) != null) {
                tasklist.add(task);
            }
        } catch (EOFException | ClassNotFoundException ignored) {
        }

        for (Task task1 : tasklist) {
            System.out.println(task1);
        }

    }
}
