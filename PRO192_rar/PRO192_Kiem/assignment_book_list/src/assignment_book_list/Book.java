
package assignment_book_list;

public class Book {
    private String code;
    private String title;
    private float UnitPrice;
    private int quantity;

    public Book() {
    }
    
    

    public Book(String code, String title, float UnitPrice, int quantity) {
        this.code = code;
        this.title = title;
        this.UnitPrice = UnitPrice;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" + "code=" + code + ", title=" + title + ", UnitPrice=" + UnitPrice + ", quantity=" + quantity + '}';
    }
    
    
}
