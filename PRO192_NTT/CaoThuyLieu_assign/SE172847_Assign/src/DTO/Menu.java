package DTO;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends ArrayList<String> {

    public Menu() {
        super();
    }
    
    
    public void addItem(String str) {
        this.add(str);
    }
    
    public int getUserChoice(){
        Scanner sc = new Scanner(System.in);
        int choice=-1;
        for (int i = 0; i < this.size(); i++) {
            System.out.println((i+1)+"-"+this.get(i));
        }
        System.out.println("__________________________");
        do {            
            System.out.println("Select 1..12: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                if(choice<1||choice>11)
                    System.out.println("**Number from 1 to 12");
            } catch (Exception e) {
            }
        } while (choice<1 ||choice>11);
        return choice;
    }
}
