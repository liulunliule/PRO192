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
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;
    
    public Painting(){}

    public Painting( int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }
    
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        height = sc.nextInt();
        System.out.println("Enter the width: ");
        width = sc.nextInt();
    }
    
    @Override
    public void output(){
        System.out.println("The height : " + this.height);
        System.out.println("The width : " + this.width);
        System.out.println(this.isWatercolour);
        System.out.println(this.isFramed);
}
    
}
