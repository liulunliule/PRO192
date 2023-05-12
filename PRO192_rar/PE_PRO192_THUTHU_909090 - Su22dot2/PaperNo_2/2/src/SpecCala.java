//PE_SU22_DOT2
//PE_SU22_DOT2
//PE_SU22_DOT2
//PE_SU22_DOT2
//PE_SU22_DOT2
//PE_SU22_DOT2
//PE_SU22_DOT2
//PE_SU22_DOT2
//PE_SU22_DOT2

public class SpecCala extends Cala {

    private int color;

    public SpecCala() {
    }

    public SpecCala(int color) {
        this.color = color;
    }

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    public void setData() {
        super.setOwner(getOwner().substring(0, 2) + "HOA" + getOwner().substring(4));
    }

    public int getValue() {
        if (super.getPrice()< 6) {
            return this.color + 5;
        } else {
            return this.color + 7;
        }

    }

    @Override
    public String toString() {
        return super.getOwner() + "," + super.getPrice() + "," + this.color;
    }

}
