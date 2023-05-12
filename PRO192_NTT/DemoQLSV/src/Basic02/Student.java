package Basic02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 840G3
 */
public class Student {

    //thuộc tính mô tả
    String code;
    String fullname;
    String phone;
    int age;

    /*hàm khởi tạo (contructer)
    hàm sẽ tự chạy khi 1 đối tượng được khởi tạo
    */
    public Student(String code, String fullname, String phone, int age) {
        this.code = code;
        this.fullname = fullname;
        this.phone = phone;
        this.age = age;
    }

    public Student() {
    }    

    public void setCode(String code) {
        this.code = code;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public String getFullname() {
        return fullname;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
    
    
    

    
    public void printinfo() {
        System.out.println(code + "-" + fullname + "-" + phone + "-" + age);
    }

}
