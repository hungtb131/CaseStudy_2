package sample.model;

public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String location;
    private String gender;

    public User() {
    }

    public User(final String firstName, final String lastName, final String userName, final String password, final String location, final String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.location = location;
        this.gender = gender;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(final String location) {
        this.location = location;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(final String gender) {
        this.gender = gender;
    }
}
