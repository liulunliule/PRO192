/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo01;

/**
 *
 * @author 840G3
 */
public abstract class Emp_parttime extends Emp {

    private int present;

    public Emp_parttime(String code, String name, String phone, int present) {
        super(code, name, phone);
        this.present = present;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }

    public int SumSalary() {
        return present * 40;
    }

    public void printInfo() {
        System.out.println(code + "-" + name + "-" + phone + "-" + SumSalary());
    }
}
