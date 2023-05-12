/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 840G3
 */
public class Box extends Rectangle {

    int height = 0;

    public void set(int l, int w, int h) {
        super.setValue(l, w);
        height = h > 0 ? h : 0;
    }

    @Override
    public String toString() {
        return "[" + length + ", " + width + ", " + height + "]";
    }

}
