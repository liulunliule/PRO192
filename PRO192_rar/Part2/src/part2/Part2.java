/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Part2 {
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        float num1, num2;
        String op;
        String check;

        do {
            
            System.out.println("Input the number 1: ");
            num1 = sc.nextFloat();
            System.out.println("Input the number 2: ");
            num2 = sc.nextFloat();
            System.out.println("Input the operator (+ - * /): ");
            Scanner sc = new Scanner(System.in);
            op = sc.nextLine();

            if(op.equals("+")){            
                    System.out.println("The result of " + num1 + op + num2 + " = " + (num1 + num2));
            }
            if(op.equals("-")){            
                    System.out.println("The result of " + num1 + op + num2 + " = " + (num1 - num2));
            }
            if(op.equals("*")){            
                    System.out.println("The result of " + num1 + op + num2 + " = " + (num1 * num2));
            }
            if(op.equals("/")){            
                    System.out.println("The result of " + num1 + op + num2 + " = " + (num1 / num2));
            }                
            do {
                System.out.print("Do you want to continue? (Y/N) ");
                check = sc.nextLine();
            } while (!check.equalsIgnoreCase("Y") && !check.equalsIgnoreCase("N"));// cũng như upper hoặc lower case nhưng chỉ để ý ký tự
            if (check.equalsIgnoreCase("N")) 
                break;
        } 
        while (true);          
        
    
    }
}