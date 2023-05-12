/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxPkg;

import rectPkg.Rectangle;

/**
 *
 * @author 840G3
 */
public class Demo_1 {
    public static void main(String[] args) {
        box b =new box();
        b.setSize(1,2,3);
        b.height=10;
        b.price = 7;
//        b.weight =9; 
        System.out.println("Volum of the box: " + b.volume());
        Rectangle r =new Rectangle();
        r.setSize(3, 5);
        r.width=3;
//        r.length =6;
    }
}
