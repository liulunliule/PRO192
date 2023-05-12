/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wshop2;

import java.util.Scanner;

/**
 *
 * @author 840G3
 */
public class Wshop2P2 {
    public static void main(String[] args){
        boolean cont=false;
        do{
            try{
                String s="";
                String pattern= "SE(.*)";
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the String: ");
                s=sc.nextLine().toUpperCase();
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
