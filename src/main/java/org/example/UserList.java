package org.example;

import java.util.ArrayList;

public class UserList {
    private ArrayList<User> users;

    public UserList() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public boolean removeUser(User user) {
        return this.users.remove(user);
    }

    public int getSize() {
        return this.users.size();
    }

    public User getUser(int index) {

        if (index < 0 || index >= this.users.size()) {
            return null; // or throw an exception
        }
        return this.users.get(index);
    }
}
