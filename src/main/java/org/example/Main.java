package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    // Makes userInput outside psvm so as it will be continually used
    // Making it final will be more secure as no value will be changed
    private static final Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {

        // Instantiates UserList
        UserList userList = new UserList();

        int optInput = 0;

        System.out.println(
                """

                        ########### Inlämningsuppgift ###########
                        """
        );
        menuHandler(optInput, userList);
    }
    private static void menuHandler(int optInput, UserList menuList) {
        // Loops back while 0, or after user changes optInput through the switch-case
        while (optInput >= 0) {
            optInput = askAtStart(userInput);
            switch (optInput) {

                case 1: // Add User
                    addUser(menuList);
                    break;

                case 2: // Remove user
                    removeUser(menuList);
                    break;

                case 3: // Get specific user by ID or name
                    retrieveUser(menuList);
                    break;

                case 4: // Sort all users by ID/Name
                    optInput = sortUser(menuList);
                    break;

                case 0: // Exit code
                    System.out.println("Exiting");
                    System.exit(0);
                    break;

                default: // Defaults if user input anything other than mentioned numbers
                    System.out.println("Invalid menu selection");
                    optInput = 0;
                    break;

            }
            // Go back function, which defaults after every break, except for 'default'
            // Exits code if boolean is false, same as case 0
            if (optInput != 0 && !askForGoBack()) {
                System.out.println("Exiting");
                System.exit(0);
            }
        }
    }

    /**
     * Method which asks and takes the input from the user of listed options
     */
    public static int askAtStart(Scanner userInput) {
        System.out.println(
                """
                        Do you want to:
                        
                        1. Add user
                        2. Remove user
                        3. Get specific user
                        4. Sort all users to ID/Name
                        0. Exit"""
        );
        return forceNumberOnly(userInput);
    }
    /**
     * @return Y as a true boolean, N as false, which will exit code
     */
    private static boolean askForGoBack() {
        String response;
        System.out.println("Do you want to go back? (Y/N)");
        do {
            response = Main.userInput.nextLine().trim().toUpperCase();
            if (!response.equals("Y") && !response.equals("N")) {
                System.out.println("Error: Please enter Y or N");
            }
        } while (!response.equals("Y") && !response.equals("N"));

        return response.equals("Y");
    }
    private static void addUser(UserList userList) {
        System.out.println("Enter id:");
        int userID = forceNumberOnly(Main.userInput);
        if (userList.doesUserExist(userID)) {
            System.out.println("User with the same ID already exists. Please choose a different ID.");
            return; // Exit the function without adding the user.
        }
        System.out.println("Enter name");
        var userName = forceAlphabetOnly();
        System.out.println("Enter mail");
        var userMail = forceAlphabetOnly();

        //Adds user to Array
        userList.addUser(new User(userID, userName, userMail));
        System.out.println("Saved user: " + userName);
    }
    private static void removeUser(UserList userList) {
        System.out.println("Enter name to remove");
        // Prints list of all Users
        printAllUsers(userList);
        var removeByNum = forceNumberOnly(Main.userInput);

        // Initialized User has to be null as it is temporary
        // And as well as not inputting any variables
        User userToRemove = null;

        // For-i loop which gets the size of userList and points to userToRemove
        for (int i = 0; i < userList.getSize(); i++) {
            User user = userList.getUser(i);
            if (user.getId() == removeByNum) {
                userToRemove = user;
                break;
            }
        }
        // Removes by id, prints the name of user removed before removing
        System.out.println("Successfully removed id: " + removeByNum + ". Which is: " + userToRemove.getName());
        userList.removeUserById(removeByNum);
    }
    private static void retrieveUser(UserList menuList) {
        // Instantiates a List to list all current user IDs
        List<Integer> allIds = menuList.listAllIds();
        System.out.println("Available User IDs: " + allIds);

        System.out.println("Enter the ID or Name of user you want to get");
        String idOrName = Main.userInput.nextLine();
        User specificUser = menuList.getUserByIdOrName(idOrName);

        if (specificUser != null) {
            System.out.println("User found:" + specificUser);
        } else {
            System.out.println("Not found." + idOrName + " is Error or does not exist." );
        }
    }
    private static int sortUser(UserList menuList) {
        int option;
        System.out.println("Enter '1' to sort by ID or '2' to sort by Name:");
        String chooseSortType;
        option = forceNumberOnly(userInput);
        switch (option){
            case 1:
                chooseSortType = "ID";
                menuList.userSort(chooseSortType);
                break;
            case 2:
                chooseSortType = "Name";
                menuList.userSort(chooseSortType);
                break;
        }
        // Prints out sorted list
        System.out.println("Sorted");
        for (int i = 0; i < menuList.getSize(); i++) {

            System.out.println(menuList.getUser(i));
        }
        return option;
    }
    private static void printAllUsers(UserList userList) {
        for (int i = 0; i < userList.getSize(); i++) {

            System.out.println(userList.getUser(i));
        }
    }
    /**
     * @param numScan Input
     * @return Returns only if user input an integer, otherwise will print out error
     */
    private static Integer forceNumberOnly(Scanner numScan) {

        
        while (true) {

            try {
                //System.out.println("Enter id:");
                return Integer.parseInt(numScan.nextLine());
            }
            catch (NumberFormatException ex) {
                System.out.println("Error: Please input a number");
            }
        }
    }
    /**
     * @return Returns only if user input an alphabet, otherwise will print out error
     */
    private static String forceAlphabetOnly(){

        while (true){

            String alphabScan = Main.userInput.nextLine();
            // Creates an if-check if input string matches alphabet as well as @ and punctuation
            // This is for Name and Email
            if (alphabScan.matches("[a-öA-Ö@.]+")) {
                return alphabScan;
            } else {
                System.out.println("Error: Please input a valid string");
            }
        }
    }


}