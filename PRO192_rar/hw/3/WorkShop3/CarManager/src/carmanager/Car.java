/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carmanager;

/**
 *
 * @author 840G3
 */
public class Car {

    /**
     * @param args the command line arguments
     */
    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBrake;
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    //Constructor
    public Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBrake){
        this.Colour=Colour;
        this.EnginePower=EnginePower;
        this.Convertible=Convertible;
        this.ParkingBrake=ParkingBrake;
    }
    public Car(){
        
    }
    // Getters
    public String getColour(){
        return Colour;
    }
    public int getEnginePower(){
        return EnginePower;
    }
    public boolean getConvertible(){
        return Convertible;
    }
    public boolean getParkingBrake(){
        return ParkingBrake;
    }
    
    //Setters
    public void setColour(String Colour){
        this.Colour=Colour;
    }
    public void setEnginePower(int EnginePower){
        this.EnginePower=EnginePower;
    }
    public void setConvertible(boolean Convertible){
        this.Convertible=Convertible;
    }
    public void setParkingBrake(boolean ParkingBrake){
        this.ParkingBrake=ParkingBrake;
    }
    public void pressStartButton(){
        System.out.println("You have pressed the start button");
    }
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button");
    }
    public void output(){
        System.out.println("Your favorite colour: " + Colour);
        System.out.println("Your favorite EnginePower: " + EnginePower);
        System.out.println("Your Convertible: " + Convertible);
        System.out.println("Your ParkingBrake: " + ParkingBrake);
    //    return output;
    }
}
