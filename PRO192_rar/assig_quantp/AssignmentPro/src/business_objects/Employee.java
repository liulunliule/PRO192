/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_objects;

/**
 *
 * @author USER
 */
public abstract class Employee {

    private String empID;
    private String empName;
    private int baseSal;

    public Employee() {//hàm dựng default
    }

    public Employee(String empID, String empName, int baseSal) {//hàm dựng lớp Employee
        this.empID = empID;
        this.empName = empName;
        this.baseSal = baseSal;
    }

    /**
     * @return the employee ID
     */
    public String getEmpID() {
        return empID;
    }

    /**
     * @return the empName
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * @param empName the empName to set
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * @return the baseSal
     */
    public int getBaseSal() {
        return baseSal;
    }

    /**
     * @param baseSal the baseSal to set
     */
    public void setBaseSal(int baseSal) {
        this.baseSal = baseSal;
    }

    // Abstract getSalary method for abstract class employee
    public abstract double getSalary();

    /**
     * Overrride default toString method for class Employee
     */
    @Override
    public String toString() {
        return getEmpID() + "_" + getEmpName() + "_" + getBaseSal();
    }

}//kết thúc class Employee
