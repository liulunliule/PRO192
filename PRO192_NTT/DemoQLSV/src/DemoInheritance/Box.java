/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoInheritance;

/**
 *
 * @author 840G3
 */
public class Box extends Rectangle {

    private int height = 0;

    public Box() {
    }

    public Box(int l, int w, int h) {
        super(l, w);
        height = h > 0 ? h : 0;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "{length= " + getLength() + " ,width= " + getWidth() + " ,height= " + height + '}';
    }

    public int area() {
        int l = this.getLength();
        int w = this.getWidth();
        int h = this.getHeight();
        return 2 * (l * w + w * h + h * 1);
    }
    
    public int volume() {
        return this.getLength()*this.getWidth()*height;
    }

}
