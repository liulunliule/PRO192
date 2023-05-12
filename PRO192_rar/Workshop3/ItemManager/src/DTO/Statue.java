/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Statue extends Item {
    private int weight;
    private String colour;
    
    public Statue(){}

    public Statue(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

   
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

    public void outputStatue(){
        System.out.println("The weight: " + weight);
        System.out.println("The colour: " + colour);
    }
    
    public void inputStatue(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the weight: ");
        weight = sc.nextInt();
        System.out.print("Input the colour: ");
        sc = new Scanner(System.in);
        colour = sc.nextLine();
    }
}
