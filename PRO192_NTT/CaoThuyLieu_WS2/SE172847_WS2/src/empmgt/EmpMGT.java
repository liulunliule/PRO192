
package empmgt;

public class EmpMGT {

    public static void main(String[] args) {
        int numEmployees;
        employeeList emp = new employeeList();
        
        //The program allows the user to enter the number of employees.
        numEmployees = emp.getNumEmployees();
        
        //Enter the information of each employee
        for (int i = 0; i < numEmployees; i++) {
            emp.createEmployee();
        }
        
        //Print out the list of employees.
        emp.printList();
        
        //Print out the total salary of the employees.
        emp.totalSalary();
        
        //Update employee salary based on the employee code entered by the user.
        emp.updateSalary();
        emp.printList();
    }
    
}
