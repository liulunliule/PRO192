/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmoi3;

/**
 *
 * @author ADMIN
 */
public class Product3 {
    private double price;
    private double tax;
    private String name;
    
    public Product3(){};

    public Product3(double price, double tax, String name) {
        this.price = price;
        this.tax = tax;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}




