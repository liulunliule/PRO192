/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antiqueshop;

/**
 *
 * @author ADMIN
 */
public class Item {
    protected int value;
    protected String creator;
    
    public Item(){}

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nValue:"+value+"\nCreator:"+creator;
    }
    
}
