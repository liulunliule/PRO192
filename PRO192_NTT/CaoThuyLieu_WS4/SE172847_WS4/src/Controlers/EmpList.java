package Controlers;

import DTO.Emp_parttime;
import DTO.Employee;
import DTO.Emp_fulltime;
import Util.Utils;
import java.util.ArrayList;

public class EmpList extends ArrayList<Employee> {

    public void createEmp_full() {
        if (this.size() >= 100) {
            System.out.println("The company has a maximum of 100 employees.");
            System.out.println("Thus, you cannot add more Employee!!! ");
        } else {
            System.out.println("Input Employee Fulltime infomation:");
            String code, name, phone, address, department;
            int salary, absent;
            boolean check = true;
            do {
                code = Utils.Code("Input the code of Employee: ");
                if (checkCode(code) >= 0) {
                    System.out.println("Duplicated code!");
                } else {
                    check = false;
                }
            } while (check);
            name = Utils.getString("Input the Employee's name: ");
            phone = Utils.getString("Input the Employee's phone: ", 10, 12);
            address = Utils.getString("Input the Employee's address: ");
            department = Utils.getString("Input the Employee's department: ");
            salary = Utils.getInt("Input the Employee's salary: ", 1500);
            absent = Utils.getInt("Input the Employee's absent: ");

            Employee Emp = new Emp_fulltime(salary, absent, code, name, phone, address, department);
            this.add(Emp);
        }

    }

    public void createEmp_part() {
        if (this.size() >= 100) {
            System.out.println("The company has a maximum of 100 employees.");
            System.out.println("Thus, you cannot add more Employee!!! ");
        } else {
            System.out.println("Input Employee Parttime infomation:");
            String code, name, phone, address, department;
            int present, DailyWage;
            boolean check = true;
            boolean checkformat = true;
            do {
                code = Utils.Code("Input the code of Employee: ");
                if (checkCode(code) >= 0) {
                    System.out.println("Duplicated code!");
                } else {
                    check = false;
                }
            } while (check);
            name = Utils.getString("Input the Employee's name: ");
            phone = Utils.getString("Input the Employee's phone: ", 10, 12);
            address = Utils.getString("Input the Employee's address: ");
            department = Utils.getString("Input the Employee's department: ");
            present = Utils.getInt("Input the Employee's present: ", 0);
            DailyWage = Utils.getInt("Input the Employee's DailyWage: ", 10);

            Employee Emp = new Emp_parttime(present, DailyWage, code, name, phone, address, department);
            this.add(Emp);
        }
    }

    public void PrintEmp_full() {
        for (Employee Emp : this) {
            if (Emp instanceof Emp_fulltime) {
                System.out.println(Emp.toString());
            }
        }
    }

    public void PrintEmp_part() {
        for (Employee thi : this) {
            if (thi instanceof Emp_parttime) {
                System.out.println(thi.toString());
            }
        }
    }

    public int checkCode(String code) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i) instanceof Emp_fulltime) {
                if (((Emp_fulltime) this.get(i)).getCode().equalsIgnoreCase(code)) {
                    return i;
                }
            }
        }
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i) instanceof Emp_parttime) {
                if (((Emp_parttime) this.get(i)).getCode().equalsIgnoreCase(code)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
