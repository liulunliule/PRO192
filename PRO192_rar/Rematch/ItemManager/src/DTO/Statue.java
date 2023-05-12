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
public class Statue extends Item{
    private int weight;
    private String colour;
    
    public Statue(){}

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }
    
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight: ");
        weight = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the colour: ");
        colour = sc.nextLine();
    }
    
    @Override
    public void output(){
        System.out.println("The weight : " + this.weight);
        System.out.println("The colour : " + this.colour);
}
    
}
