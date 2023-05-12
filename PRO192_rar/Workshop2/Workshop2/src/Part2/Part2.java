/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Part2 {
    public static void main(String[] args) {
        
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
