/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExHanding1;

import java.util.Scanner;

/**
 *
 * @author 840G3
 */
public class ApplyExceptionHandling {

    public static int InputNumber() {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        number = Integer.parseInt(sc.nextLine());
        return number;
    }

    public static void main(String[] args) {
        int number=0;
        int sum = 0;
        System.out.println("Enter the interger number, press 0 to stop ");
        do {
            try {
                number = InputNumber();
                sum += number;
            } catch (Exception e) {
                System.out.println("Data invalid, Try again.");
            }
        } while (number != 0);
        System.out.println("Sum = " + sum);
    }
}
