package DTO;

public class Emp_parttime extends Employee {

    private int present;
    private int DailyWage;

    public Emp_parttime(int present, int DailyWage, 
            String code, String name, String phone, String address, String department) {
        super(code, name, phone, address, department);
        this.present = present;
        this.DailyWage = DailyWage;
    }

    public Emp_parttime(int present, int DailyWage) {
        this.present = present;
        this.DailyWage = DailyWage;
    }

    public Emp_parttime() {
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }

    public int getDailyWage() {
        return DailyWage;
    }

    public void setDailyWage(int DailyWage) {
        this.DailyWage = DailyWage;
    }

    public int SumSalary() {
        return present * DailyWage;
    }

    @Override
    public String toString() {
        return super.getCode() + "-" + super.getName() + "-" + SumSalary();
    }

}
