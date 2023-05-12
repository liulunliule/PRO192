/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wshop1;

import java.util.Scanner;

/**
 *
 * @author 840G3
 */
public class Wshop1P2 {

    public static void main(String[] args) {
        // TODO code application logic here
        boolean checkformat = true;
        do {
            try {
                float num1, num2;
                String op;
                boolean checkOp;
                Scanner sc = new Scanner(System.in);
                System.out.print("Input the number 1: ");
                num1 = sc.nextFloat();
                System.out.print("Input the number 2: ");
                num2 = sc.nextFloat();
                do {
                    System.out.print("Input the operator(+_*:) ");
                    sc = new Scanner(System.in);
                    op = sc.nextLine();
                    if (op.equals("+")) {
                        checkOp = true;
                        System.out.println("the result of: " + num1 + " " + op + " " + num2 + "= " + (num1 + num2));
                    } else if (op.equals("-")) {
                        checkOp = true;
                        System.out.println("the result of: " + num1 + " " + op + " " + num2 + "= " + (num1 - num2));
                    } else if (op.equals("*")) {
                        checkOp = true;
                        System.out.println("the result of: " + num1 + " " + op + " " + num2 + "= " + (num1 * num2));
                    } else if (op.equals(":")) {
                        checkOp = true;
                        System.out.println("the result of: " + num1 + " " + op + " " + num2 + "= " + (num1 / num2));
                    } else {
                        checkOp = false;
                        System.out.println("False operator ");
                        System.out.print("Input again the operator(+_*:) ");
                    }
                } while (!checkOp);

            } catch (Exception e) {
                System.out.println("you need to enter the correct format !!");
                System.out.println("Try again!!! ");
                checkformat = false;
            }
        } while (!checkformat);
    }
}
