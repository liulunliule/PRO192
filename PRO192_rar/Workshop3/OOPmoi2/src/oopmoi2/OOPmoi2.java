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
public class OOPmoi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
            Product obj1= new Product(1000,"Kem", 100);
            
                System.out.println("State of obj1: ");
                obj1.getImportTax();
                System.out.println("set price = 3000 of obj1");
                obj1.setPrice(1000);
                System.out.println("Tax :" + (obj1.getPrice() * 10/100));
                
            Product obj2= new Product(2000,"Kem", 200);
            
                System.out.println("State of obj1: ");
                obj2.getImportTax();
                System.out.println("set price = 3000 of obj1");
                obj2.setPrice(2000);
                System.out.println("Tax:" + (obj2.getPrice() * 10/100) );
                
            Product obj3= new Product(3000,"Kem", 300);
            
                System.out.println("State of obj1: ");
                obj3.getImportTax();
                System.out.println("set price = 3000 of obj1");
                obj3.setPrice(3000);
                System.out.println("Tax: " + (obj3.getPrice() * 10/100) );
            
            Product obj4= new Product(4000,"Kem", 500);
            
                System.out.println("State of obj1: ");
                obj4.getImportTax();
                System.out.println("set price = 3000 of obj1");
                obj4.setPrice(4000);
                System.out.println("Tax: " + (obj4.getPrice() * 10/100) );
                
            Product obj5= new Product(5000,"Kem", 500);
            
                System.out.println("State of obj1: ");
                obj5.getImportTax();
                System.out.println("set price = 3000 of obj5");
                obj5.setPrice(5000);
                System.out.println("Tax: " + (obj5.getPrice() * 10/100) );
        
    }
    
}
