package org.example;

import java.util.Scanner;

public class Main {
    private static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        // Instantiates UserList
        UserList userList = new UserList();

        int option = 0;
        System.out.println(
                """

                        ########### Inlämningsuppgift ###########
                        """
        );
        menuHandler(option, userList);
    }
    private static void menuHandler(int option, UserList menuList) {
        // Loops back while 0, or after user changes option through the switch-case
        while (option >= 0) {
            option = askAtStart(userInput);
            switch (option) {

                case 1: // Add User
                    addUsers(menuList);
                    break;

                case 2: // Remove user
                    removeUser(menuList);
                    break;

                case 3: // Get specific user by ID or name
                    getByIdOrName(menuList);
                    break;

                case 4: // Sort all users by ID/Name
                    option = sortUser(menuList);
                    break;

                case 0:
                    System.out.println("Exiting");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid menu selection");
                    option = 0;
                    break;

            }
            // Exits code if boolean is false
            if (!askForGoBack()) {
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
        return inputNumberThanks(userInput);
    }
    /**
     * @return Y as a true boolean, N as false
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
    private static void addUsers(UserList userList) {
        System.out.println("Enter id:");
        var userID = inputNumberThanks(Main.userInput);
        if (userList.doesUserExist(userID)) {
            System.out.println("User with the same ID already exists. Please choose a different ID.");
            return; // Exit the function without adding the user.
        }
        System.out.println("Enter name");
        var userName = inputAlphabetThanks();
        System.out.println("Enter mail");
        var userMail = inputAlphabetThanks();

        //Adds user to Array
        userList.addUser(new User(userID, userName, userMail));
        System.out.println("Saved user: " + userName);
    }
    private static void getByIdOrName(UserList menuList) {
        System.out.println("Enter the ID or Name of user you want to get");
        var idOrName = Main.userInput.nextLine();
        User specificUser = menuList.getUserByIdOrName(idOrName);

        if (specificUser != null) {
            System.out.println("User found:" + specificUser);
        } else {
            System.out.println("Not found." + idOrName + " is Error." );
        }
    }
    private static void removeUser(UserList userList) {
        System.out.println("Enter name to remove");
        // Prints list of all Users
        printAllUsers(userList);
        var removeByNum = inputNumberThanks(Main.userInput);

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

        // Removes by id
        System.out.println("Successfully removed id: " + removeByNum + ". Which is: " + userToRemove.getName());
        userList.removeUserById(removeByNum);

        //String removeByName = inputAlphabetThanks(Main.userInput);
        //userList.removeUser(removeByName);
    }

/// Add getSpecificUser

    private static int sortUser(UserList userList) {
        int option = inputNumberThanks(Main.userInput);
        System.out.println("Enter '1' to sort by ID or '2' to sort by Name:");
        String chooseSortType;
        switch (option){
            case 1:
                chooseSortType = "ID";
                userList.userSort(chooseSortType);
                break;
            case 2:
                chooseSortType = "Name";
                userList.userSort(chooseSortType);
                break;
        }
        // Prints out sorted list
        System.out.println("Sorted");

        printAllUsers(userList);
        return option;
    }
    private static void printAllUsers(UserList userList) {
        for (int i = 0; i < userList.getSize(); i++) {

            System.out.println(userList.getUser(i));
        }
    }
    /**
     *
     * @param userInput Input
     * @return Returns only if user input an integer, otherwise will print out error
     */
    private static Integer inputNumberThanks(Scanner userInput) {

        while (true) {

            try {
                //System.out.println("Enter id:");
                return Integer.parseInt(userInput.nextLine());
            }
            catch (NumberFormatException ex) {
                System.out.println("Error: Please input a number");
            }
        }
    }
    private static String inputAlphabetThanks(){

        while (true){

            String noNumberString = Main.userInput.nextLine();
            // Creates an if-check if input string matches alphabet as well as @ and punctuation
            // This is for Name and Email
            if (noNumberString.matches("[a-öA-Ö@.]+")) {
                return noNumberString;
            } else {
                System.out.println("Error: Please input a valid string");
            }
        }
    }


}