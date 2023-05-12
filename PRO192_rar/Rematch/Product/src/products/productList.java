/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import ProductManager.inputter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class productList extends ArrayList<product> { // loi dung tinh chat cua arraylist add remove insert

    public productList() {
        super();// khoi tao constructor cuar arraylist
    }

    public boolean loadFromFile(String filename) throws IOException {
        //Step 1. Kiem tra xem duong dan co ton taij khong
        File f = new File(filename);
        if (!f.exists()) {
            return false;
        }
        try {
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String line = "";
            while ((line = bf.readLine()) != null) {
                String[] tokens = line.split(",");
                String id = tokens[0].trim();
                String name = inputter.normalize(tokens[1]);
                int price = Integer.parseInt(tokens[2].trim());
                product p = new product(id, name, price);
                this.add(p); // dua product vao productlist
            }
            bf.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
            
        }
    return true;
    }
    

    
public boolean writeToFile(String filename) {
        File f = new File(filename);
        if (!f.exists()) {
            return false;
        }
        try {
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(f);
            for (product p : this) {
                pw.println(p);
            }
            pw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
            return true;
        }
        return true;
    }
    
    public product search(String id){
        id = inputter.normalize(id).toUpperCase();
        for(product p:this)
            if(p.id.equals(id)) return p;
        return null;       
    }
    
    public product searchbyname(String name){
        name = inputter.normalize(name);
        for(product p:this){
            if(p.name.indexOf(name)>=0);
            return p;
        }
        return null;
    }
    
    public void addProduct(){
        // nhap id,name,price
        String pattern = "^p\\d{3}$";
        String id;
        boolean dupplicate = false;
        do{
            id = inputter.getPatternStr("Enter id : ", pattern);
            if((search(id)) != null) dupplicate = true;
            else dupplicate = false;
        } while(dupplicate);
        
        //nhap name
        String name = inputter.getNonBlankStr("Enter name: ");
        // nhap price
        int price = inputter.getIntGreater("Enter price: ", modCount);
        product p = new product(id,name,price);
        this.add(p);
        System.out.println("Added.");
    }
    
    public void printAll(){
        for(product p:this){
            System.out.println(p);
        }
    }
    
    public void printName(){
        String name = inputter.getNonBlankStr("Enter name: ");
        for(product p:this){
            if(p.name.indexOf(name)>=0)
                System.out.println(p);
        }
    }
}
