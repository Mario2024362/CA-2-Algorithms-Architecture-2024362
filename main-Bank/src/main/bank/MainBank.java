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
    
   
    
    }
    
}
