package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  Instantiates UserList and Scanner-class
        UserList userList = new UserList();
        Scanner userInput = new Scanner(System.in);

        int option = 0;

        System.out.println(
                "########### Inlämningsuppgift ###########"
        );

        // Loops back while 0, or after user changes option through the switch-case
        while (option >= 0) {

            option = askAtStart(userInput);

            switch (option) {

                case 1:
                    //System.out.println("1. Add user");
                    System.out.println("Enter id:");
                    var userID = inputNumberThanks(userInput);
                    System.out.println("Enter name");
                    var userName = inputStringThanks(userInput);
                    System.out.println("Enter mail");
                    var userMail = inputStringThanks(userInput);

                    userList.addUser(new User(userID, userName, userMail));
                    System.out.println("Saved user:" + userName);

                    break;

                case 2:
                    //System.out.println("2. Remove user");
                    break;

                case 3:
                    //System.out.println("3. Get specific user");
                    System.out.println("These are the listed users: ");
                    for (int i = 0; i < userList.getSize(); i++) {

                        System.out.println(userList.getUser(i));
                    }
                    break;

                case 4:
                    //System.out.println("4. Sort all users to ID/Name");
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

        Scanner switchChoice = new Scanner(System.in);
        return inputNumberThanks(userInput);
    }

    private static Integer inputNumberThanks(Scanner userInput) {

        while (true) {

            try {
                //System.out.println("Enter id:");
                int numberInput = Integer.parseInt(userInput.nextLine());
                return numberInput;
            }
            catch (NumberFormatException ex) {
                System.out.println("Error: Please input a number");
            }
        }
    }
    private static String inputStringThanks(Scanner userInput){

        while (true) {

            try {
                String stringInput = userInput.nextLine();
                return stringInput;
            }
            catch (Exception ex) {
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
                System.out.println("Please enter Y or N");
            }
        } while (!response.equals("Y") && !response.equals("N"));

        return response.equals("Y");
    }

}