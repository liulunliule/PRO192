package Basic;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 840G3
 */
public class demo02 {
    public static void main(String[] args) {
        int a=10,b=3;
        float c=(float)a/b;
        System.out.println("Result: "+ c);
        
        float mark;
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter mark: ");
        mark=sc.nextFloat();
        if(mark>=0){
            System.out.println("Reward: "+ 10000000);
        }else{
            System.out.println("Reward: "+ 0);
        }
    }
}
