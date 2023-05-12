package GUI;
import Controler.ProductList;
import DTO.Menu;
import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.add("Adding new Smartphone.");
        menu.add("Adding new TV.");
        menu.add("Adding new Air-conditioner.");
        menu.add("Print all product");
        menu.add("Print all Smartphones");
        menu.add("Print all TV");
        menu.add("Print all Air-conditioner");
        menu.add("Print information about products with the highest unit price for each product type.");
        menu.add("Update the product  information based on the code the user entered ");
        menu.add("Delete an product based on the code the user entered");
        menu.add("Print the total amount of all products ");
        menu.add("Quit.");
        int userChoice;
        
        ProductList pro =new ProductList();
        do {            
            System.out.println("\nPRODUCT MANAGER");
            userChoice=menu.getUserChoice();
            switch (userChoice) {
                case 1:
                    pro.createSmartphone();
                    break;
                case 2:
                    pro.createTV();
                    break;
                case 3:
                    pro.createAirconditioner();
                    break;
                case 4:
                    pro.printlist();
                    break;
                case 5:
                    pro.printSmartphone();
                    break;
                case 6:
                    pro.printTV();
                    break;
                case 7:
                    pro.printAir_conditioner();
                    break;
                case 8://highest
                    pro.printHighestPriceProducts();
                    break;
                case 9://update
                    pro.update();
                    break;
                case 10://delete
                    pro.remove();
                    break;
                case 11://total
                    pro.totalAmout();
                    break;
                default:
                    System.out.println("see ya");
            }
        } while (userChoice>0 && userChoice <11);
    }
}
