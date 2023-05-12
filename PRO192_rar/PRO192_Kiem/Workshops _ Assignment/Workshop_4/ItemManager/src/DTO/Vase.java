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
    public class Vase extends Item {
	int height;
	String material;
	

	public Vase() {
		height = 0;
		material = "";
	}

	public Vase(int height, int value, String creator, String material) {
		super(value, creator);
		this.height = height;
		this.material = material;
	}

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

	public void inputVase() {
		input();
		Scanner sc;
            sc = new Scanner(System.in);

		System.out.print("Enter the height : ");
		height = sc.nextInt();

		System.out.print("Enter the material : ");
		material = sc.nextLine();

	}

	public void outputVase() {
		output();
		System.out.println("Height : " + height);
		System.out.println("Material : " + material);
	}
}
    
    

