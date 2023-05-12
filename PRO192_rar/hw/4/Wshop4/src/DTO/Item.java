package DTO;
import java.util.Scanner;
public class Item {
    // declare fields 
    protected int value;  // the price of a Item (>=0)
    protected String creator;  // the creator who creates the item( is not empty)
    //constructors
    public Item(){
        value = 0;
        creator = "";
    }
    public Item(int value, String creator){  
        this.value = value;
        this.creator = creator;
    }
    //getters,setters:  you is required to add more code to get/set fields of a Item object
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
    //this method is used to input all fields of a Item object
    public void input(){
        //use Scanner class to input fields
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the price: ");
        value = input.nextInt();
        System.out.println("Please input the creator name: ");
        creator = input.next();
        //use try..catch/throws to handle exceptions
        try {
            if (value < 0) {
                throw new Exception("Invalid value");
            }
            if (creator.equals("")) {
                throw new Exception("Invalid creator");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //this method returns a string that includes  value, creator of a Item object
    @Override
    public String toString(){
        return "Creator: " + creator + " - Prize: " + value;
    }
}