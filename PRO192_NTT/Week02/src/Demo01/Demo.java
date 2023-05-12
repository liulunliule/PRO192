/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo01;

/**
 *
 * @author 840G3
 */
public class Demo {
    public static void main(String[] args) {
        Emp[] liEmps= new Emp[3];
        liEmps[0]= new Emp_Fulltime("IT01", "Nguyen An", "0987654321", 1500, 2);
        liEmps[1]= new Emp_Fulltime("IT02", "Nguyen Bin", "0987654322", 1700, 2);
        liEmps[2]= new Emp_parttime("IT03", "Nguyen Can", "0987654323", 26) {};
        
        for (Emp liEmp : liEmps) {
            liEmp.printInfo();
        }
    }
}
