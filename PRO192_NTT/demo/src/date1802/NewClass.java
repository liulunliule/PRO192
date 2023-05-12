/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date1802;

/**
 *
 * @author 840G3
 */
interface IMath {

    int calo(int firstNumber, int secondNumber);
}

public class NewClass {

    static void Excute(int a, int b, IMath m) {
        System.out.println(m.calo(a, b));
    }

    public static void main(String[] args) {
        Excute(5, 9, (x, y) -> x * y);
        Excute(2, 10, (x, y) -> {
            int s = 0;
            for (int i = x; i <= y; i++) {
                s += 1;
            }
            return s;
        });

    }
}
