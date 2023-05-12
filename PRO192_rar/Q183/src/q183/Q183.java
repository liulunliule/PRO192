/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q183;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Q183 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        SpecCala test = new SpecCala();
        
        System.out.print("Enter owner: ");
        test.setOwner(sc.nextLine());
        System.out.print("Set price: ");
        test.setPrice(sc.nextInt());
        System.out.print("Enter color: ");
        test.setColor(sc.nextInt());
        
        System.out.println("1. Test toString");
        System.out.println("2. Test setData");
        System.out.println("3. Test getValue");
        System.out.println("Enter TC(1,2,3): ");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                test.toString();
                System.out.println("OUTPUT: " + test.toString());
                break;
            case 2:
                test.setData();
                break;
            case 3:
                test.getValue();
                System.out.println("OUTPUT: " + test.getValue());
                break;
        }
    }
    
}
