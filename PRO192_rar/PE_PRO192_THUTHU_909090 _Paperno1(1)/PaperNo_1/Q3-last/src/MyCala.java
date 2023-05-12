
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class MyCala implements ICala {

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getOwner().length() >= 2) {
                if (t.get(i).getOwner().charAt(1) > 'A' && (t.get(i).getOwner().charAt(1) < 'z')) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        int max = t.get(0).getPrice();
        int supportV = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getPrice() < max) {
                max = t.get(i).getPrice();
                supportV = i;
            }
        }
        for (int i = supportV + 1; i < t.size(); i++) {
            if (t.get(supportV).getPrice() == t.get(i).getPrice()) {
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
