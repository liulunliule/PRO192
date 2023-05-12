/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookPkg;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class Book implements Comparable, Serializable{
    String ID;
    String title;
    int price;
    
    public Book(){
        
    }

    public Book(String ID, String title, int price) {
        this.ID = ID;
        this.title = title;
        this.price = price;
    }
    
    @Override
    public String toString(){
        return ID + " , " + title + " , " + price;
    }
    
    @Override
    public int compareTo(Object o){
        Book b =(Book) o;
        return ID.compareTo(b.title);
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    
    
}
