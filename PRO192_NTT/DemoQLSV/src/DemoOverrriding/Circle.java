/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoOverrriding;

/**
 *
 * @author 840G3
 */
public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public double Area(){
        return Math.PI*radius*radius;
    }
    public void printArea(){
        System.out.println("Area Circle: "+ Area());
    }
}
