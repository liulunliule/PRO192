/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carprj;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class CarList extends DataManagement<Car> {

    private static CarList instance = new CarList();

    public static CarList getInstance() {
        return instance;
    }

    private CarList() {
    }

    public Car addNew() throws CException {
        Car car = new Car();
        car.inputId();
        car.inputBrand();
        Brand brand = car.getBrand();
        if (brand != null) {
            car.input();
            String carId = car.getCarId();
            String frameId = car.getFrameId();
            String engineId = car.getEngineId();
            String errorAnnounce ="";
            for (Car carEntity : this.entityList) {
                if (carEntity.getCarId().equals(carId)) {
                    errorAnnounce += "Car with id: " + carId + " already exists.";
                }
                if (carEntity.getFrameId().equals(frameId)) {
                    errorAnnounce += "Frame with id: " + frameId + " already exists.";
                }
                if (carEntity.getEngineId().equals(engineId)) {
                    errorAnnounce += "Engine with id: " + engineId + " already exists.";
                }
            }
            if (!errorAnnounce.trim().isEmpty()) {
                throw new CException(errorAnnounce);
            }
            try {
                entityList.add(car);
            } catch (Exception e) {
                throw new CException("Error adding car to the list. Details: " + e.getMessage());
            }
        } else {
            return null;
        }
        return car;
    }

    public boolean updateCarById(String carId) throws CException {
        if (carId != null && !carId.isEmpty()) {
            Car updateCar = getCarById(carId);
            if (updateCar != null) {
                updateCar.inputBrand();
                Brand brand = updateCar.getBrand();
                if (brand != null) {
                    updateCar.input();
                    String frameId = updateCar.getFrameId();
                    String engineId = updateCar.getEngineId();
                    String errorAnnounce = "";
                    for (Car carEntity : this.entityList) {
                        if (carEntity.getCarId().equals(carId)) {
                            errorAnnounce += "Car with id: " + carId + " already exists.";
                        }
                        if (carEntity.getFrameId().equals(frameId)) {
                            errorAnnounce += "Frame with id: " + frameId + " already exists.";
                        }
                        if (carEntity.getEngineId().equals(engineId)) {
                            errorAnnounce += "Engine with id: " + engineId + " already exists.";
                        }
                    }
                    if (!errorAnnounce.trim().isEmpty()) {
                        throw new CException(errorAnnounce);
                    }
                } else {
                    throw new CException("car did not existed");
                }
            } else {
                throw new CException("input carId is null or blank");
            }
        }
        return false;
    }

    public Car getCarById(String id) {
        if (id != null && !id.isEmpty()) {
            for (Car car : entityList) {
                if (id.equalsIgnoreCase(car.getCarId())) {
                    return car;
                }
            }
        }
        return null;
    }

    public void printAllCarAscendingByBrandName() {
        System.out.println("Printing car ascending by brand name: ");
        List<Car> sortedList = this.entityList;
        sortedList.sort(Comparator.comparing(c -> c.getBrand().getBrandName()));
        for (Car car : sortedList) {
            System.out.println(car.output());
        }
    }

    public List<Car> filterByBrandName(String brandName) {
        List<Car> filteredCars = this.entityList.stream()
                .filter(c -> c.getBrand().getBrandName().contains(brandName))
                .collect(Collectors.toList());
        return filteredCars;
    }

    @Override
    public boolean deleteData(String id) {
        Car car = getCarById(id);
        if (car == null) {
            return false;
        }
        return entityList.remove(car);
    }

    @Override
    public boolean saveData() {
        List<String> carList = new ArrayList<>();
        for (Car car : entityList) {
            carList.add(car.toString());
        }
        return super.getDatabaseService().saveData(carList);
    }

    @Override
    public boolean insertData(Car car) {
        return super.getDatabaseService().insert(car.toString());
    }

    @Override
    protected Car parseString(String stringEntity) {
        try {
            Car obj = new Car();
            obj.parseString(stringEntity);
            return obj;
        } catch (CException ex) {
            Logger.getLogger(CarList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
