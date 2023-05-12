/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package note.to.pe.pro;

import java.util.Scanner;

/**
 *
 * @author 840G3
 */
public class Restangle {
    public double width;
    public double length;

    public Restangle() {
    }

    public Restangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getPerimeter () {
        return 2*(width+length);
    }
    
    public double getArea () {
        return width*length;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        double value =0, value2 = 0;
        System.out.print("length: ");
        value= Double.parseDouble(sc.nextLine());
        this.length = value;
        setLength(value);
        System.out.print("Width: ");
        value2= Double.parseDouble(sc.nextLine());
        this.width = value2;
        setWidth(value2);
    }

    public void output() {
        System.out.println(width+length);
    }
}
