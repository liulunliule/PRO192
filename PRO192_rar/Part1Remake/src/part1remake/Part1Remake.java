/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1remake;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Part1Remake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows;
        int cols;
        int matrix[][];
        
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = sc.nextInt();
        matrix = new int[rows][cols];
        System.out.print("Enter the matrix: ");
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\nm[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix inputted: \n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println("\n");
        }

        double sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }
        double average = sum / (rows * cols);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }

}
    

