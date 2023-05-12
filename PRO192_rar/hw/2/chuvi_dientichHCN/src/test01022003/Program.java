/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01022003;

/**
 *
 * @author 840G3
 */
public class Program {

    public static void main(String[] args) {
        
        try {
            Myclass noName = new Myclass();
            noName.Print();

            Myclass anNV = new Myclass("SE001", "NGuyên Van An");
            anNV.Print();
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        System.out.println("");
    }
}
