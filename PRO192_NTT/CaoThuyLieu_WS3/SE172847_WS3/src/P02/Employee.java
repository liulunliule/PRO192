package P02;
public class Employee {

    String Code;
    String Fullname;
    int Age;
    String Address;
    long Salary;

    public Employee(String Code, String Fullname, int Age, String Address, long Salary) {
        this.Code = Code;
        this.Fullname = Fullname;
        this.Age = Age;
        this.Address = Address;
        this.Salary = Salary;
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

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public long getSalary() {
        return Salary;
    }

    public void setSalary(long Salary) {
        this.Salary = Salary;
    }

    public String toString() {
        return Code + "-" + Fullname + "-" + Age + "-" + Address + "-" + Salary ;
    }    
}
