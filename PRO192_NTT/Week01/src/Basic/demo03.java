package Basic;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 840G3
 */
//viết chương trình nhập code,name,age,address của student & xuất ra
public class demo03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code, name, addr;
        int age;
        System.out.print("Enter code: ");
        code = sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = Integer.parseInt(sc.nextLine());//tránh buffer
        System.out.print("Enter addr: ");
        addr = sc.nextLine();
        System.out.println("------------------------------------------");
        System.out.println(code + " - " + name + " - " + age + " - " + addr);

    }

}
