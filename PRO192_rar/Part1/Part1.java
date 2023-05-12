package Part1;

import java.util.Scanner;

public class Part1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        int matrix[][];
        System.out.println("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter number of columns: ");
        b = sc.nextInt();
        matrix = new int[a][b];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++){
                System.out.print("\nm["+i+"]["+j+"]=");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matrix inputted: ");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println("\n");
        }
        
        int sum = 0;
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                sum = sum + matrix[i][j];
            }
        }
        
        int c = 0;
        System.out.println("Average: " + (float)sum / (a * b));
        System.out.println("Sum: " + sum); 
        
    }
       
}
