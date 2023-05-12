package empmgt;

import java.util.Scanner;

public class employeeList {

    int numEmployees;
    int countEmp = 0;
    Employee[] empList;

    public int getNumEmployees() {
        System.out.print("Enter the number of employees: ");
        Scanner sc = new Scanner(System.in);
        numEmployees = sc.nextInt();
        empList = new Employee[numEmployees];
        return numEmployees;
    }

    public void createEmployee() {
        System.out.println("Input Employee information:");
        String code, fName, phone, department;
        long salary, saCoefficient;
        boolean check = true;
        do {
            code = Utils.Code("Input Employee " + (countEmp + 1) + " Code: ");
            check = empList.equals(new Employee(code));
            if (check) {
                System.out.println("Duplicated Code!");
            }
        } while (check);
        fName = Utils.getString("Input the Employee's name: ", 5, 30);
        phone = Utils.getString("Input the Employee's phone: ", 10, 12);
        salary = Utils.getSalary("Input the Employee's salary: ");
        saCoefficient = Utils.getSalary("Input the Employee's salary coefficient: ");
        department = Utils.getString("Input the Employee's department: ", 1, 5);
        Employee emp = new Employee(code, fName, phone, salary, saCoefficient, department);
        empList[countEmp] = emp;
        countEmp++;
    }

    public void printList() {
        for (Employee employee : empList) {
            System.out.println(employee.toString());;
        }
    }

    public void totalSalary() {
        long total = 0;
        for (Employee employee : empList) {
            total = total + employee.getSalary() * employee.getSalaryCoefficient();
        }
        System.out.println("The total salary of the employees: " + total);
    }

    public void updateSalary() {
        String code;
        long salary, saCoefficient;
        boolean isExist = false;
        code = Utils.Code("Input Employee's Code want to update: ");
        for (int i = 0; i < empList.length; i++) {
            if (code.equals(empList[i].getCode())) {
                isExist = true;
                salary = Utils.getSalary("Input the new salary: ");
                saCoefficient = Utils.getSalary("Input the new salary coefficient: ");
                empList[i].setSalary(salary);
                empList[i].setSalaryCoefficient(saCoefficient);
            }
        }
        if (!isExist) {
            System.out.println("There aren't any code suitable");
        }
    }
}
