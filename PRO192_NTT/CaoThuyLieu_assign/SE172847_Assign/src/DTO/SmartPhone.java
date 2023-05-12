package DTO;

public class SmartPhone extends Product implements Comparable<SmartPhone>{

    private int Ram;
    private String CPU;
    private int size;

    public SmartPhone(int Ram, String CPU, int size, String code, String name, 
            String brand, int price, int quantity, String currrent) {
        super(code, name, brand, price, quantity, currrent);
        this.Ram = Ram;
        this.CPU = CPU;
        this.size = size;
    }

    public SmartPhone(int Ram, String CPU, int size, String code) {
        super(code);
        this.Ram = Ram;
        this.CPU = CPU;
        this.size = size;
    }

    public SmartPhone(int Ram, String CPU, int size) {
        this.Ram = Ram;
        this.CPU = CPU;
        this.size = size;
    }

    public SmartPhone() {
    }
    
    public int getRam() {
        return Ram;
    }

    public void setRam(int Ram) {
        this.Ram = Ram;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void print() {
        System.out.println(super.getCode() + "\t" + super.getName() + "\t" + super.getBrand() + 
                "\tRam" + Ram + "GB\tCPU: " + CPU + "\tsize: " + size + "\tPrice: " + super.getPrice() + 
                "\tQuantity: " + super.getQuantity()+ "\tDATE: " + super.getCurrrent());
    }

    @Override
    public String toString() {
        return super.getCode() + "\t" + super.getName() + "\t" + super.getBrand() + 
                "\tRam" + Ram + "GB\tCPU: " + CPU + "\tsize: " + size + "\tPrice: " + super.getPrice() + 
                "\tQuantity: " + super.getQuantity()+ "\tDATE: " + super.getCurrrent();
    }
    
    @Override
    public int compareTo(SmartPhone o) {
        return (o.getPrice()-this.getPrice());
    }
}
