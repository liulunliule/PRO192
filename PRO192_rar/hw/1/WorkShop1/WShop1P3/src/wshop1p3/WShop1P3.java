package wshop1p3;

import java.util.Scanner;

public class WShop1P3 {

    public static void main(String[] args) {
        // TODO code application logic here
        int numOfStudents;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of student: ");
        numOfStudents = Integer.parseInt(sc.nextLine());
        String[] list = new String[numOfStudents];

        System.out.printf("Enter the list of %d student name :\n", numOfStudents);
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Student: " + (i + 1));
            list[i] = sc.nextLine();

        }
//                cách: UpperCase toàn bộ list
//        System.out.println("List all students after uppercase:");
//        for (int i = 0; i < list.length; i++) {
//            System.out.println( list[i].toUpperCase() );
//        }

        for (int i = 0; i < list.length; i++) {
            if (list[i].charAt(0) >= 'A' || list[i].charAt(0) <= 'a') {
                list[i] = list[i].substring(0, 1).toUpperCase() + list[i].substring(1);
            }
        }
        System.out.println("List all students after uppercase:");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

}
