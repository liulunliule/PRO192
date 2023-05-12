/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic04;

/**
 *
 * @author 840G3
 */
public class Programmer extends Employee {

    private int bonus;

    public Programmer(int bonus, String name, String code, int salary) {
        super(name, code, salary);
        this.bonus = bonus;
    }

    public int Total() {
        return this.getSalary()+bonus;
    }
    public void in4(){
    this.toString();
}
}
