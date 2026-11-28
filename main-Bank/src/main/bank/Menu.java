/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.bank;

import java.util.Scanner;

/**
 *
 * @author Mario Cornejo
 */
public class Menu {
    
    //The options showing as a menu
    public enum MenuOption{
    SORT("sort"), SEARCH("search"), ADD_RECORDS("add records"),
    BINARY_TREE("Create a binary tree"), EXIT("exit");
    
    
    
    public final String label;
    MenuOption(String label) {this.label = label;}
    
    }
       private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("\nDo you wish to SORT or SEARCH:");
        for (MenuOption o : MenuOption.values()) {
            System.out.println((o.ordinal() + 1) + ". " + o.label);
        }     
}
    // ask for a number between 1 and 5
 public int askNumber(String question, int max) {
        while (true) {
            System.out.print(question);
            try {
                int n = Integer.parseInt(scanner.nextLine().trim());
                if (n >= 1 && n <= max) return n;
            } catch (NumberFormatException e) { /* not a number */ }
            System.out.println("Invalid option. Please enter a number from 1 to " + max + ".");
        }
    }

