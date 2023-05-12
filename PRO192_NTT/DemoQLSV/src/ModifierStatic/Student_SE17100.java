/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModifierStatic;

import ModifierStatic.*;

/**
 *
 * @author 840G3
 */
public class Student_SE17100 {

    String code;
    String name;
    static String unit = "fpt university";

    public Student_SE17100(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public Student_SE17100() {
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

    public static String getUnit() {
        return unit;
    }

    public static void setUnit(String unit) {
        Student_SE17100.unit = unit;
    }
    
    public static void change(){
        unit="fpt uni HCM";
    }

    public void Output() {
        System.out.println(code + " - " + name + " - " + unit);
    }
}
