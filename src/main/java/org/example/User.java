package org.example;

public class User {
    private final int id;
    private final String name;
    private final String email;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    // Override for toString to return all variables
    // Default in every println which references the class User, such as printAllUsers
    @Override
    public String toString() {
        return " ID:" + id +
                " Name:" + name +
                " E-mail:" + email + ' ';
    }
}
