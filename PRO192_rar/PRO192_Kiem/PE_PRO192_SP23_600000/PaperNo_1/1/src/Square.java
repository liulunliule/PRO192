/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 840G3
 */
public class Square extends Rectangle{
    private String unit;

    public Square() {
    }

    public Square(String unit) {
        this.unit = unit;
    }

    public Square(String unit, int length, int width) {
        super(length, width);
        this.unit=unit;
    }

    public String getUnit() {
        return unit="cm";
    }
    
    

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    public void Square(int side) {
        if (super.getLength()>0 ){
            side = super.getLength();
        } 
        else if (super.getWidth()>0){
            side = super.getWidth();
        }
        
    }
    public int getPerimeter () {
        return 2*(super.getLength()+super.getWidth());
    }
    public void output(){
        System.out.println("the side of the square= "+super.getLength()+"("+unit+")");
        System.out.println("the perimeter of the square= ");
    }
    
    
    

}
