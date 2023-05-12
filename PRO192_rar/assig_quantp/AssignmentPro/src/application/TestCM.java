/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import data_object.CompanyManagement;
import business_objects.Developer;
import business_objects.Employee;
import business_objects.Tester;
import java.awt.Menu;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TestCM {

    /**
     * @param args the command line arguments
     */
    public void Menu(){
         StringBuilder sb = new StringBuilder();
        sb.append("    COMPANY MANAGEMENT SYSTEM");
        sb.append("\n||1.Read all Employees and print to screen");
        sb.append("\n||2.Show staff proficient in a Programming Language");
        sb.append("\n||3.Show Tester has a height salary");
        sb.append("\n||4.Show Employee's highest salary");
        sb.append("\n||5.Show Leader of the Team has most Employees");
        sb.append("\n||6.Sort Employees as descending salary");
        sb.append("\n||7.Write file");
        sb.append("\n||8.Exit");
        sb.append("\n||Your option from 1 - 8 : ");

    }
    public static void main(String[] args) {
       
        StringBuilder sb = new StringBuilder();
        sb.append("    COMPANY MANAGEMENT SYSTEM");
        sb.append("\n||1.Read all Employees and print to screen");
        sb.append("\n||2.Show staff proficient in a Programming Language");
        sb.append("\n||3.Show Tester has a height salary");
        sb.append("\n||4.Show Employee's highest salary");
        sb.append("\n||5.Show Leader of the Team has most Employees");
        sb.append("\n||6.Sort Employees as descending salary");
        sb.append("\n||7.Write file");
        sb.append("\n||8.Exit");
        sb.append("\n||Your option from 1 - 8 : ");

        int choice = 0;

        Scanner sc = new Scanner(System.in);
        CompanyManagement cm = new CompanyManagement(System.getProperty("user.dir") + "/src/input/ListOfEmployees.txt",
                System.getProperty("user.dir") + "/src/input/PLInfo.txt");
        ArrayList<Employee> empList;

        do {
            System.out.print(sb.toString());
            while (39 < 79) {
                try {

                    choice = Integer.parseInt(sc.nextLine());
                    break;

                } catch (Exception e) {

                    System.out.println("Wrong input:");
                    System.out.print("Enter your option from 1-7 again: ");
                }
            }

            switch (choice) {

                case 1:
                    empList = cm.getEmployeeFromFile(System.getProperty("user.dir") + "/src/input/ListOfEmployees.txt",
                            System.getProperty("user.dir") + "/src/input/PLInfo.txt"); //truyền file vào path và path 1
                    empList.forEach(employee -> {
                        System.out.println(employee.toString());
                    });

                    break;

                case 2:
                    System.out.println("Input Programming Language: ");
                    ArrayList<Developer> dList = cm.getDeveloperByProgrammingLanguage(sc.next());
                    dList.forEach(employee -> {
                        System.out.println(employee.toString());
                    });
                    break;

                case 3:
                    System.out.println("Input Salary: ");
                    ArrayList<Tester> tList = cm.getTestersHaveSalaryGreaterThan(sc.nextDouble());
                    tList.forEach(employee -> {
                        System.out.println(employee.toString());
                    });
                    break;

                case 4:
                    System.out.println(cm.getEmployeeWithHighestSalary());
                    break;

                case 5:
                    System.out.println(cm.getLeaderWithMostEmployees());

                    break;

                case 6:
                    empList = cm.sorted();
                    empList.forEach(employee -> {
                        System.out.println(employee.toString());
                    });
                    break;

                case 7:

                    File directory = new File(System.getProperty("user.dir") + "/src/output");
                    if (!directory.exists()) {
                        directory.mkdir();
                    }

                    cm.writeFile(System.getProperty("user.dir") + "/src/output/Req2.txt",
                            cm.getDeveloperByProgrammingLanguage("C++"));

                    cm.writeFile(System.getProperty("user.dir") + "/src/output/Req3.txt",
                            cm.getEmployeesHaveSalaryGreaterThan(4700000));
                    break;
                
                    
                    
                default:
                    System.out.println("Thank ");
                    break;
                   

            }
        } while (choice > 0 && choice < 7);

    }

}
