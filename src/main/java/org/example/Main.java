package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instantiates UserList and Scanner-class
        UserList userList = new UserList();
        Scanner userInput = new Scanner(System.in);

        int option = 0;

        System.out.println(
                "\n" +
                "########### Inlämningsuppgift ###########"
        );

        // Loops back while 0, or after user changes option through the switch-case
        while (option >= 0) {

            option = askAtStart(userInput);

            switch (option) {
                
                case 1: // Add User
                    System.out.println("Enter id:");
                    var userID = inputNumberThanks(userInput);
                    System.out.println("Enter name");
                    var userName = inputAlphabetThanks(userInput);
                    System.out.println("Enter mail");
                    var userMail = inputAlphabetThanks(userInput);

                    //Adds user to Array
                    userList.addUser(new User(userID, userName, userMail));
                    System.out.println("Saved user:" + userName);

                    break;

                case 2: // Remove user
                    System.out.println("Enter name to remove");
                    // Prints list of all Users
                    for (int i = 0; i < userList.getSize(); i++) {

                        System.out.println(userList.getUser(i));
                    }
                    // Removes by name
                    String removeByName = inputAlphabetThanks(userInput);


                    userList.removeUser(removeByName);
                    System.out.println("Successfully removed " + removeByName);
                    break;

                case 3: // Get specific user by Id
                    /*System.out.println("These are the listed users: ");
                    for (int i = 0; i < userList.getSize(); i++) {

                        System.out.println(userList.getUser(i));
                    }
                     */
                    break;

                case 4: // Sort all users by ID/Name
                    System.out.println("Enter '1' to sort by ID or '2' to sort by Name:");
                    String chooseSortType;
                    option = inputNumberThanks(userInput);
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
                    for (int i = 0; i < userList.getSize(); i++) {

                        System.out.println(userList.getUser(i));
                    }
                    break;

                case 0:
                    System.out.println("Exiting");
                    System.exit(0);
                    break;

            }
            // Exits code if boolean is false
            if (!askForGoBack(userInput)) {
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

        //Scanner switchChoice = new Scanner(System.in);
        return inputNumberThanks(userInput);
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
    private static String inputAlphabetThanks(Scanner userInput){

        while (true){

            String noNumberString = userInput.nextLine();
            // Creates an if-check if input string matches alphabet as well as @ and punctuation
            // This is for Name and Email
            if (noNumberString.matches("[a-öA-Ö@.]+")) {
                return noNumberString;
            } else {
                System.out.println("Error: Please input a valid string");
            }
        }
    }

    /**
     *
     * @param userInput Asks for Y/N to continue code
     * @return Y as a true boolean
     */
    private static boolean askForGoBack(Scanner userInput) {
        String response;
        System.out.println("Do you want to go back? (Y/N)");
        do {
            response = userInput.nextLine().trim().toUpperCase();
            if (!response.equals("Y") && !response.equals("N")) {
                System.out.println("Error: Please enter Y or N");
            }
        } while (!response.equals("Y") && !response.equals("N"));

        return response.equals("Y");
    }

}