package DTO;
import java.util.Scanner;
public class Painting extends Item {
    private int height; //the height of a painting object (height>=0 and <=2000)
    private  int width; //the width of a painting object (height>=0 and <=3000)
    private  boolean isWatercolour; //the painting object use a watercolor or not
    private  boolean isFramed; //the painting object has a frame or not
    //You add more your code
    //constructors
    public Painting() {
        super();
        height = 0;
        width = 0;
        isWatercolour = false;
        isFramed = false;
    }
    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }
    //getter
    //setter
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public boolean isIsWatercolour() {
        return isWatercolour;
    }
    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }
    public boolean isIsFramed() {
        return isFramed;
    }
    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    //this method  is used to input all fields of a painting object
    @Override
    public void input() {
        //use Scanner class to input fields
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the creator name: ");
        creator = sc.nextLine();
        System.out.println("Please input the price: ");
        value = Integer.parseInt(sc.nextLine());
        System.out.println("Please input height:");
        height = Integer.parseInt(sc.nextLine());
        System.out.println("Please input width:");
        width = Integer.parseInt(sc.nextLine());
        System.out.println("Does the painting object use a watercolor?(True/False)");
        isWatercolour = sc.nextBoolean();
        System.out.println("Does the painting object has a frame?(True/False)");
        isFramed = sc.nextBoolean();
        //use try..catch/throws to handle exceptions
        try {
            if (value < 0)
                throw new Exception("Invalid value");
            if (creator.equals(""))
                throw new Exception("Invalid creator");
            if (height < 0 || height > 2000)
                throw new Exception("Invalid height");
            if (width < 0 || width > 3000)
                throw new Exception("Invalid width");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//this method returns a string that includes  all fields  of a painting object
    @Override
    public String toString() {
        return "Creator: " + creator + " - Prize: " + value + " - Height: " + height + " - Width: " + width + " - Watercolor: " + isWatercolour + " - Frame: " + isFramed;
    }
}
