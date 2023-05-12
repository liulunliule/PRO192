/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guitar;

/**
 *
 * @author 840G3
 */
public class Guitar {

    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;

    //Construc
    public Guitar() {

    }

    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    //getter
    public String getSerialNumber() {
        return serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getbuilder() {
        return builder;
    }

    public String getmodel() {
        return model;
    }

    public String getbackWood() {
        return backWood;
    }

    public String gettopWood() {
        return topWood;
    }

    //setter
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    public void createSound() {
        System.out.println("SerialNumber:" + serialNumber);
        System.out.println("Price:" + price);
        System.out.println("Builder:" + builder);
        System.out.println("Model:" + model);
        System.out.println("BackWood:" + backWood);
        System.out.println("TopWood:" + topWood);
    }
}
