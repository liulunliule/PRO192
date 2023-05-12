/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Menu====");
        System.out.println("1. Part 1");
        System.out.println("2. Part 2.1");
        System.out.println("2. Part 2.3");

        int n = sc.nextInt();
        
        int num;
        boolean cont = false;
        String pattern = "^SE\\d{4}";
            
        switch (n) {
            case 1:
                do {
                    System.out.println("Enter the number: ");
                    num = sc.nextInt();
                    try {
                        if (num > 0) {
                            System.out.println("The number is " + num);
                        }
                    } catch (Exception e) {
                        System.out.println("The number is invalid");
                    }
                } while (cont);
                
                
            case 2:
                do {
                    System.out.println("Enter the string 1:");
                    try {
                        if (.matches(pattern))) {
                            System.out.println("Enter the string 1:" + a);
                            cont = false;
                        }
                    } catch (Exception e) {
                        System.out.println("the string is invalid");
                        cont = true;
                    }
                } while (cont);

        }


        
        
        
        
        
        
    }
}
