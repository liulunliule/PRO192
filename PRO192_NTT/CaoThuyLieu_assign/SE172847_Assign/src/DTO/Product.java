package DTO;

public class Product{
    private String code;
    private String name;
    private String brand;
    private int price;
    private int quantity;
    private String currrent;

    public Product(String code, String name, String brand, int price, int quantity, String currrent) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.currrent = currrent;
    }

    
    public Product(String code) {
        this.code = code;
    }

    public Product() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCurrrent() {
        return currrent;
    }
    
//    @Override
//    public boolean equals(Object obj) {
//        Product Stu = (Product) obj;
//        return this.code.equalsIgnoreCase(Stu.getCode());
//    }

    public void print() {
        System.out.println(code + "\t" + name + "\t" + brand+ "\t" +price+ "\t" +quantity);
    }

    @Override
    public String toString() {
        return code + "\t" + name + "\t" + brand+ "\t" +price+ "\t" +quantity;
    }
    
}
