
package wshop2;
import java.util.Scanner;

public class Wshop2P2_2 {
    public String inputString() throws Exception
    {
        String pattern="SE(.*)";
        String s="";
        Scanner sc=new Scanner(System.in);
        System.out.println("input the string:");
        s=sc.nextLine();
        if(!s.matches(pattern))
            throw new Exception();
        return s;
    }
public static void main(String[] args){    
    Wshop2P2_2 obj=new Wshop2P2_2();
    boolean cont=false;
    do{
        try {
            String s=obj.inputString();
            System.out.println("The string is " + s);
            cont=false;
        } catch (Exception e) {
            System.out.println("The string is invalid");
            cont=true;
        }
    }while(cont);
}
}
