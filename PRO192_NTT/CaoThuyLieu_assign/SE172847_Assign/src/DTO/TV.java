package DTO;

public class TV extends Product implements Comparable<TV>{
    private int size;

    public TV(int size, String code, String name, String brand, int price, 
            int quantity, String currrent) {
        super(code, name, brand, price, quantity, currrent);
        this.size = size;
    }

    public TV(int size, String code) {
        super(code);
        this.size = size;
    }

    public TV(int size) {
        this.size = size;
    }

    public TV() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void print() {
        System.out.println(super.getCode() + "\t" + super.getName() + "\t" + super.getBrand()+ 
                "\tsize" + size + "\tPrice: " +super.getPrice()+ 
                "\tQuantity: " +super.getQuantity()+ "\tDATE: " + super.getCurrrent());
    }

    @Override
    public String toString() {
        return super.getCode() + "\t" + super.getName() + "\t" + super.getBrand()+ 
                "\tsize" + size + "\tPrice: " +super.getPrice()+ 
                "\tQuantity: " +super.getQuantity()+ "\tDATE: " + super.getCurrrent();
    }
    
    @Override
    public int compareTo(TV o) {
        return -(o.getPrice()-this.getPrice());
    }
}
