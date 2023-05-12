/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmoi2;

/**
 *
 * @author ADMIN
 */
public class Product {
    private int price;
    private String name;
    private double tax;
    
    public Product(){};

    public Product(int price, String name, double tax) {
        this.price = price;
        this.name = name;
        this.tax = tax;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    
    public void getImportTax(){
        System.out.println("Name of product: " + name);
        System.out.println("Price of product: " + price);      
}
}
