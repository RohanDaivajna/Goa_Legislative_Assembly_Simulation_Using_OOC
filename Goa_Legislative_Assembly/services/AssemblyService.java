// Author: Rohan Daivajna 
// Roll number: 35
// Title: Goa Legislative Assembly Assignment 5
// Start Date: 22-09-2024
// Modified Date: 29-09-2024
// Description: An object-oriented Java application that simulates the operations of the Goa Legislative Assembly, utilizing encapsulation, inheritance, polymorphism, abstraction, constructors, and method overloading to manage bills, officials, and MLAs in a modularized structure.

package services;

import entities.Bill;
import entities.MLA;
import entities.Official;
import java.util.ArrayList;
import java.util.Scanner;

public class AssemblyService {
    private ArrayList<Bill> bills = new ArrayList<>();
    private ArrayList<Official> officials = new ArrayList<>();
    private ArrayList<MLA> mlas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("\n================ Goa Legislative Assembly Menu ================");
        System.out.println("1. Introduce a Bill");
        System.out.println("2. Pass a Bill");
        System.out.println("3. Display Bills");
        System.out.println("4. Elect an Official");
        System.out.println("5. View Elected Officials");
        System.out.println("6. Add an MLA");
        System.out.println("7. View MLAs");
        System.out.println("8. Exit");
        System.out.println("===============================================================");
        System.out.print("Please select an option (1-8): ");
    }

    public void introduceBill() {
        System.out.println("\n--- Introduce a New Bill ---");
        System.out.print("Enter the title of the bill: ");
        String title = scanner.nextLine().trim();
        System.out.print("Enter the description of the bill: ");
        String description = scanner.nextLine().trim();
        bills.add(new Bill(title, description));
        System.out.println("The bill titled '" + title + "' has been successfully introduced!");
    }

    public void passBill() {
        if (bills.isEmpty()) {
            System.out.println("\nThere are no bills available to pass at the moment.");
            return;
        }
        System.out.println("\n--- Pass a Bill ---");
        displayBills();
        System.out.print("Enter the title of the bill you would like to pass: ");
        String title = scanner.nextLine().trim();
        for (Bill bill : bills) {
            if (bill.toString().contains(title)) {
                bill.pass();
                System.out.println("The bill titled '" + title + "' has been successfully passed.");
                return;
            }
        }
        System.out.println("No bill found with the title '" + title + "'. Please check the title and try again.");
    }

    public void displayBills() {
        if (bills.isEmpty()) {
            System.out.println("\nNo bills have been introduced yet.");
            return;
        }
        System.out.println("\n--- List of Bills ---");
        for (Bill bill : bills) {
            System.out.println(bill);
            System.out.println();
        }
    }

    public void addOfficial() {
        System.out.println("\n--- Elect a New Official ---");
        System.out.print("Enter the position for the official (e.g., Speaker, Secretary): ");
        String position = scanner.nextLine().trim();
        System.out.print("Enter the name of the official: ");
        String name = scanner.nextLine().trim();
        officials.add(new Official(position, name));
        System.out.println("Official '" + name + "' has been successfully elected to the position of " + position + ".");
    }

    public void viewOfficials() {
        if (officials.isEmpty()) {
            System.out.println("\nNo officials have been elected yet.");
            return;
        }
        System.out.println("\n--- Elected Officials ---");
        for (Official official : officials) {
            System.out.println(official);
            System.out.println();
        }
    }

    public void addMLA() {
        System.out.println("\n--- Add a New MLA ---");
        System.out.print("Enter the name of the MLA: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter the constituency of the MLA: ");
        String constituency = scanner.nextLine().trim();
        mlas.add(new MLA(name, constituency));
        System.out.println("MLA '" + name + "' from '" + constituency + "' has been successfully added.");
    }

    public void viewMLAs() {
        if (mlas.isEmpty()) {
            System.out.println("\nNo MLAs have been added yet.");
            return;
        }
        System.out.println("\n--- List of MLAs ---");
        for (MLA mla : mlas) {
            System.out.println(mla);
            System.out.println();
        }
    }
}
