/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antiqueshop;

/**
 *
 * @author ADMIN
 */
public class AntiqueShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item i = new Item(4,"Toan");
        Vase v = new Vase(5,"Clay",10000,"Autumn");
        Statue s = new Statue(5,"Yellow",100000,"Toan");
        Painting p = new Painting(6,7,true,true,300000,"Toan");
        System.out.println("Item info");
        System.out.println(i);
        System.out.println("Item Vase:");
        System.out.println(v);
        System.out.println("Item Statue:");
        System.out.println(s);
        System.out.println("Item Painting:");
        System.out.println(p);
        
        
        Item x = v;
        ((Vase)x).camhoa();
        if(x instanceof Vase) System.out.println("x la vase");
        else if(x instanceof Statue) System.out.println("x la statue");
        else if(x instanceof Painting) System.out.println("x la ");
        
    }
    
}
