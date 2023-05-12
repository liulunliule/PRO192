/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Truc Nguyen
 */
import java.util.Scanner;

public class Statue extends Item {

	int weight;
	String colour;
	

	public Statue() {
		weight = 0;
		colour = "";
	}

	public Statue(int weight, int value, String creator, String colour) {
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

	public void inputStatue() {
		input();
		Scanner sc;
            sc = new Scanner(System.in);

		System.out.print("Enter the weight : ");
		weight = sc.nextInt();

		System.out.print("Enter the colour : ");
		colour = sc.nextLine();

	}

	public void outputStatue() {
		output();
		System.out.println("Weight : " + weight);
		System.out.println("Colour : " + colour);
	}

}
