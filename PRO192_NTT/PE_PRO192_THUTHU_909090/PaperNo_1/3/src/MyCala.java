
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 840G3
 */
public class MyCala implements ICala{

    @Override
    public int f1(List<Cala> list) {
        int count =0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getOwner()>=2){
                if(list.get(i).getOwner().charAt(1))
            }
            
        }
    }

    @Override
    public void f2(List<Cala> list) {
        
    }

    @Override
    public void f3(List<Cala> list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
