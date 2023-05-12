
package workshop06;

import java.util.Scanner;

public class Inputter {

    public static Scanner sc = new Scanner(System.in);

    public static int inputInt(String msg, int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        int data;
        do {
            System.out.print(msg);
            data = Integer.parseInt(sc.nextLine());
            if(data < min || data > max) {
                System.out.println("Please input data in range of 0 - 10");
            }
        } while (data < min || data > max);
        return data;
    }

    //Get a string with no condition
    public static String inputStr(String msg) {
        System.out.print(msg);
        String data = sc.nextLine().trim();
        return data;
    }

    //get a non-blank String
    public static String inputNonBlankString(String msg) {
        String data;
        do {
            System.out.print(msg);
            data = sc.nextLine();
        } while (data.length() == 0);
        return data;
    }

    public static String inputPattern(String msg, String pattern) {
        String data;
        boolean valid = true;
        do {
            System.out.print(msg);
            data = sc.nextLine().trim();
            valid = data.matches(pattern);
            if (!valid) {
                System.out.println("Enter student code in Ss and 3 digits");
            }
        } while (!data.matches(pattern));
        return data;
    }

}//end class
