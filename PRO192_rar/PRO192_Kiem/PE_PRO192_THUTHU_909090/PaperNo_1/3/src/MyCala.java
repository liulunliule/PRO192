
import java.util.*;
import java.util.List;


public class MyCala implements ICala {

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getOwner().length() >= 2) {
                if (t.get(i).getOwner().charAt(1) >= 65 && (t.get(i).getOwner().charAt(1) <= 90)) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        int min = t.get(0).getPrice();
        int bp = 0;

        for (int i = 0; i < t.size(); i++) {
            if (min > t.get(i).getPrice()) {
                min = t.get(i).getPrice();
                bp = i;
            }

        }
        for (int i = bp + 1; i < t.size(); i++) {
            if (t.get(bp).getPrice() == t.get(i).getPrice()) {
                t.remove(i);
            }

        }

    }

    @Override
    public void f3(List<Cala> t) {

        for (int i = 0; i < t.size(); i++) {
            for (int j = i + 1; j < t.size(); j++) {
                if (t.get(i).getOwner().charAt(1) < t.get(j).getOwner().charAt(1)) {

                    Collections.swap(t, i, j);

                }
            }

        }

    }
}
