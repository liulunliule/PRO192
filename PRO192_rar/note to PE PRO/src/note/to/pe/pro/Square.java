/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package note.to.pe.pro;

/**
 *
 * @author 840G3
 */
public class Square extends Restangle{
    private double edge;

    public Square(double edge, double width, double length) {
        super(width, length);
        this.edge = edge;
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square() {
    }
    
    @Override
    public void output(){
        System.out.println(edge);
    }
    
}
