package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class UserList {
    private ArrayList<User> users;

    public UserList() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(String username) {
        Iterator <User> itr = users.iterator();
        while (itr.hasNext()){
            User element = (User) itr.next();
            if (element.getName().equals(username)) {
                itr.remove();
            }
        }
    }

    public int getSize() {
        return this.users.size();
    }

    public User getUser(int getUserIndex)
            throws IndexOutOfBoundsException {

        if (getUserIndex < 0 || getUserIndex >= this.users.size()) {
            throw new IndexOutOfBoundsException("User index out of bounds!");
        }
        return this.users.get(getUserIndex);
    }

    public User getUserByIdOrName(int getUserIndex)
            throws IndexOutOfBoundsException {


        return this.users.get(getUserIndex);
    }

    public void setUser(int index, User user) {
        this.users.set(index, user);
    }

    public void userSort(String sortBy) {
        int arrayLength = this.getSize();
        User tempUser;
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {

                if (sortBy.equals("ID")) {
                    if (this.getUser(j).getId() > this.getUser(j + 1).getId()) {
                        tempUser = this.getUser(j);
                        this.setUser(j, this.getUser(j + 1));
                        this.setUser(j + 1, tempUser);
                    }
                }

                else if (sortBy.equals("Name")) {
                    if (this.getUser(j).getName().charAt(0) > this.getUser(j + 1).getName().charAt(0)) {
                        tempUser = this.getUser(j);
                        this.setUser(j, this.getUser(j + 1));
                        this.setUser(j + 1, tempUser);
                    }
                }
            }
        }
    }

}
