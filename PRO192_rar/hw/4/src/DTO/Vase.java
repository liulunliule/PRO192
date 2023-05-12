package DTO;
import java.util.Scanner;
public class Vase extends Item {
    private  int height;//height of a vase (>=0 and <=2000)
    private String material;//material of a vase (is not empty)
    //constructors
    public Vase() {
        super();
        height = 0;
        material = "";
    }
    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }
    //getter
    //setter
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    //this method  is used to input all fields of a Vase object
    @Override
    public void input() {
        //use Scanner class to input fields
        //use try..catch/throws to handle exceptions
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the creator name: ");
        creator = sc.nextLine();
        System.out.println("Please input the price: ");
        value = Integer.parseInt(sc.nextLine());
        System.out.println("Please input the height:");
        height = Integer.parseInt(sc.nextLine());
        System.out.println("Please input the material of vase:");
        material = sc.nextLine();
        try {
            if (value < 0)
                throw new Exception("Invalid value");
            if (creator.equals(""))
                throw new Exception("Invalid creator");
            if (height < 0 || height > 2000)
                throw new Exception("Invalid height");
            if (material.equals(""))
                throw new Exception("Invalid material");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    
    }//this method returns a string that includes  value, creator, height, material  of a vase object
    @Override
    public String toString(){
        return "Creator: " + creator + " - Prize: " + value + " - Height: " + height + " - Material: " + material;
    }
}