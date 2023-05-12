/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop3;

/**
 *
 * @author ADMIN
 */
public class Car {
    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBrake;

    public Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBrake) {
        Colour = Colour;
        EnginePower = EnginePower;
        Convertible = Convertible;
        ParkingBrake = ParkingBrake;
    }

    public String getColour() {
        return Colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public boolean isParkingBrake() {
        return ParkingBrake;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }
    
    public void pressStartButton(){
        System.out.println("You have pressed the start button");
        }
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button");
        }
    public void output(){
        System.out.println("Colour: " + Colour);
        System.out.println("EnginePower: " + EnginePower);
        System.out.println("Convertible: " + Convertible);
        System.out.println("ParkingBrake: " + ParkingBrake);
        }
    
    }
    
    
