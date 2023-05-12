/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class SpecCala extends Cala {

    private int color;

    public SpecCala() {
        super();
    }

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    public void setData() {
        super.setOwner(getOwner().substring(0, 1) + "XX" + getOwner().substring(2));
    }

    public int getValue() {
        if (this.color % 2 == 1) {
            return super.getPrice() + 3;
        }
        return super.getPrice() + 7;
    }

    @Override
    public String toString() {
        return super.getOwner() + "," + super.getPrice() + "," + this.color;
    }

}
