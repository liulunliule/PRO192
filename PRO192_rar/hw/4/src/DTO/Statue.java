package DTO;
import java.util.Scanner;
public class Statue extends Item {
    private int weight; //the weight of a statue object (weight>=0 and <=1000)
    private  String colour; ////the colour of a statue object (is not empty)
    //You add more your code
    //constructors
    public Statue() {
        super();
        weight = 0;
        colour = "";
    }
    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight=weight;
        this.colour=colour;
    }
    //getter
    //setter
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    //this method  is used to input all fields of a statue object
    public void input() {
        //use Scanner class to input fields
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the creator name: ");
        creator = sc.nextLine();
        System.out.println("Please input the price: ");
        value = Integer.parseInt(sc.nextLine());
        System.out.println("Please input weight:");
        weight = Integer.parseInt(sc.nextLine());
        System.out.println("Please input colour of the Statue:");
        colour = sc.nextLine();
        //use try..catch/throws to handle exceptions
        try {
            if (value < 0)
                throw new Exception("Invalid value");
            if (creator.equals(""))
                throw new Exception("Invalid creator");
            if (weight < 0 || weight > 1000)
                throw new Exception("Invalid weight");
            if (colour.equals(""))
                throw new Exception("Invalid colour");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//this method returns a string that includes  value, creator, weight, colour of a statue object
    public String toString() {
        return "Creator: " + creator + " - Prize: " + value + " - Weight: " + weight + " - Colour: " + colour;
    }
}