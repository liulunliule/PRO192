/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        int i, j;
        int matrix[][];
        System.out.println("The user interface may be:");
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns:");
        columns = sc.nextInt();
        System.out.println("Enter the matrix");
        matrix = new int[rows][columns];

        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print("m[" + i + "]" + "[" + j + "]=");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix inputted:");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.format("%2d",matrix[i][j]);
            }
            System.out.println("\n");
        }
        
        double sum = 0;
        for(i = 0; i < rows; i++){
            for(j = 0; j < columns; j++){
                sum+= matrix[i][j];
            }
        }
        System.out.println("Sum: " + sum);
        
        double avg = 0;
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                avg = sum / (rows * columns);
            }
        }
        System.out.println("Average: " + avg);
    }

}
