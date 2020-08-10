package sample.model;

import java.io.*;
import java.util.ArrayList;

public class TaskManager {
    private static ArrayList<Task> tasklist;
    private static File file;

    public TaskManager() {
    }

    public TaskManager(String PATH) {
        file = new File(PATH);
        tasklist = new ArrayList<>();
    }

    public void addTask (Task task) {
        tasklist.add(task);
    }

    public void wrireFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for (Task task : tasklist) {
            objectOutputStream.writeObject(task);
        }
    }

    public ArrayList<Task> readFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Task> newList = new ArrayList<>();
        Task task = null;
        try {
            while ((task = (Task) objectInputStream.readObject()) != null) {
                newList.add(task);
            }
        } catch (EOFException | ClassNotFoundException ignored) {
        }
        return newList;
    }

    public void display() {
        System.out.println("---List Task---");
        for (Task task : tasklist) {
            System.out.println(task);
        }
    }

    public void setTasklist(ArrayList<Task> tasklist) {
        this.tasklist = tasklist;
    }
}
