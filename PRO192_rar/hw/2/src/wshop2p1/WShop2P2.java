/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wshop2p1;

import java.util.Scanner;

/**
 *
 * @author 840G3
 */
public class WShop2P2 {
    public static void main(String[] args){
        boolean cont=false;
        do{
            try{
                String s="";
                String pattern= "SE(.*)";
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the String: ");
                s=sc.nextLine();
                if( ! s.matches(pattern))
                    throw new Exception();
                System.out.println("The string is: " + s);
                cont=false;
            }catch(Exception e){
                System.out.println("The string is invalid");
                cont=true;
            }
        }while(cont);
    }
    
}
