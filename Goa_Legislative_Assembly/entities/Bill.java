// Author: Rohan Daivajna 
// Roll number: 35
// Title: Goa Legislative Assembly Assignment 5
// Start Date: 22-09-2024
// Modified Date: 29-09-2024
// Description: An object-oriented Java application that simulates the operations of the Goa Legislative Assembly, utilizing encapsulation, inheritance, polymorphism, abstraction, constructors, and method overloading to manage bills, officials, and MLAs in a modularized structure.

package entities;

public class Bill extends Entity {
    private String title;
    private String description;
    private boolean isPassed;

    public Bill(String title, String description) {
        this.title = title;
        this.description = description;
        this.isPassed = false;
    }

    public Bill(String title) {
        this(title, "No description provided.");
    }

    public void pass() {
        this.isPassed = true;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nStatus: " + (isPassed ? "Passed" : "Not Passed");
    }
}
