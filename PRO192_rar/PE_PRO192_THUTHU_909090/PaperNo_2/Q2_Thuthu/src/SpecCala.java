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

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return getOwner() + "," + getPrice() + "," + color;
    }

    void setData() {
        super.setOwner(getOwner().substring(1, 2) + "XX" + getOwner().substring(3));
    }

    int getValue() {
        if (getPrice() % 2 == 0) {
            return getPrice() + 3;
        } else {
            return getPrice() + 7;
        }
    }

}
