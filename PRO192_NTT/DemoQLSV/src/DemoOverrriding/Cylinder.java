/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoOverrriding;

/**
 *
 * @author 840G3
 */
public class Cylinder extends Circle{
    int height;

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    //ghi đè Area của Circle 
    public double Area(){
        return 2*Math.PI*radius*height;
    }
    //ghi đè printArea của Circle 
    public void printArea(){
        System.out.println("Area Cylinder :"+ Area());
    }
     
}
