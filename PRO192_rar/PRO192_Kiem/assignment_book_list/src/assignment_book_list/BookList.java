
package assignment_book_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class BookList extends ArrayList<Book> {
    public static Scanner sc = new Scanner(System.in);
    public Book search(String code){
        code = code.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getCode().equals(code)) return this.get(i);
            
        }
        return null;
        
    }
    
    private boolean isCodeDupplicated(String code){
        code = code.trim().toUpperCase();
        return search(code) != null;
    }
    
    public static String inputPattetn( String pattern){
        String data;
        do{
            data = sc.nextLine().trim();
        }while(!data.matches(pattern));
        return data;
    }
    
    public static String inputNonBlankStr(String msg){
        String data;
        do{
            System.out.println(msg);
            data = sc.nextLine().trim();
        }while(data.length() == 0);
        return data;
    }
    
    
    public void addNewBook(){
        String newCode, newTitle;
        float price;
        int quantity;
        boolean codeDuplicated = false;
        do{
            System.out.println("Add code book(Bxxx): ");
            newCode = inputPattetn("[sB][\\d]{3}");
            newCode = newCode.trim().toUpperCase();
            codeDuplicated = isCodeDupplicated(newCode);
            if(codeDuplicated) System.out.println("Code is duplicated");
        }while(codeDuplicated == true);
        newTitle = inputNonBlankStr("Name of new title: ");
        System.out.println("Price of book");
        price = Float.parseFloat(sc.nextLine());
        System.out.println("Quantity of book");
        quantity = Integer.parseInt(sc.nextLine());
        Book b = new Book(newCode, newTitle, price, quantity);
        this.add(b);
        System.out.println("Book "+ newCode + " has been added.");
    
    }
    
    public void searchBook(){
        if(this.isEmpty()){
            System.out.println("Empty list. No search can be performed!");
        }else{
            System.out.println("Book code you want to search: ");
            String sCode = sc.nextLine().trim();
            Book b = this.search(sCode);
            if(b == null){
                System.out.println("Not Found!");
            }else{
                System.out.println("Found: " + b);
            }
        }
    }
    
    
    
    public void  printDescendingByQuantity(ArrayList list) {
        if(this.isEmpty()) System.out.println("Empty list!");
        else{
            
        list.sort(Comparator.comparingInt(o -> ((Book)o).getQuantity()).reversed());
            System.out.println("Books list: ");
            for (Book book : this) {
                System.out.println(book.toString());
            }
//            for(Book b: this) System.out.println(b);
        }
    }
    
    
}
