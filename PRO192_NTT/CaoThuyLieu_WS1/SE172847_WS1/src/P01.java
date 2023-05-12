
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 840G3
 */
public class P01 {

    public static void main(String[] args) {
        //B1:
        int n;//num of interger
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the num of element: ");
            n = Integer.parseInt(sc.nextLine());
            if(n<10){
                System.out.println("The num of element must be greater than 10! Try again!!");
            }
        } while (n < 10);

        //B2: khai báo mảng các số nguyên
        int a[] = new int[n];

        //B3: nhập dữ liệu cho n phần tử
        System.out.print("Enter the element:");
        for (int i = 0; i < n; i++) {
            System.out.print("\n [" + i + "]: ");
            a[i] = Integer.parseInt(sc.nextLine());
        }
        
            //to check
        System.out.println("The " + n + " element in the array before sort:");
        for (int i : a) {
            System.out.print(i + "\t");
        }
        System.out.println("\n");

        //B4: sort
        int tmp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }

        System.out.println("The " + n + " element in the array after sort:");
        for (int i : a) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
