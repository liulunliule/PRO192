
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 840G3
 */
//use split
public class P02 {
    public static void main(String[] args) {
        //B1:
        int numOfStudents;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter number of student: ");
            numOfStudents = Integer.parseInt(sc.nextLine());
            if (numOfStudents < 8) {
                System.out.println("Number of student can't be smaller than 8! Try again!! ");
            }
        } while (numOfStudents < 8);

        //B2: khai báo mảng tên student(s)
        String[] list = new String[numOfStudents];

        //B3: nhập tên cho n student
        System.out.println("Enter the fullname list of " + numOfStudents + " student name:");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            list[i] = sc.nextLine();
        }
        System.out.println("--------------------------------------------");

        //to check
        System.out.println("List all student(s):");
        for (String string : list) {
            System.out.println(string);
        }
        //B4: khai báo mảng chứa lastname
        String[] lastname = new String[numOfStudents];

        //B5: lưu dữ liệu cho mảng lastname
        for (int i = 0; i < numOfStudents; i++) {
            String[] name = list[i].split(" ");
            for (int j = 0; j < name.length; j++) {
                if (j == name.length - 1) {
                    lastname[i] = name[j];
                }
            }
        }
        System.out.println("--------------------------------------------");

        //B6: tìm largest lastname
        int max = 0;
        for (String lname : lastname) {
            if (max < lname.length()) {
                max = lname.length();
            }
        }

        System.out.println("The Student(s) have largest name :");
        for (int i = 0; i < lastname.length; i++) {
            if (lastname[i].length() == max) {
                System.out.println(list[i]);
            }
        }
    }
}
