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
public class menu {

    public static void main(String[] args) {
        int choice, firstNum, secondNum;
        double result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("welcome to java");
        System.out.println(" first Num:");
        firstNum = Integer.parseInt(sc.nextLine());
        System.out.println("Enter second Num");
        secondNum = Integer.parseInt(sc.nextLine());
//        try {
            do {
                System.out.println("select:");
                System.out.println("1.add");
                System.out.println("2.sub");
                System.out.println("3.Mul");
                System.out.println("4.Div");
                System.out.println("Enter other Num to Exit");
                System.out.print("Enter choice: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        result = firstNum + secondNum;
                        System.out.format("%d + %d = %.2f\n", firstNum, secondNum, result);
                        break;
                    case 2:
                        result = firstNum - secondNum;
                        System.out.format("%d - %d = %.2f\n", firstNum, secondNum, result);
                        break;
                    case 3:
                        result = firstNum * secondNum;
                        System.out.format("%d - %d = %.2f\n", firstNum, secondNum, result);
                        break;
                    case 4:
                        result = firstNum / secondNum;
                        System.out.format("%d / %d = %.2f\n", firstNum, secondNum, result);
                        break;
                    default:
                        System.out.println("TKS. Seeya");
                        System.exit(0);
                }
            } while (true);
//        } catch (Exception e) {
//            System.out.println("false");
        }
    }


