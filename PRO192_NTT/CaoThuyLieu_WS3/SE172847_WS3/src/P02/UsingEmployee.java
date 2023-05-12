package P02;

import java.util.Scanner;

public class UsingEmployee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code;
        String fullname;
        int age = 0;
        String address;
        long salary = 0;

        boolean check = false;
        do {
            System.out.println("Enter code: ");
            code = sc.nextLine();

            if (code.length() == 0) {
                System.out.println("Employee code cannot be empty!");
            } else if (!code.matches("^SE\\d{6}$")) {
                System.out.println("you entered the wrong employee code format");
            } else {
                check = true;
            }

        } while (check == false);

        //------------------------------------------------------
        check = false;
        do {
            System.out.println("Enter Fullname: ");
            fullname = sc.nextLine();

            if (fullname.length() == 0) {
                System.out.println("Employee Fullname cannot be empty");
            } else if (fullname.length() < 4) {
                System.out.println("Fullname with at least 4 characters");
            } else {
                check = true;
            }
        } while (!check);

        //------------------------------------------------------
        check = false;
        do {
            System.out.println("Enter Age: ");
            try {
                age = Integer.parseInt(sc.nextLine());
                if (age < 24 || age > 45) {
                    System.out.println("Age from 24 to 45");
                } else {
                    check = true;
                }
            } catch (Exception e) {
                System.out.println("you entered the wrong employee age format");
            }
        } while (!check);

        //------------------------------------------------------
        check = false;
        do {
            System.out.println("Enter Address: ");
            address = sc.nextLine();

            if (address.length() == 0) {
                System.out.println("Employee Address cannot be empty");
            } else if (address.length() < 20) {
                System.out.println("Address with at least 20 characters");
            } else {
                check = true;
            }
        } while (!check);

        //------------------------------------------------------
        check = false;
        do {
            System.out.println("Enter Salary: ");
            try {
                salary = Long.parseLong(sc.nextLine());

            } catch (Exception e) {
                System.out.println("you entered the wrong employee Salary format");
            }

            if (salary < 5000000 || salary > 20000000) {
                System.out.println("Salary from 5000000 to 20000000!");
            } else {
                check = true;
            }
        } while (!check);

        Employee emp = new Employee(code, fullname, age, address, salary);
        System.out.println(emp);
    }
}
