package Utils;

import java.util.Scanner;

public class Utils {

    //Code
    public static String getStringreg(String welcome, String partten,
            String msg, String msgreg) {
        boolean check = true;
        String result = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(welcome);
            result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println(msg);
            } else if (!result.matches(partten)) {
                System.out.println(msgreg);
            } else {
                check = false;
            }
        } while (check);

        return result;
    }

    //mark 
    public static float getFloat(String welcome, int min, int max) {
        boolean check = true;
        float number = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                number = Float.parseFloat(sc.nextLine());
                check = false;
                if (number < min) {
                    System.out.println("The number must be larger than " + min
                            + " and smaller than " + max);
                }
            } catch (Exception e) {
                System.out.println("Input number!!!");
            }
        } while (check || number > max || number < min);
        return number;
    }

    //name
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
    
//update
    public static float getFloat(String welcome, int min, int max, float oldData) {
        boolean check = true;
        float number = oldData;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                String tmp = sc.nextLine();
                if (tmp.isEmpty()) {
                    check = false;
                } else {
                    number = Float.parseFloat(tmp);
                    check = false;
                }
            } catch (Exception e) {
                System.out.println("Input number!!!");
            }
        } while (check || number > max || number < min);
        return number;
    }

    public static String getString(String welcome, String oldData) {
        boolean check = true;
        String result = oldData;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print(welcome);
            String newData = sc.nextLine();
            if (newData.isEmpty()) {
                check = false;
            } else {
                result = newData;
                check = false;
            }
        } while (check);
        return result;
    }
}
