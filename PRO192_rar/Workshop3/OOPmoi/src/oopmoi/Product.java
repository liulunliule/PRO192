/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmoi;

/**
 *
 * @author ADMIN
 */
public class Product {
    private String name;
    private double price;
    private double tax;
    

    public Product(){};

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getImportTax(){            
        return (this.price + (this.price * 0.1));
    } 
    
    public void name(){
        System.out.println("Name of product: " + name);       
    }
    
}


