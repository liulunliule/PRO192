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
interface Square {

    int caculate(int x);

    default void print(int x) {
        System.out.println(x * x);
    }
}

public class Demo04 {

    public static void main(String[] args) {
        System.out.println("");
        int n = 5;
        Square s = ((number) -> number * number);
        Square s1 = (x) -> {
            return x + x;
        };
        int ans = s.caculate(n);
        System.out.println(ans);
        ans = s1.caculate(n);
        System.out.println(ans);
    }

}
