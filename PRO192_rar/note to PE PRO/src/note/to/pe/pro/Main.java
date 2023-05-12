/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package note.to.pe.pro;

import java.util.Scanner;

/**
 *
 * @author 840G3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        Restangle sr = new Restangle();
        int Choice=0;
        
        do {   
            System.out.println("1. Test Perimeter ");
            System.out.println("2. Test Area ");
            System.out.println("3. Test output ");
            System.out.print("Enter TC(1,2,3): ");
            Choice = Integer.parseInt(sc.next());
            switch (Choice) {
                case 1:
                    sr.input();
                    System.out.println("OUTPUT: ");
                    System.out.println(sr.getPerimeter());
                    break;
                case 2:
                    sr.input();
                    System.out.println("OUTPUT: ");
                    System.out.println(sr.getArea());
                    break;
                    
                case 3:
                    sr.input();
                    System.out.println("OUTPUT: ");
                    sr.output();
                    break;    
            }
            
        } while (Choice<1 && Choice>3);
    }
    
}
