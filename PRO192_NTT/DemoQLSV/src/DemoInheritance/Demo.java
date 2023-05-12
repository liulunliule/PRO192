/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoInheritance;

/**
 *
 * @author 840G3
 */
public class Demo {
    public static void main(String[] args) {
        Rectangle r =new Rectangle(2, 5);
        System.out.println("Rectangle: "+ r.toString());
        System.out.println(" Area: "+ r.area());
        Box b = new Box(2, 2, 2);
        System.out.println("Box: "+ b.toString());
        System.out.println("Area: "+ b.area());
        System.out.println("Volume: "+ b.volume());
    }
}
