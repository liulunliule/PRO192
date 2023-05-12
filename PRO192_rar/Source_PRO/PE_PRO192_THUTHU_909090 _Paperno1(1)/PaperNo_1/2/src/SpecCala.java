//PAPER NO2_Q2_PRACTICAL EXAM
//PAPER NO2_Q2_PRACTICAL EXAM
//PAPER NO2_Q2_PRACTICAL EXAM
//PAPER NO2_Q2_PRACTICAL EXAM
//PAPER NO2_Q2_PRACTICAL EXAM

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
        super.setOwner(getOwner().substring(0, 2) + "XX" + getOwner().substring(3));
    }

    public int getValue() {
        if (this.color % 2 == 1) {
            return super.getPrice() + 7;
        } else {
            return super.getPrice() + 3;
        }

    }

    @Override
    public String toString() {
        return super.getOwner() + "," + super.getPrice() + "," + this.color;
    }

}
