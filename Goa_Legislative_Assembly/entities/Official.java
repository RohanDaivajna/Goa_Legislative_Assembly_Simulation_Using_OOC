// Author: Rohan Daivajna 
// Roll number: 35
// Title: Goa Legislative Assembly Assignment 5
// Start Date: 22-09-2024
// Modified Date: 29-09-2024
// Description: An object-oriented Java application that simulates the operations of the Goa Legislative Assembly, utilizing encapsulation, inheritance, polymorphism, abstraction, constructors, and method overloading to manage bills, officials, and MLAs in a modularized structure.

package entities;

public class Official extends Entity {
    private String position;
    private String name;

    public Official(String position, String name) {
        this.position = position;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Position: " + position + "\nName: " + name;
    }
}
