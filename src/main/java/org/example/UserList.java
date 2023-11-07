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
    public void removeUserById(Integer removeInput) {
        Iterator <User> itr = users.iterator();
        while (itr.hasNext()){
            User userToRemove = itr.next();
            if (userToRemove.getId() == removeInput) {
                itr.remove();
            }

            /*if (userToRemove.getName().equals(removeInput)) {
                itr.remove();
            }
             */

        }
    }
    public void removeUserByString(String removeInputString){
        Iterator <User> itr = users.iterator();
        while (itr.hasNext()){
            User userToRemove = itr.next();
            if (userToRemove.getName().equals(removeInputString)) {
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
    public List<Integer> listAllIds() {
        List<Integer> userIds = new ArrayList<>();
        for (User user : users) {
            userIds.add(user.getId());
        }
        return userIds;
    }
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
