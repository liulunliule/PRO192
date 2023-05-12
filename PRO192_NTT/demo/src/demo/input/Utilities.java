/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.input;

import java.util.Scanner;

/**
 *
 * @author 840G3
 */
public class Utilities {
    public static int getIntergerNumber(String message)throws Exception{
        int number=0;
        System.out.print(message);
        try {
            Scanner sc = new Scanner(System.in);
            number= sc.nextInt();
        } catch (Exception e) {
            throw new Exception("Data invalid.");
        }
        return number;
    }
    
}
