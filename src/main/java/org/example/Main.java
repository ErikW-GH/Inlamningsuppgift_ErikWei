package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Skapa en UserList
        //UserList userList = new UserList();

        System.out.println(
                "########### Inlämningsuppgift ###########"
        );
        askStart();

        //System.out.println("1. Add user");

        /*
        // New instance
        var user1 = new User(userID, "Erik", "erikwei@hotmail.com");
        //var user2 = new User(2, "Erik2", "erikwei2@hotmail.com");

        // Creates an Array for User
        List<User> UserList = new ArrayList<>();

        UserList.add(user1);
        //UserList.add(user2);

        // Print .toString for debug
        System.out.println(UserList.toString());
        */


        /*User user1 = new User();
        user1.setId(userID);
        user1.setName("Erik");
        user1.setEmail("erikwei@hotmail.com");

        System.out.println("Enter id:");

        // Try-catch for unintended input, will update to while loop to restart at input
        try {
            userID = Integer.parseInt(userInput.nextLine());
        } catch (Exception ex) {
            System.out.println("Error: Could not parse age to number, exiting");
            return; //exit function
        }
        User user2 = new User();
        user2.setId(userID);
        user2.setName("Erik");
        user2.setEmail("erikwei@hotmail.com");
        //User user2 = new User(2, "Erik2", "erikwei@hotmail.com2");*/

        // Lägg till användarna till listan
        /*userList.addUser(new User(userID, "Erik", "erikwei@hotmail.com"));
        System.out.println(userID);
        userID = setUserID(userInput);
        if (userID == null) return; //exit function
        userList.addUser(new User(userID, "David", "david@live.com"));*/

        // Skriv ut namnen på alla användare i listan
        /*for (int i = 0; i < userList.getSize(); i++) {
            System.out.println(userList.getUser(i));
        }

         */


        /*User user1 = new User(1, "Alice", "alice@gmail.com");
        User user2 = new User(2, "Bob", "bob@live.com");

        // Skapa en UserList
        UserList userList = new UserList();

        // Lägg till användarna till listan
        userList.addUser(user1);
        userList.addUser(user2);*/

    }

    private static Integer setUserID(Scanner userInput) {
        int userID;

        // Try-catch for unintended input, will update to while loop to restart at input
        try {
            userID = Integer.parseInt(userInput.nextLine());
        } catch (Exception ex) {
            System.out.println("Error: Could not parse age to number, exiting");
            return null;
        }
        return userID;
    }

    public static void askStart(){
        UserList userList = new UserList();
        System.out.println(
                """
                        Welcome, do you want to:
                        1. Add user
                        2. Remove user
                        3. Get specific user"""
        );



        Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
            case 1:
                System.out.println("1. Add user");
                Scanner userInput = new Scanner(System.in);
                System.out.println("Enter id:");
                Integer userID = setUserID(userInput);

                if (userID == null) return; //exit function
                userList.addUser(new User(userID, "Erik", "erikwei@hotmail.com"));
                for (int i = 0; i < userList.getSize(); i++) {
                    System.out.println(userList.getUser(i));
                }
                break;


            case 2:
                System.out.println("2. Remove user");
                break;

            case 3:
                System.out.println("3. Get specific user");
                break;
            }

    }

}