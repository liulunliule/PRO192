package Util;


import java.text.SimpleDateFormat;
import java.util.Date;
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
    public static int getInt(String welcome, int oldData) {
        boolean check = true;
        int number = oldData;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                String tmp = sc.nextLine();
                if (tmp.isEmpty()) {
                    check = false;
                } else {
                    number = Integer.parseInt(tmp);
                    check = false;
                }
            } catch (Exception e) {
                System.out.println("Input number!!!");
            }
        } while (check || number < 0);
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
    
    public static String getCurrrentDate(){
        String today = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        return today;
    }
    
}
