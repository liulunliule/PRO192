
package assignment_book_list;

import java.util.Scanner;


public class Assignment_book_list {

 
    public static void main(String[] args) {
        
        int choice = 0;
        BookList list = new BookList();
        Data d = new Data();
        d.data(list);
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Book list manager");
            System.out.println("1. Print book");
            System.out.println("2. Add book");
            System.out.println("3. Find book");
            System.out.println("4. Quit");
            System.out.println("---------------------");
            System.out.println("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    list.printDescendingByQuantity(list);
                    break;
                case 2:
                    list.addNewBook();
                    break;
                case 3:
                    list.searchBook();
                    break;
                default:
                    System.out.println("Bye");
                    break;
            }
        }while(choice > 0 && choice < 4);
        
    }
    
}
