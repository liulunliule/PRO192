/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class AntiqueShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item item = new Item();
        int choice = 0;

        do {
            System.out.println("1. Create a Vase:");
            System.out.println("2. Create a Statue:");
            System.out.println("3. Create a Painting:");
            System.out.println("4. Display the Item:");
            System.out.print("Input a choice:");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    item = new Vase();
                    ((Vase) item).input();
                    break;

                case 2:
                    item = new Statue();
                    ((Statue) item).input();
                    break;
        
                case 3:
                    item = new Painting();
                    ((Painting) item).input();
                    break;  

                case 4:
                    if (item != null) {
                        if (item instanceof Vase) {
                            //((Vase) item).output();
                            System.out.println(item);
                        } else if (item instanceof Statue) {
                            System.out.println(item);
                        } else if (item instanceof Painting) {
                            System.out.println(item);
                        }
                    } else {
                        System.out.println("Enter the object please: ");
                    }
            }
        } while (choice <= 4);
    }
}
