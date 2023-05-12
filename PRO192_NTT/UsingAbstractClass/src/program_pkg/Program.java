/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_pkg;

import Customer_pkg.Customer;
import employee_pkg.Employee;
import manager_pkg.Manager;

/**
 *
 * @author 840G3
 */
public class Program {

    public static void main(String[] args) {
        Manager admin = new Manager();

        Employee tom = new Employee("Emp001", "123", "Tom");
        admin.addUserToList(tom);

        Customer david = new Customer("Cus100", "456", "david@gmail.com");
        admin.addUserToList(david);

        System.out.println("*************User list***********");
        admin.printList();
        System.out.println("************Login infor***********");
        admin.showLoginStatus();

    }
}
