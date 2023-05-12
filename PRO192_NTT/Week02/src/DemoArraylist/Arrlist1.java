/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoArraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 840G3
 */
public class Arrlist1 {
    public static void main(String[] args) {
        //đa hình
       List list = new ArrayList();
        
        list.add("Lan");
        list.add("Hong");
        list.add("Diep");
        list.add("Hue");
        list.add(10);
        list.add("Cuc");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); 
        }
        
        System.out.println(" remove:");
        list.remove(0);
        list.remove("Diep");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); 
        }
        
    }
}
