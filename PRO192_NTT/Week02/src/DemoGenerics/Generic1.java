/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoGenerics;

import java.util.Vector;

/**
 *
 * @author 840G3
 */
class Person {

    String name;
    int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    void print() {
        System.out.println(name + ", " + age);
    }

}

public class Generic1 {
    public static void main(String[] args) {
        Vector<Person> v = new Vector();
        v.add(new Person("Hoa", 23));
        v.add(new Person("Tuấn", 27));
        for (int i =  v.size()-1; i >= 0; i--) {
            (v.get(i)).print();
        }
    }
}
