/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuWS2;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class MenuWS2 {
    public static void main(String[] args) {
        
        int choice;
        int num;
        String check;
               
        Scanner sc = new Scanner(System.in);
        
        System.out.println("________");
        System.out.println("1.Part01 ");
        System.out.println("2.Part02 ");
        System.out.println("3.Exit  ");
        System.out.println("________");
        System.out.print("Enter Your Choice: ");
        choice = Integer.parseInt(sc.nextLine());
        
        switch(choice){
            case 1:
                Part1();
                break;
            
            case 2:
                Part2();
                break;
                
            case 3:
                System.out.println("The End!");
                break;
                
            default:
                System.out.println("The number is invalid");
            }      
    }
    public static void Part1() {
       
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
    public static void Part2() {
        
        boolean cont = false;
        String check;
        
        Scanner sc = new Scanner(System.in);
        
        do{
            try{
                String s = "";
                String pattern = "SE(.*)";// check format
                System.out.print("Enter the String: ");
                s = sc.nextLine();
                if(!s.matches(pattern))
                    throw new Exception();
                System.out.println("The String is " + s);
                cont = false;
            } catch (Exception e){
                System.out.println("The String is invalid");
                cont = true;
            } 
                do{
                    System.out.println("Do you want to do again ?(Yes/No)");
                    check = sc.nextLine();
                } while (!check.equalsIgnoreCase("Yes") && !check.equalsIgnoreCase("No"));
                if (check.equals("No"))
                break;
        } while(cont);           
    }   
}

    
    

    