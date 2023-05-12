/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

/**
 *
 * @author ADMIN
 */
public class product implements Comparable {

    String id;
    String name;
    int price;

    public product() {

    }

    public product(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        product other = (product) o;
        if (this.price > other.price) {
            return -1; // giam dan
        } else if (this.price == other.price) {
            return 1;
        } else {
            return this.id.compareTo(other.id);
        }
    }

    @Override
    public String toString() {
        return id + "," + name + "," + price;
    }
}