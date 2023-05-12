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

    protected int value;
    protected String creator;

    public Item() {
    }

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

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        value = Integer.parseInt(sc.nextLine());
        if (value > 0) {
            System.out.println("Enter the creator: ");
            creator = sc.nextLine();
        }       
    }

    public void output() {
        System.out.println("The creator : " + this.creator);
        System.out.println("The value : " + this.value);
    }

    @Override
    public String toString() {
        return "The creator : " + this.creator + "The value : " + this.value;
    }

}
