package employees;

import java.io.Serializable;

public class Employee implements Comparable<Employee>,Serializable {

    private String code;
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(String code) {
        this.code = code;
    }

    public Employee(String code, String name, int salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void print() {
        System.out.println(code + "\t" + name + "\t" + salary);
    }

    @Override
    public int compareTo(Employee o) {
        return this.getCode().compareTo(o.getCode());
    }

}
