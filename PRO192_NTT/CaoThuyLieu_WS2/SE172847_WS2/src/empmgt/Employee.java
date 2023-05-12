package empmgt;

public class Employee  {
    private String Code;
    private String Fullname;
    private String Phone;
    private long Salary;
    private long SalaryCoefficient;
    private String department;

    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee) obj;
        return this.Code.equalsIgnoreCase(emp.getCode());
    }
    
    public Employee() {
    }

    public Employee(String Code) {
        this.Code = Code;
    }

    public Employee(String Code, String Fullname, String Phone, long Salary, long SalaryCoefficient, String department) {
        this.Code = Code;
        this.Fullname = Fullname;
        this.Phone = Phone;
        this.Salary = Salary;
        this.SalaryCoefficient = SalaryCoefficient;
        this.department = department;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public long getSalary() {
        return Salary;
    }

    public void setSalary(long Salary) {
        this.Salary = Salary;
    }

    public long getSalaryCoefficient() {
        return SalaryCoefficient;
    }

    public void setSalaryCoefficient(long SalaryCoefficient) {
        this.SalaryCoefficient = SalaryCoefficient;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" + "Code=" + Code + ", Fullname=" + Fullname + ", Phone=" + Phone + ", "
                + "Salary=" + Salary + ", SalaryCoefficient=" + SalaryCoefficient + ", department=" + department + '}';
    }
    
}
