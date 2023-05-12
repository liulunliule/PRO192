
package assignment_book_list;

import java.util.ArrayList;

public class Data extends ArrayList<Book>{
   public void data(ArrayList list){
       Book b0 = new Book("B000", "Dac nhan tam", 200, 5);
       list.add(b0);
       Book b1 = new Book("B001", "ABC", 400, 3);
       list.add(b1);
       Book b2 = new Book("B003", "Thoi gian la vang", 100, 6);
       list.add(b2);
       Book b3 = new Book("B004", "mot ngay thieu em", 150, 5);
       list.add(b3);
       Book b4 = new Book("B005", "toi yeu em", 200, 4);
       list.add(b4);
      
       
       
       
   }
}
