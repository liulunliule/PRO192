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
public class WShop2P2_2 {
    public String inputString() throws Exception
    {
        String pattern="SE(.*)";
        String s="";
        Scanner sc=new Scanner(System.in);
        System.out.println("input the string:");
        s=sc.nextLine();
        if(!s.matches(pattern))
            throw new Exception();
        return s;
    }
public static void main(String[] args){    
    WShop2P2_2 obj=new WShop2P2_2();
    boolean cont=false;
    do{
        try {
            String s=obj.inputString();
            System.out.println("The string is " + s);
            cont=false;
        } catch (Exception e) {
            System.out.println("The string is invalid");
            cont=true;
        }
    }while(cont);
}
}