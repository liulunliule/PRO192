/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wshop2p1;

import java.util.Scanner;

/**
 *
 * @author 840G3
 */
public class WShop2P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean cont=false;
        do{
            try{
                int num;
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Enter the number: ");
                 num = Integer.parseInt(sc.nextLine());
                 if( num<1)
                     throw new Exception();
                 System.out.println("The number is: " + num);
                 cont=false;
            }catch(Exception e) {
                System.out.println("The number is invalid");
                cont=true;
            }
        }while(cont);
    }
    
}
