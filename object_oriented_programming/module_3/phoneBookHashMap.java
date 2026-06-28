package object_oriented_programming.module_3;

import java.util.HashMap;
import java.util.Scanner;

public class phoneBookHashMap {

    public static Boolean isNameValid(String name) {
        if (name.matches("^[a-zA-Z' -]+$") == false) {
            System.out.println("Invalid name");
            return false;
        }
        return true;
    }

    public static Boolean isPhoneNumberValid(String phoneNumber) {
        if (phoneNumber.matches("\\+?\\d{1,4}?[-.\\s]?\\(?\\d{1,3}?\\)?[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,9}") == false) {
            System.out.println("Invalid phone number!");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (scanner) {
            HashMap<String, String> phoneBook = new HashMap<>();

            while (true) {
                System.out.println(
                        "Press 1 to add an entry in the phoneBook," +
                                "\n2 to view all the entries" +
                                "\n3 to search for entries with name" +
                                "\n4 to delete an entry" +
                                "\nAny other key to exit");

                // Read the user's choice
                String userAction = scanner.nextLine();

                // Option 1: Add a name-number entry to the phoneBook
                if (userAction.equals("1")) {
                    // Prompt the user to enter the name
                    System.out.println("Enter a name");
                    String name = scanner.nextLine();
                    // Validate the name format
                    if (!isNameValid(name)) {
                        continue; // Skip to the next iteration if the name is invalid
                    }
                    // Check if the name already exists in the phoneBook
                    if (phoneBook.containsKey(name)) {
                        System.out.println("This name already exists! Do you want to replace the number? y/n");
                        String repChoice = scanner.nextLine();
                        // If the user chooses not to replace, skip to the next iteration
                        if (repChoice.equalsIgnoreCase("n")) {
                            continue;
                        }
                    }

                    // Prompt the user to enter the phone number
                    System.out.println("Enter the phone number");
                    String phoneNumber = scanner.nextLine();
                    // Validate the phone number format
                    if (!isPhoneNumberValid(phoneNumber)) {
                        continue; // Skip to the next iteration if the phone number is invalid
                    }
                    // Add the name and phone number to the HashMap
                    phoneBook.put(name, phoneNumber);
                    System.out.println("The name and number have been added to the phoneBook.");
                }
                // Option 2: View all the entries in the phoneBook
                else if (userAction.equals("2")) {
                    // Iterate through the HashMap and print all key-value pairs
                    for (String name : phoneBook.keySet()) {
                        System.out.println(name + ": " + phoneBook.get(name));
                    }
                }
                // Option 3: Search for an entry by name
                else if (userAction.equals("3")) {
                    // Prompt the user to enter the name to search
                    System.out.println("Enter the name you want to search");
                    String keyName = scanner.nextLine();
                    // Check if the name exists in the phoneBook
                    if (phoneBook.containsKey(keyName)) {
                        // Display the phone number associated with the name
                        System.out.println("The phone number you are looking for is " +
                                phoneBook.get(keyName));
                    } else {
                        System.out.println("No such name found in the phoneBook.");
                    }
                }
                // Option 4: Delete an entry by name
                else if (userAction.equals("4")) {
                    // Prompt the user to enter the name to delete
                    System.out.println("Enter the name you want to delete ");
                    String keyName = scanner.nextLine();
                    // Check if the name exists in the phoneBook
                    if (phoneBook.containsKey(keyName)) {
                        // Remove the entry from the HashMap
                        phoneBook.remove(keyName);
                        System.out.println("The entry has been removed.");
                    } else {
                        System.out.println("No such name found in the phoneBook.");
                    }
                }
                // Exit the program if the user enters any other key
                else {
                    break;
                }
            }

        } catch (NumberFormatException e) {
            System.err.println(e);
            scanner.close();

        }
    }

}
