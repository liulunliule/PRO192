    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmoi;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class OOPmoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String name;
        double price;
        
        System.out.print("Enter the product name: ");
        name = sc.nextLine(); 
        
        System.out.print("Enter the product price: ");
        price = Double.parseDouble(sc.nextLine());
        
        System.out.println("The tax of the product: " + (price * 0.1));
        
        Product x = new Product(name, price);
        x.name();
        System.out.println("San pham + thue: " + x.getImportTax());
        
    }
    
}
