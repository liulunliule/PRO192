package wshop2;

import java.util.Scanner;

public class Wshop2P1 {

    public static void main(String[] args) {
        // TODO code application logic here
        boolean cont=false;
        do{
            try{
                int num;
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Enter the number: ");
                 num = Integer.parseInt(sc.nextLine());
                 if( num<1)
                     throw new Exception();
                 System.out.println("The number is: " + num);
                 cont=false;
            }catch(Exception e) {
                System.out.println("The number is invalid");
                cont=true;
            }
        }while(cont);
    }
    
}
