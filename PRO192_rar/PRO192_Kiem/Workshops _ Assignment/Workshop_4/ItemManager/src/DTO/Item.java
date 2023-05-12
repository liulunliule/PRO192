/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author Truc Nguyen
 */
public class Item {

    /**
     * @param args the command line arguments
     */
	int value;
	String creator;
	

	public Item() {
		value = 0;
		creator = null;
	}

	public Item(int value, String creator) {
		this.value = value;
		this.creator = creator;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
            if (value<0){
                System.out.println("ERROR");
            }else{
                this.value = value;}
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public void input() {
	        Scanner sc;
            sc = new Scanner(System.in);

		System.out.println("Enter the value : ");
		value = Integer.parseInt(sc.nextLine());

		System.out.println("Enter the creator : ");
		creator = sc.nextLine();
               

	}

	public void output() {
		System.out.println("Value : " + value);
	}
}
