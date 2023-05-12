/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductManager;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class inputter {

    public static Scanner sc = new Scanner(System.in);

    public static String normalize(String S) {
        String[] tokens = S.split("\\s+");
        String result = "";
        for (String token : tokens) {
            result += token + " ";
        }
        return result.trim();
    }

    public static String getNonBlankStr(String msg) {
        String result = "";
        do {
            System.out.println(msg);
        } while (result.length() == 0);
        return result;
    }

    public static String getPatternStr(String msg, String regEx) {
        String result;
        do {
            System.out.println(msg);
            result = normalize(sc.nextLine());
        } while (!result.matches(regEx));
        return result;
    }

    public static int getIntGreater(String msg, int min) {
        int result;
        do {
            System.out.println(msg);
            result = Integer.parseInt(sc.nextLine());
        } while (result < min);
        return result;
    }
}
