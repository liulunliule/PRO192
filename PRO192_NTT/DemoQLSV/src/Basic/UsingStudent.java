package Basic;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 840G3
 */
public class UsingStudent {

    public static void main(String[] args) {
        Student sv1 = new Student(); // new Student();// là Instance
        sv1.code = "SE170001";
        sv1.fullname = "Le Van Bao";
        sv1.phone = "090123444";
        sv1.age = 20;

        sv1.printinfo();
    }

}
