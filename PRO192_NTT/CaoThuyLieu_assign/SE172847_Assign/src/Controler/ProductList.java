package Controler;

import DTO.TV;
import DTO.Product;
import DTO.SmartPhone;
import DTO.Air_conditioner;
import Util.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductList extends ArrayList<Product> {

    public void createSmartphone() {
        String code, name, brand;
        int price, quantity;
        String currrent;
        String CPU;
        int Ram, size;
        boolean check = true;
        System.out.println("Input the infor of Smartphone:");
        do {
            code = Utils.getStringreg("Enter code: ", "^P\\d{6}$",
                    "Code cannot null", "The Product Code must be <P000000> (0 is a digit) format!");
            check = this.contains(new Product(code));
            if (check) {
                System.out.println("Duplicated code!");
            }
        } while (check);
        name = Utils.getString("Input the Smartphone's name: ");
        brand = Utils.getString("Input the Smartphone's brand: ");
        price = Utils.getInt("Input Smartphone's price: ");
        quantity = Utils.getInt("Input Smartphone's quantity: ");
        CPU = Utils.getString("Input the Smartphone's CPU: ");
        Ram = Utils.getInt("Input Smartphone's Ram(GB): ");
        size = Utils.getInt("Input Smartphone's size: ");
        currrent = Utils.getCurrrentDate();
        Product Pro = new SmartPhone(Ram, CPU, size, code, name, brand, price, quantity, currrent);
        this.add(Pro);
    }

    public void createTV() {
        String code, name, brand;
        int price, quantity;
        String currrent;
        int size;
        boolean check = true;
        System.out.println("Input the infor of TV:");
        do {
            code = Utils.getStringreg("Enter code: ", "^P\\d{6}$",
                    "Code cannot null", "The Product Code must be <P000000> (0 is a digit) format!");
            check = this.contains(new Product(code));
            if (check) {
                System.out.println("Duplicated code!");
            }
        } while (check);
        name = Utils.getString("Input the TV's name: ");
        brand = Utils.getString("Input the TV's brand: ");
        price = Utils.getInt("Input TV's price: ");
        quantity = Utils.getInt("Input TV's quantity: ");
        size = Utils.getInt("Input TV's size: ");
        currrent = Utils.getCurrrentDate();
        Product Pro = new TV(size, code, name, brand, price, quantity, currrent);
        this.add(Pro);
    }

    public void createAirconditioner() {
        String code, name, brand;
        int price, quantity;
        int power;
        String currrent;
        boolean check = true;
        System.out.println("Input the infor of Air-conditioner:");
        do {
            code = Utils.getStringreg("Enter code: ", "^P\\d{6}$",
                    "Code cannot null", "The Product Code must be <P000000> (0 is a digit) format!");
            check = this.contains(new Product(code));
            if (check) {
                System.out.println("Duplicated code!");
            }
        } while (check);
        name = Utils.getString("Input the Air-conditioner's name: ");
        brand = Utils.getString("Input the Air-conditioner's brand: ");
        price = Utils.getInt("Input Air-conditioner's price: ");
        quantity = Utils.getInt("Input Air-conditioner's quantity: ");
        power = Utils.getInt("Input Air-conditioner's power: ");
        currrent = Utils.getCurrrentDate();
        Product Pro = new Air_conditioner(power, code, name, brand, price, quantity, currrent);
        this.add(Pro);
    }

    public void printlist() {
        if (this.isEmpty()) {
            System.out.println("Empty list!");
            return;
        }
        System.out.println("\nPRODUCT LIST");
        System.out.println("-----------------------");
        for (Product x : this) {
            x.print();
        }
    }

    public void printSmartphone() {
        List<SmartPhone> smartphones = new ArrayList<>();
        for (Product product : this) {
            if (product instanceof SmartPhone) {
                smartphones.add((SmartPhone) product);
            }
        }
        if (smartphones.isEmpty()) {
            System.out.println("No smartphones found!!!");
            return;
        }
        Collections.sort(smartphones);
        System.out.println("List of smartphones in descending order of price:");
        for (SmartPhone smartphone : smartphones) {
            smartphone.print();
        }
    }

    public void printTV() {
        List<TV> TVs = new ArrayList<>();
        for (Product product : this) {
            if (product instanceof TV) {
                TVs.add((TV) product);
            }
        }
        if (TVs.isEmpty()) {
            System.out.println("No smartphones found!!!");
            return;
        }
        Collections.sort(TVs);
        System.out.println("List of smartphones in descending order of price:");
        for (TV tv : TVs) {
            tv.print();
        }
    }

    public void printAir_conditioner() {
        List<Air_conditioner> airs = new ArrayList<>();
        for (Product product : this) {
            if (product instanceof Air_conditioner) {
                airs.add((Air_conditioner) product);
            }
        }
        if (airs.isEmpty()) {
            System.out.println("No smartphones found!!!");
            return;
        }
        Collections.sort(airs);
        System.out.println("List of smartphones in descending order of price:");
        for (Air_conditioner air : airs) {
            air.print();
        }
    }

    private int find(String code) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equals(code.toUpperCase())) {
                return i;
            }
        }
        return -1;
    }

    public void update() {
        String code = Utils.getStringreg("Enter code: ", "^P\\d{6}$",
                "Code cannot null", "The Product Code must be <P000000> (0 is a digit) format!");
        int index = this.indexOf(new Product(code));
        if (index < 0 || index >= this.size()) {
            System.out.println("Product's code does not exist: ");
        } else {
            for (Product proUpdate : this) {
                if (proUpdate.getCode().equals(code)) {
                    if (proUpdate instanceof SmartPhone) {
                        proUpdate.setName(Utils.getString("Enter new Phone name: ", "Phone Name is not null"));
                        proUpdate.setBrand(Utils.getString("Enter new Phone brand: ", "Phone Brand is not null"));
                        proUpdate.setPrice(Utils.getInt("Enter new Phone price: "));
                        proUpdate.setQuantity(Utils.getInt("Enter new Phone quantity: "));
                        ((SmartPhone) proUpdate).setRam(Utils.getInt("Enter new Phone RAM: "));
                        ((SmartPhone) proUpdate).setCPU(Utils.getString("Enter new Phone CPU: ", "CPU is not null"));
                        ((SmartPhone) proUpdate).setSize(Utils.getInt("Enter new Phone size: "));
                    }
                    if (proUpdate instanceof TV) {
                        proUpdate.setName(Utils.getString("Enter new TV name: ", "TV Name is not null"));
                        proUpdate.setBrand(Utils.getString("Enter new TV brand: ", "TV Brand is not null"));
                        proUpdate.setPrice(Utils.getInt("Enter new TV price: "));
                        ((TV) proUpdate).setSize(Utils.getInt("Enter new TV size: "));
                    }
                    if (proUpdate instanceof Air_conditioner) {
                        proUpdate.setName(Utils.getString("Enter new Air_conditioner name: ", "Air_conditioner Name is not null"));
                        proUpdate.setBrand(Utils.getString("Enter new Air_conditioner brand: ", "Air_conditioner Brand is not null"));
                        proUpdate.setPrice(Utils.getInt("Enter new Air_conditioner price: "));
                        ((Air_conditioner) proUpdate).setPower(Utils.getInt("Enter new Air_conditioner Power: "));
                    }
                }
            }

        }
    }

    public void remove() {
        String code;
        code = Utils.getStringreg("Enter code: ", "^P\\d{6}$",
                "Code cannot null", "The Product Code must be <P000000> (0 is a digit) format!");
        int pos = find(code);
        if (pos < 0) {
            System.out.println("This code does not exist.");
        } else {
            this.remove(this.get(pos));
            System.out.println("The Product " + code + " has been removed.");
        }
    }

    private String getProductType(Product product) {
        if (product instanceof SmartPhone) {
            return "Smartphone";
        } else if (product instanceof TV) {
            return "Tivi";
        } else if (product instanceof Air_conditioner) {
            return "Air-conditioner";
        } else {
            return "Unkown";
        }
    }

    public void printHighestPriceProducts() {
        Map<String, Product> highestPriceProducts = new HashMap<>();
        for (Product product : this) {
            String productType = getProductType(product);
            if (!highestPriceProducts.containsKey(productType)
                    || product.getPrice() > highestPriceProducts.get(productType).getPrice()) {
                highestPriceProducts.put(productType, product);
            }
        }
        System.out.println("Products with highest unit price for each product type:");
        for (Map.Entry<String, Product> entry : highestPriceProducts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void totalAmout() {
        int total = 0;
        for (Product p : this) {
            total += p.getPrice() + p.getQuantity();
        }
    }

}
