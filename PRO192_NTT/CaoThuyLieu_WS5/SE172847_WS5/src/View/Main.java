package View;

import Controlers.StuList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = 0;
        StuList Stu = new StuList();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Add new student");
            System.out.println("2. Search a student based on his/her code");
            System.out.println("3. Update name and mark of a student based on his/her code");
            System.out.println("4. Remove a student based on his/her code");
            System.out.println("5. List all students.");
            System.out.println("6. Exit");
            System.out.print("Input your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Stu.createStudent();
                    break;
                case 2:
                    Stu.find();
                    break;
                case 3:
                    Stu.update();
                    break;
                case 4:
                    Stu.removeStu();
                    break;
                case 5:
                    Stu.output();
                    break;
                case 6:
                    System.out.println("Byee!!");
                    break;
            }
        } while (choice < 6);
    }
}
