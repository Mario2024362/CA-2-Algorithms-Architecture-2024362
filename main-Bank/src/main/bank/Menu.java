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
