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
public class Vase extends Item {
    private int height;
    private String material;
    
    public Vase(){
        
    }

    public Vase(int value, String creator, int height, String material ) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }
    
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        height = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the material: ");
        material = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + " - The height : " + this.height + "The material : " + this.material; 
    
   
//    public void output(){
//        super.output();
//        System.out.println(;
//}
    }   
}
