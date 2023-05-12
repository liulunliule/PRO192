/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
//SU dot 2
//SU dot 2
//SU dot 2
//SU dot 2
//SU dot 2
//SU dot 2
//SU dot 2
//SU dot 2
//SU dot 2
//SU dot 2
//SU dot 2
public class MyString implements IString {

    
    //Sum of Prime number 
    @Override
    public int f1(String str) {
        str = str.replaceAll("[^2357]", "");

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        return sum;
    }
//Replace most frequent word in string
    @Override
    public String f2(String str) {
        String[] arr = str.split(" ");
        int maxCount = 0;
        String elementHavingMaxFre = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                elementHavingMaxFre = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(elementHavingMaxFre)) {
                arr[i] = "T";
            }
        }
        String strAfter = "";
        for (int i = 0; i < arr.length; i++) {
            strAfter = strAfter + arr[i] + " ";
        }

        return strAfter;
    }

}
