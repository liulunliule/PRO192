/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoSet;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author 840G3
 */
//ko trung ko qtam thu tu dau vao, xap xep be toi lon
public class DemoTreeSet {

    public static void main(String[] args) {
        Random r = new Random();
        TreeSet myset = new TreeSet();
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(100);
            myset.add(number);
        }
//using Iterator
        Iterator iter = myset.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
