package sample.model;

import java.io.IOException;

public class AddUsersDemo {
    private static final String PATH = "src\\sample\\data\\users.txt";

    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement(PATH);

        User user1 = new User("Trinh","Hung","hungtrinh","123456","ND","male");
        User user2 = new User("Pham","Tuyen","tuyenpham","123456","HN","male");
        User user3 = new User("Pham","Binh","binhpham","123456","HN","male");
        User user4 = new User("Pham","Trinh","trinhpham","123456","HD","female");

        userManagement.addUser(user1);
        userManagement.addUser(user2);
        userManagement.addUser(user3);
        userManagement.addUser(user4);

        try {
            userManagement.wrireFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}