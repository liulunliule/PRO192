/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuvi_dientichhcn;

import java.util.Scanner;
import sun.security.pkcs11.Secmod;

/**
 *
 * @author 840G3
 */
public class luong_NV {
    public static void main(String[] args) {
        int pack,distance;
        int shift,feedback;
        int call,electric;
        int other;
        double salary;
        Scanner sc= new Scanner(System.in);
        System.out.print("package num: ");
        pack= sc.nextInt();
        System.out.print("distance num: ");
        distance= sc.nextInt();
        System.out.print("shift night num: ");
        shift= sc.nextInt();
        System.out.print("feedback grade: ");
        feedback= sc.nextInt();
        System.out.print("call amout: ");
        call= sc.nextInt();
        System.out.print("electric payment: ");
        electric= sc.nextInt();
        System.out.print("other payment: ");
        other= sc.nextInt();
        salary= pack*50 +distance *75 +shift*50*0.1 + feedback +call+ electric +other;
        System.out.println("salary : "+ salary);
        
    }
    
}
