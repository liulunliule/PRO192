/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoAbtract;

/**
 *
 * @author 840G3
 */
public class Circle extends shapes{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double circumstance() {
        return 2*Math.PI*r*r;
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }
     
}
