package sample.model;

import java.io.*;
import java.util.ArrayList;

public class UserManagement {
    private static ArrayList<User> users;
    private static File file;

    public UserManagement() {
    }

    public UserManagement(String PATH) {
        file = new File(PATH);
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void wrireFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for (User user : users) {
            objectOutputStream.writeObject(user);
        }
    }

    public ArrayList<User> readFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<User> newList = new ArrayList<>();
        User user = null;
        try {
            while ((user = (User) objectInputStream.readObject()) != null) {
                newList.add(user);
            }
        } catch (EOFException | ClassNotFoundException ignored) {
        }
        return newList;
    }

    public void display() {
        System.out.println("---List User---");
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
