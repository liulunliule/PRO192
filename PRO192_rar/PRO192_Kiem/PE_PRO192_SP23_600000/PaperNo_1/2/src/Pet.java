
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 840G3
 */
public class Pet implements ITax{
    private String name;
    private String birthday;
    private ArrayList<Service> usedServices;

    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public void addService (String nameService,int price){
        
    }

    @Override
    public String toString() {
        return  name + "-" + getTotalMoney() + "-" + getTax() ;
    }

    @Override
    public double getTax() {
        return VAT*getTotalMoney();
    }

    @Override
    public double getTotalMoney() {
//        if (birthday != "4"){
            return getTotalMoney()+getTotalMoney()*0.05;
//        } return getTotalMoney();
    }

    
    
}
