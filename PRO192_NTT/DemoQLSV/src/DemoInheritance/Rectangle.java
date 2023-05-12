/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoInheritance;

/**
 *
 * @author 840G3
 */
public class Rectangle {

    public int length;
    public int width;

    public Rectangle() {
    }

    public Rectangle(int l, int w) {
        length = l > 0 ? l : 0;
        width = w > 0 ? w : 0;
    }

    @Override
    public String toString() {
        return "{length= " + length + ", width= " + width + '}';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

        public int area(){
        return length*width;
    }

}
