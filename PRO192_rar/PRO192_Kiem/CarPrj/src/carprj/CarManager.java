/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carprj;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarManager {

    private static String brandDataFilePath = "Brands.txt";
    private static String carDataFilePath = "Cars.txt";

    private BrandList brandList;
    private CarList carList;

    public CarManager() {
        init();
    }

    private void init() {
        try {
            this.brandList = BrandList.getInstance();
            this.brandList.setDatabaseService(new FileDataService(CarManager.brandDataFilePath));
            this.brandList.loadData();

            this.carList = CarList.getInstance();
            this.carList.setDatabaseService(new FileDataService(CarManager.carDataFilePath));
            this.carList.loadData();
        } catch (CException ex) {
            Logger.getLogger(CarManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void listAllBrand() {
        try {
            brandList.printAllBrands();
        } catch (Exception e) {
            System.out.println("An error occurred while printing brands: " + e.getMessage());
        }
    }

    private void addNewBrand() {
        try {
            Brand brand = this.brandList.addNew();
            if (brand == null) {
                throw new CException("Failed to add new brand");
            }
            this.brandList.insertData(brand);
            System.out.println("brand added");
        } catch (CException ex) {
            System.out.println("Error adding new brand: " + ex.getMessage());
//            Logger.getLogger(CarManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void filterBrandById() {
        String brandId = Util.inputString("Input brand id", false);
        Brand brand = this.brandList.getBrandById(brandId);
        if (brand == null) {
            System.out.println("Khong tim thay");
        } else {
            System.out.println(brand.output());
        }
    }

    private void updateBrand() {
        String brandId = Util.inputString("Input brand id", false);
        try {
            boolean result = this.brandList.updateBrandById(brandId);
            if (result) {
                this.brandList.saveData();
                System.out.println("Brand updated successfullly!");
            } else {
                System.out.println("Brand updated failed");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while updating the brand: " + e.getMessage());
        }
    }

    private void saveBrandToFile() {
        try {
            if (this.brandList.saveData()) {
                System.out.println("brand data saved to file successfully.");
            } else {
                System.out.println("Failed to save brand data to file.");
            }
        } catch (Exception e) {
            System.out.println("Error saving brand list to file: " + e.getMessage());
        }
    }

    private void showAllCarAscendingByBrandName() {
        try {
            this.carList.printAllCarAscendingByBrandName();
        } catch (Exception e) {
            System.out.println("An error occurred while printing cars: " + e.getMessage());
        }
    }

    private void filterCarByBrandName() {
        String brandName = Util.inputString("Input car brand name", false);
        List<Car> resultList = this.carList.filterByBrandName(brandName);
        if (resultList == null || resultList.isEmpty()) {
            System.out.println("Khong tim thay");
        } else {
            for (Car car : resultList) {
                System.out.println(car.output());
            }
        }
    }

    private void addNewCar() {
        try {
            Car car = this.carList.addNew();
            if (car == null) {
                throw new CException("Failed to add new car");
            }
            this.carList.insertData(car);
            System.out.println("car added");
        } catch (CException ex) {
            System.out.println("Error adding new car: " + ex.getMessage());
//            Logger.getLogger(CarManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteCar() {
        String id = Util.inputString("Enter the id of the car you want to delete: ", false);
        try {
            boolean result = this.carList.deleteData(id);
            if (result) {
                this.carList.saveData();
                System.out.println("car with id " + id + " is deleted successfully.");
            } else {
                System.out.println("car with id " + id + " is not found.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while deleting the car: " + e.getMessage());
        }
    }

    private void updateCar() {
        String carId = Util.inputString("Input car id", false);
        try {
            boolean result = this.carList.updateCarById(carId);
            if (result) {
                this.carList.saveData();
                System.out.println("car updated successfullly!");
            } else {
                System.out.println("car updated failed");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while updating the car: " + e.getMessage());
        }
    }

    private void saveCarToFile() {
        try {
            if (this.carList.saveData()) {
                System.out.println("car data saved to file successfully.");
            } else {
                System.out.println("Failed to save car data to file.");
            }
        } catch (Exception e) {
            System.out.println("Error saving car list to file: " + e.getMessage());
        }
    }

    private void process() {
        Menu menu = new Menu();
        MenuItem userChoice;
        do {
            userChoice = menu.getUserChoice();
            switch (userChoice) {
                case BRAND_LIST_ALL:
                    listAllBrand();
                    break;
                case BRAND_ADD:
                    addNewBrand();
                    break;
                case BRAND_FILTER_BY_ID:
                    filterBrandById();
                    break;
                case BRAND_UPDATE:
                    updateBrand();
                    break;

                case BRAND_SAVE_TO_FILE:
                    saveBrandToFile();
                    break;
                case CAR_SHOW_ALL_ASCENDING_BY_BRAND_NAME:
                    showAllCarAscendingByBrandName();
                    break;
                case CAR_FILTER_BY_BRAND_NAME:
                    filterCarByBrandName();
                    break;
                case CAR_ADD:
                    addNewCar();
                    break;
                case CAR_DELETE:
                    deleteCar();
                    break;
                case CAR_UPDATE:
                    updateCar();
                    break;
                case CAR_SAVE_TO_FILE:
                    saveCarToFile();
                    break;

                case EXIT:
                    System.out.println("Exited!");
                    break;

                default:
                    System.out.println("???");
            }
        } while (userChoice != MenuItem.EXIT);
    }

    public static void main(String[] args) {
        new CarManager().process();
    }

}
