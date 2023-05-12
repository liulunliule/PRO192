/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Part3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        int numofstudents;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of students: ");
        numofstudents = Integer.parseInt(sc.nextLine());
        String[] list = new String[numofstudents];
        System.out.println("The list of " + numofstudents + " student name: " );
        
        for(int i = 0; i < numofstudents; i++){
            System.out.print("The student number " + (i + 1) + " is: ");
            list[i] = sc.nextLine();
        }
        
        for(int i = 0; i < list.length; i++){
            if(list[i].charAt(0) < 'A' || list[i].charAt(0) >= 'a'){
                list[i] = list[i].substring(0,1).toUpperCase() + list[i].substring(1);
            }          
        }
        
        System.out.println("After Uppercase: ");
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}    
        

