/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Item {
    private int value;
    private String creator;
    
    public Item(){}

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void output(){
        System.out.println("The creator: " + creator);
        System.out.println("The value: " + value);
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the creator: ");
        creator = sc.nextLine();
        System.out.print("Input the value: ");
        value = Integer.parseInt(sc.nextLine());
    }
}
