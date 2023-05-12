/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class SpecCar extends Car {
    
    private int type;
    
    public SpecCar() {
        super();
        
    }
    
    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }
    
    @Override
    public String toString() {
        return super.getMaker() + "," + super.getPrice() + "," + this.type;
    }

    public void setData() {
        super.setMaker("XZ" + getMaker().substring(0, 4));
        super.setPrice  (getPrice() + 20);
        
    }
    
}
