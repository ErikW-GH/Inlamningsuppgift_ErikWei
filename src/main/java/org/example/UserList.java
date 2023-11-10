package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserList {
    private final ArrayList<User> users;
    public UserList() {
        this.users = new ArrayList<>();
    }
    public void addUser(User user) {
        this.users.add(user);
    }
    // Boolean check if mentioned user exists with the same input ID
    public boolean doesUserExist(int userId) {
        for (User user : users) {
            if (user.getId() == userId) {
                return true;
            }
        }
        return false;
    }
    // Method which iterates through the users list and
    // finds the corresponding id that user wants to remove
    public void removeUserById(Integer removeInput) {
        Iterator <User> itr = users.iterator();
        while (itr.hasNext()){
            User userToRemove = itr.next();
            if (userToRemove.getId() == removeInput) {
                itr.remove();
            }

        }
    }
    // Method which will remove by string but is not fully implemented
    // Will leave as is, but it is never used
    public void removeUserByString(String removeInputString){
        Iterator <User> itr = users.iterator();
        while (itr.hasNext()){
            User userToRemove = itr.next();
            if (userToRemove.getName().equals(removeInputString)) {
                itr.remove();
            }
        }
    }
    // Returns the size of the ArrayList
    public int getSize() {
        return this.users.size();
    }
    // Throws for a check if input index is out of bounds or doesn't exist/hasn't been created
    public User getUser(int getUserIndex)
            throws IndexOutOfBoundsException {

        if (getUserIndex < 0 || getUserIndex >= getSize()) {
            throw new IndexOutOfBoundsException("User index out of bounds!");
        }
        return this.users.get(getUserIndex);
    }
    // Method which lists all Ids using
    public List<Integer> listAllIds() {
        List<Integer> userIds = new ArrayList<>();
        for (User user : users) {
            userIds.add(user.getId());
        }
        return userIds;
    }
    // Method which will be used to get user information either by id or name
    public User getUserByIdOrName(String idOrNameIndex) {
        for (User user : users) {
            if (String.valueOf(user.getId()).equals(idOrNameIndex) || user.getName().equalsIgnoreCase(idOrNameIndex)) {
                return user;
            }
        }
        return null; // User not found
    }

    public void setUser(int index, User user) {
        this.users.set(index, user);
    }
    // Sorting algorithm using Bubble Sort which we've learned about in previous lessons
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
