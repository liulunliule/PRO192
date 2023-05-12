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
public class Myclass {
    public String id;
    public String fullName;

    public Myclass(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Myclass() {
        id="000";
        fullName = "NoName";
    }
     
    
    public void Print(){
        
        System.out.println( "Stu in4: ");
        System.out.printf(" id : %s, full name: %s\n" , id, fullName.toUpperCase());
    }
    
}
