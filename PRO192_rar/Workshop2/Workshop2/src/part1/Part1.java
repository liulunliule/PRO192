/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package part1;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num ;
        String check;
        boolean count = false;
        
        Scanner sc = new Scanner(System.in);
       
        do{        
            try{
                System.out.println("Enter the number: ");
                num = Integer.parseInt(sc.nextLine());
                if(num < 1)
                    throw new Exception();
                    System.out.println("The number is " + num);
                    count = false;           
            }catch (Exception e){
                System.out.println("The number is invalid ");
                count = true;
            }
            do{
                System.out.println("Do you want to do again ?(Yes/No)");
                check = sc.nextLine();
            } while (!check.equalsIgnoreCase("Yes") && !check.equalsIgnoreCase("No"));
                if (check.equals("No"))
                    break;
        } while (true);                                   
        }                           
    }


 

