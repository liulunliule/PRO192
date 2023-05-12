/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 840G3
 */
public class Demo_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r = new Rectangle();
        r.setValue(5);
        System.out.println(r.toString());
        r.setValue(10,20);
        System.out.println(r.toString());
        Box b = new Box();
        b.set(5,10,15);
        System.out.println(b.toString());
    }
    
}
