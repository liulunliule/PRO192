/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carmanager;

/**
 *
 * @author 840G3
 */
//public class Tester extends Car{
//    protected String Colour;
//    protected int EnginePower;
//    protected boolean Convertible;
//    protected boolean ParkingBrake;
//    
//}
public class Tester {
    public static void main(String[] args) {
    Car c=new Car();
    c.pressStartButton();
    c.pressAcceleratorButton();
    c.output();
    Car c2=new Car("read", 100, true, true);
    c2.pressAcceleratorButton();
//    Car c3=new Car();
    c2.setColour("black");
    System.out.println("Colour of c3:" + c2.getColour());
    c2.output();
    }
}
