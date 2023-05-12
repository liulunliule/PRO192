/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.input;

/**
 *
 * @author 840G3
 */
public class Program {

    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        long sum;
        try {
            number =Utilities.getIntergerNumber("Enter a number:");
            sum=0;
            for (int i = 0; i < number; i++) {
                sum+=1;
            }
            System.out.println("Sum = " + sum);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

