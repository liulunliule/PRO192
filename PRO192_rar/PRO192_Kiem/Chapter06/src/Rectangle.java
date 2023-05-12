/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 840G3
 */
public class Rectangle {

    protected int length = 0, width = 0;

    //overloading
    public void setValue(int l) {
        length = 1 > 0 ? 1 : 0;
    }

    public void setValue(int l,int w) {
        length = 1 > 0 ? 1 : 0;
        width =w>0? w:0;
    }

    @Override
    public String toString() {
        return "["+ length + ", " + width + "]";
    }
    
}
