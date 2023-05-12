/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DTO.Item;
import DTO.ItemList;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;
import java.util.Scanner;

/**
 *
 * @author 840G3
 */
public class AntiqueShop {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        ItemList obj = new ItemList();
        do{
            System.out.println("1.  Add a new vase");
            System.out.println("2.  Add a new statue");
            System.out.println("3.  Add a new painting");
            System.out.println("4.  Display all items");
            System.out.println("5.  Find the items by the creator");
            System.out.println("6.  Update the item by its index");
            System.out.println("7.  Remove the item by its index");
            System.out.println("8.  Display the list of vase items ");
            System.out.println("9.  Sorts items in ascending order based on their values ");
            System.out.println("10. Exit");
            System.out.print("Input your choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    Item tmp = new Vase();
                    tmp.input(); //input in Vase Class
                    if(obj.addItem(tmp)){
                        System.out.println("Added");
                    }
                    break;
                case 2:
                    Item tmp2 = new Statue();
                    tmp2.input(); //input in Statue Class
                    if(obj.addItem(tmp2)){
                        System.out.println("Added");
                    }
                    break;
                case 3:
                    Item tmp3 = new Painting();
                    tmp3.input(); //input in Painting Class
                    if(obj.addItem(tmp3)){
                        System.out.println("Added");
                    }
                    break;
                case 4:
                    obj.displayAll();
                    break;
                case 5:
                    System.out.println("Please input the creator that you want to find:");
                    String creator = sc.next();
                    obj.findByCreator(creator);
                    break;
                case 6:
                    System.out.println("Please input the index:");
                    int index = sc.nextInt();
                    if(obj.updateItem(index)){
                        System.out.println("Updated!");
                    }
                    break;
                case 7:
                    System.out.println("Please input the index:");
                    int index2 = sc.nextInt();
                    obj.removeItem(index2);
                    System.out.println("Removed!");
                    break;
                case 8:
                    obj.displayItemsByType("Vase");
                    break;
                case 9:
                    obj.sortItems();
                    System.out.println("Sorted!");
                    break;
                case 10:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice!!!");
            }//end switch
        } while (choice <= 9); //end while
    }
}
