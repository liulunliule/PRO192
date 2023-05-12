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

public class Painting extends Item {

	int height;
	int width;
	boolean IsWatercolour;
	boolean IsFramed;
	

	public Painting() {
		height = 0;
		width = 0;
		IsFramed = true;
		IsWatercolour = true;
	}

	public Painting(int height, int width, int value, String creator, boolean IsWatercolour, boolean IsFramed) {
		super(value, creator);
		this.height = height;
		this.width = width;
		this.IsWatercolour = IsWatercolour;
		this.IsFramed = IsFramed;
	}

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

	public boolean getIsWatercolour() {
		return IsWatercolour;
	}

	public void setIsWatercolour(boolean IsWatercolour) {
		this.IsWatercolour = IsWatercolour;
	}

	public boolean getIsFramed() {
		return IsFramed;
	}

	public void setIsFramed(boolean IsFramed) {
		this.IsFramed = IsFramed;
	}

	public void inputPainting() {
		input();
		Scanner sc;
            sc = new Scanner(System.in);

		System.out.print("Enter the height : ");
		height = sc.nextInt();

		System.out.print("Enter the width : ");
		width = sc.nextInt();
		
		System.out.println(" ( Enter the IsWatercolour/IsFramed (True : Co / False : Khong) )");

		System.out.print("Enter the IsWatercolour : ");
		IsWatercolour = sc.nextBoolean();

		System.out.print("Enter the IsFramed : ");
		IsFramed = sc.nextBoolean();

	}

	public void outputPainting() {
		output();
		System.out.println("Weight : " + height);
		System.out.println("Weight : " + width);
		System.out.println("Watercolour : " + IsWatercolour);
		System.out.println("Framed : " + IsFramed);
	}
}
