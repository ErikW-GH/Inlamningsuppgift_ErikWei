package org.example;

public class User {

    private int id;
    private String name;
    private String email;

    public int getId() {
        return this.id;
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
    // Mainly used as debug
    @Override
    public String toString() {
        return " ID:" + +id + " Name:" +
                name + " E-mail:" +
                email + ' '
                ;
    }

}

