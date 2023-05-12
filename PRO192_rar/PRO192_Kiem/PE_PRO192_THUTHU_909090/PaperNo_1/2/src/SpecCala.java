public class SpecCala extends Cala {

    private int color;

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return getOwner() + "," + getPrice() + "," + color;
    }

    void setData() {
        super.setOwner(getOwner().substring(0, 2) + "XX" + getOwner().substring(3));
    }

    int getValue() {
        if (getColor() % 2 == 1) {
            return getPrice() + 7;
        } else {
            return getPrice() + 3;
        }
    }

}
