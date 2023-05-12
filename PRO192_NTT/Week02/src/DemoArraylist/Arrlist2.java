/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoArraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 840G3
 */
public class Arrlist2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        
        list.add("Lan");
        list.add("Hong");
        list.add("Diep");
        list.add("Hue");
        list.add("Cuc");
        
        System.out.println(list);
        
        System.out.println("------------------");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            Object element =itr.next();
            
        }
        
    }
}
