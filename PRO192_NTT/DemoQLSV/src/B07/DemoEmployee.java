/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B07;

/**
 *
 * @author 840G3
 */
public class DemoEmployee {
    public static double TotalSalary(Employee emp[]){
        double s=0;
        for(int i=0; i<emp.length ; i++)
            s+=emp[i].salary;
        return s;
    }
    public static void main(String[] args) {
        Employee[] emp =new Employee[3];
        
        emp[0]= new Employee("SE0001", "Le Phuong", 500);
        emp[1]= new Employee("SE0002", "Le Hoang", 600);
        emp[2]= new Employee("SE0003", "Le Lan", 550);
        
        double total=DemoEmployee.TotalSalary(emp);
        System.out.println("Total Salary: "+ total);
        System.out.println("------------------------");
        
        System.out.println(emp[0]);
        System.out.println(emp[1]);
        System.out.println(emp[2]);
        
    }
}
