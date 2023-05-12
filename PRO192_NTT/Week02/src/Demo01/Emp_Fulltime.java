package Demo01;
public class Emp_Fulltime extends Emp{
    private int salary;
    private int absent;

    public Emp_Fulltime( String code, String name, String phone, int salary, int absent) {
        super(code, name, phone);
        this.salary = salary;
        this.absent = absent;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public int SumSalary(){
        return salary - (absent*50);
    }
    
    public void printInfo(){
        System.out.println(code+"-"+name+"-"+phone+"-"+SumSalary());
    }
}
