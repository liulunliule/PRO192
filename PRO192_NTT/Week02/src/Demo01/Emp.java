/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo01;

/**
 *
 * @author 840G3
 */
public abstract class Emp {
    String code;
    String name;
    String phone;

    public Emp(String code, String name, String phone) {
        this.code = code;
        this.name = name;
        this.phone = phone;
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
    public abstract int SumSalary();
//    {
//        return 1500;
//    }
    
    public void printInfo(){
        System.out.println(code+"-"+name+"-"+phone+"-"+SumSalary());
    }
}
