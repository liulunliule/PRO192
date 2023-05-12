package Util;

import java.util.Scanner;

public class Utils {

    //Code
    public static String Code(String welcome) {
        boolean check = true;
        String inputID = "";
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print(welcome);
            inputID = sc.nextLine();
            if (inputID.isEmpty()) {
                System.out.println("Code cannot be empty!");
                System.out.print("Try again: ");
            } else if (inputID.matches("FS\\d{5}") == false) {
                System.out.println("The Employee Code must be FSxxxxx format!");
                System.out.println("Try again: ");
            } else {
                check = false;
            }
        } while (check);

        return inputID;
    }

    public static String getString(String welcome, int min, int max) {
        boolean check = true;
        String result = "";
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print(welcome);
            result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println("Input text!!!");
            } else if (result.length() < min || result.length() > max) {
                System.out.println("You must be input from " + min + " to " + max + " character");
            } else {
                check = false;
            }

        } while (check);
        return result;
    }

    public static String getString(String welcome) {
        boolean check = true;
        String result = "";
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print(welcome);
            result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println("Input text!!!");
            } else {
                check = false;
            }
        } while (check);
        return result;
    }

    public static int getInt(String welcome, int min) {
        boolean check = true;
        int number = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                number = Integer.parseInt(sc.nextLine());
                check = false;
                if(number<min) System.out.println("The number must be larger than "+ min);
            } catch (Exception e) {
                System.out.println("Input number!!!");
            }
        } while (check || number < min);
        return number;
    }

    //input positive
    public static int getInt(String welcome) {
        boolean check = true;
        int number = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                number = Integer.parseInt(sc.nextLine());
                check = false;
                if (number < 0) {
                    System.out.println("Must be a positive number");
                }
            } catch (Exception e) {
                System.out.println("Input number!!!");
            }
        } while (check || number < 0);
        return number;
    }
}
