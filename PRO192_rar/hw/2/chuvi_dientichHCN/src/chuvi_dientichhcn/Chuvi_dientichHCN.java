/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuvi_dientichhcn;

import java.util.Scanner;

/**
 *
 * @author 840G3
 */
public class Chuvi_dientichHCN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double length,width;
        double area,cir;
        Scanner sc= new Scanner(System.in);
        System.out.println("chieu dai");
        length= sc.nextDouble();
        System.out.println("chieu rong");
        width= sc.nextDouble();
        
        area= length*width;
        cir=(length+width)*2;
        System.out.println("Area: "+ area);
        System.out.println("Cir :"+ cir);
    }
    
}
