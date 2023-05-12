/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Wshop1;

import java.util.Scanner;

/**
 *
 * @author 840G3
 */
public class WShop1P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean checkformat = true;
        
        do {
            try {
                int rows;
                int cols;
                int matrix[][];
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter number of rows: ");
                rows = sc.nextInt();
                System.out.print("Enter number of cols: ");
                cols = sc.nextInt();
                matrix = new int[rows][cols];
                System.out.println("Enter the matrix:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print("\nm[" + i + "][" + j + "]=");
                        matrix[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Matrix inputted: ");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.format("%3d", matrix[i][j]);
                    }
                    System.out.print("\n");
                }
                int sum = 0;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        sum = sum + matrix[i][j];
                    }
                }
                System.out.println("Sum:" + sum);
                System.out.println("Average:" + (float) sum / (rows * cols));
            } catch (Exception e) {
                checkformat = false;
                System.out.println("you need to enter the correct format (just positive interger)!!");
                System.out.println("Try again!!! ");
            }
        } while (!checkformat);
    }

}
