package GUI;

import employees.Emplist;
import employees.Menu;
import java.util.Scanner;

public class ManagerProgram {

    public static void main(String[] args) {
        String filename = "employees.txt";
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.add("Adding new employee.");
        menu.add("Removing employee based on his/her code.");
        menu.add("Promoting the salary of an employee based on his/her code.");
        menu.add("Print a list of employees in descending order of salary.");
        menu.add("Save the list to file.");
        menu.add("Quit.");
        int userChoice;
        boolean changed =false;
        Emplist listobj = new Emplist();
        listobj.AddFromFiile(filename);
        
        do {            
            System.out.println("\nEMPLOYEE MANAGER");
            userChoice=menu.getUserChoice();
            switch (userChoice) {
                case 1:
                    listobj.addNewEmp();
                    changed = true;
                    break;
                case 2:
                    listobj.removeEmp();
                    changed = true;
                    break;
                case 3:
                    listobj.promote();
                    changed = true;
                    break;
                case 4:
                    listobj.print();
                    break;
                case 5:
                    listobj.saveToFiile(filename);
                    changed = false;
                    break;
                default:if(changed){
                    System.out.println("Save changes Y/N?");
                    String response = sc.nextLine().toUpperCase();
                    if(response.startsWith("Y"))
                        listobj.saveToFiile(filename);
                }
                    
            }
        } while (userChoice>0 && userChoice <6);
    }
}
