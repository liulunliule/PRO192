/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 840G3
 */
public class SpecCala extends Cala{
    private int color;

    public SpecCala() {
    }


    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+"," + color;
    }
    
    public void setData(){
        super.setOwner(getOwner().substring(0, 2)+"XX"+getOwner().substring(3));
    }
    
    public int getValue(){
        if(color%2==1){
            return super.getPrice()+7;
        }
        return super.getPrice()+3;
    }
    
    
    
    
}
