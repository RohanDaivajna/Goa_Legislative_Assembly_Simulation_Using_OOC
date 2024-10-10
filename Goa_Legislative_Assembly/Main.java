// Author: Rohan Daivajna 
// Roll number: 35
// Title: Goa Legislative Assembly Assignment 5
// Start Date: 22-09-2024
// Modified Date: 29-09-2024
// Description: An object-oriented Java application that simulates the operations of the Goa Legislative Assembly, utilizing encapsulation, inheritance, polymorphism, abstraction, constructors, and method overloading to manage bills, officials, and MLAs in a modularized structure.

import java.util.Scanner;
import services.AssemblyService;

public class Main {
    public static void main(String[] args) {
        int choice;
        AssemblyService assemblyService = new AssemblyService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Welcome to the Goa Legislative Assembly System =====");
        do {
            assemblyService.displayMenu();
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 8.");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character after integer input

            switch (choice) {
                case 1:
                    assemblyService.introduceBill();
                    break;
                case 2:
                    assemblyService.passBill();
                    break;
                case 3:
                    assemblyService.displayBills();
                    break;
                case 4:
                    assemblyService.addOfficial();
                    break;
                case 5:
                    assemblyService.viewOfficials();
                    break;
                case 6:
                    assemblyService.addMLA();
                    break;
                case 7:
                    assemblyService.viewMLAs();
                    break;
                case 8:
                    System.out.println("Thank you for using the Goa Legislative Assembly system! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option between 1 and 8.");
            }
        } while (choice != 8);
    }
}
