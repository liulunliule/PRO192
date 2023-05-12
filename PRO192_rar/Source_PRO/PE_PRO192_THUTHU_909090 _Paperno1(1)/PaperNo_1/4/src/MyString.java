/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
//PAPERNO1_PRO192_PRACTICAL EXAM
public class MyString implements IString {

    @Override
    public int f1(String str) {
        int count = 0;
        String[] arr = str.split(" ");
        for (String x : arr) {
            for (int i = 0; i < x.length(); i++) {
                if (x.length() >= 1) {
                    if(x.charAt(i) >= '1' && x.charAt(i) <= '9')
                        if(x.charAt(i) % 2 != 0) 
                            count ++;
                }
            }
            
        }
                
        return count;   
    }

    @Override
    public String f2(String str) {
       
            
        boolean check = false;
        String[] arrList = null;
        arrList = str.split(" ");
        String c = "";
        for(int i = 0; i < arrList.length; i++){
            for(int j = 0; j < (arrList[i].length()) / 2; j++){
                if(arrList[i].charAt(j) != arrList[i].charAt(arrList[i].length() - j - 1)){                   
                    break;
                } else if (check == false){
                    arrList[i] = "YY";
                    check = true;
                }
            }               
        }           
        for (int i = 0; i < arrList.length; i++) {
            c = c + arrList[i] + " " ;
        }
        return c;

    
  
    }
       
    
}
