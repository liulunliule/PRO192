package View;

import Controlers.EmpList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EmpList Emp = new EmpList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Add Employee_Fulltime");
            System.out.println("2. Add Employee_Parttime");
            System.out.println("3. Print Employee_Fulltime");
            System.out.println("4. Print Employee_Parttime");
            System.out.println("Orther-Exit");
            System.out.print("Input your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Emp.createEmp_full();
                    break;
                case 2:
                    Emp.createEmp_part();
                    break;
                case 3:
                    Emp.PrintEmp_full();
                    break;
                case 4:
                    Emp.PrintEmp_part();
                    break;
                default:
                    System.out.println("see ya ^^");
            }
        } while (choice <= 4);
    }
}
