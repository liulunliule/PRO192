package DTO;

public class Air_conditioner extends Product implements Comparable<Air_conditioner>{

    private int power;

    public Air_conditioner(int power, String code, String name, String brand, 
            int price, int quantity, String currrent) {
        super(code, name, brand, price, quantity, currrent);
        this.power = power;
    }

    public Air_conditioner(int power, String code) {
        super(code);
        this.power = power;
    }

    public Air_conditioner(int power) {
        this.power = power;
    }

    public Air_conditioner() {
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void print() {
        System.out.println(super.getCode() + "\t" + super.getName() + "\t" + super.getBrand() + 
                "\tpower: "+ power + "\tPrice: " + super.getPrice() + 
                "\tQuantity: " + super.getQuantity() + "\tDATE: " + super.getCurrrent());
    }

    @Override
    public String toString() {
        return super.getCode() + "\t" + super.getName() + "\t" + super.getBrand() + 
                "\tpower: "+ power + "\tPrice: " + super.getPrice() + 
                "\tQuantity: " + super.getQuantity() + "\tDATE: " + super.getCurrrent();
    }
    

    @Override
    public int compareTo(Air_conditioner o) {
        return (o.getPrice()-this.getPrice());
    }
    
}
