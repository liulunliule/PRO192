package ProductManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import products.product;

/**
 *
 * @author ADMIN
 */
public class menu {

    public static int getChoice(String[] ops) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ops.length; i++) {
            System.out.println("\n" + (i + 1) + "-" + ops[i]);
        }
        System.out.println("\n Choose 1.." + ops.length + ": ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        product item = new product();
        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Add Product");
            System.out.println("2. Search by Name");
            System.out.println("3. Print all");
            System.out.println("4. Print by Name");
            System.out.println("5. Exit");
            System.out.println("Enter your choice : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Hello");
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    item = new product();
                    
                    break;
                case 5:
                    if(item != null){
                        System.out.println(item);
                    }
                    else {
                        System.out.println("Enter the object: ");
                    }
            }
        } while (choice <= 5);
    }
}

