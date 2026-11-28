/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.bank;

/**
 *
 * @author Mario Cornejo
 */
public class MainBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  While to be asking the file until get to read
  
         while(true){
         String fileName = view.askText("Enter the name of the file to be read");
         
         try{
             employees = Employee.readFile(fileName);
            ("File was read (" + employees.size() + " employees)");
                 
            break;
         } catch (IOException e) {
                view.showMessage("File can not be found");
            }
         
         }
         
         //This is the loop for the menu
      MenuOption option;
        do {
            view.showMenu();
            option = MenuOption.values()[view.askNumber("> ", MenuOption.values().length) - 1];
            view.showMessage(option.label + " selected");

            switch (option) {
                case SORT:        sort();       break;
                case SEARCH:      search();     break;
                case ADD_RECORDS: addRecord();  break;
                case BINARY_TREE: buildTree();  break;
                case EXIT:        view.showMessage("Goodbye!");
            }
        } while (option != MenuOption.EXIT);
    }

    private static void sort() {
        employees = Sorter.quickSort(employees);
        view.showMessage("First 20 employees in alphabetical order:");
        view.showEmployees(employees, 20);
    
   
    
    }
    
}
