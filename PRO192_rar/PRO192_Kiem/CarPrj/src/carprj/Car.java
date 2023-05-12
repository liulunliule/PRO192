/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carprj;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Car implements Comparable<Car> {

    public static final String FRAME_ID_FORMAT = "Fxxxxx";
    private static final String FRAME_ID_PATTERN = "F\\d{5}";
    public static final String ENGINE_ID_FORMAT = "Exxxxx";
    private static final String ENGINE_ID_PATTERN = "E\\d{5}";
    private static int ENTITY_ATTRIBUTE_COUNT = 5;

    private String carId;
    private Brand brand;
    private String color;
    private String frameId;
    private String engineId;

    public Car() {
    }

    public Car(String carId, Brand brand, String color, String frameId, String engineId) {
        this.carId = carId;
        this.brand = brand;
        this.color = color;
        this.frameId = frameId;
        this.engineId = engineId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String id) throws CException {
        if (id == null || id.isEmpty()) {
            throw new CException("Error: id is invalid.");
        }
        this.carId = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) throws CException {
        if (brand != null) {
            this.brand = brand;
        } else {
            throw new CException("brand is null(maybe not added yet)");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws CException {
        if (color == null || color.isEmpty()) {
            throw new CException("Error: color is null or blank...");
        }
        this.color = color;
    }

    public String getFrameId() {
        return frameId;
    }

    public void setFrameId(String frameId) throws CException {
        if (!Util.validateStringPattern(frameId, Car.FRAME_ID_PATTERN, true)) {
            throw new CException("Error: frame id is invalid pattern");
        }
        this.frameId = frameId;
    }

    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) throws CException {
        if (!Util.validateStringPattern(engineId, Car.ENGINE_ID_PATTERN, true)) {
            throw new CException("Error: engine id is invalid pattern");
        }
        this.engineId = engineId;
    }

    public void inputId() {
        while (true) {
            try {
                setCarId(Util.inputString("Input car id", false));
                break;
            } catch (CException ex) {
//                Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void inputBrand() {
        while (true) {
            try {
                BrandList brandList = BrandList.getInstance();
                brandList.printAllBrands();
                setBrand(brandList.getBrandById(Util.inputString("Input brand", false)));
                break;
            } catch (CException ex) {
//                Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
                if (this.brand == null) {
                    if (Util.isStop("Wanna stop to add brand?", false) == true) {
                        break;
                    }
                }
            }
        }
    }

    public void input() {
        while (true) {
            try {
                setColor(Util.inputString("Input color", false));
                break;
            } catch (CException ex) {
//              Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while (true) {
            try {
                setFrameId(Util.inputString("Input frame id with pattern (" + Car.FRAME_ID_FORMAT + ")", false));
                break;
            } catch (CException ex) {
//                Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while (true) {
            try {
                setEngineId(Util.inputString("Input engine id with pattern (" + Car.ENGINE_ID_FORMAT + ")", false));
                break;
            } catch (CException ex) {
//                Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String output() {
        StringBuilder sb = new StringBuilder();
        sb.append(brand.output());
        sb.append("\n").append(carId);
        sb.append(",").append(color);
        sb.append(",").append(frameId);
        sb.append(",").append(engineId);
        return sb.toString();
    }

    public void parseString(String entityString) throws CException {
        String[] attributes = entityString.split(",", -1);
        if (attributes.length != Car.ENTITY_ATTRIBUTE_COUNT) {
            throw new CException("Error: the number of attributes in the string is incorrect.");
        }
        try {
            setCarId(attributes[0].trim());
            setBrand(BrandList.getInstance().getBrandById(attributes[1].trim()));
            setColor(attributes[2].trim());
            setFrameId(attributes[3].trim());
            setEngineId(attributes[4].trim());
        } catch (CException ex) {
            throw new CException("Error: an attribute in the string is invalid. " + ex.getMessage());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(carId);
        sb.append(",").append(brand.getBrandId());
        sb.append(",").append(color);
        sb.append(",").append(frameId);
        sb.append(",").append(engineId);
        return sb.toString();
    }

    @Override
    public int compareTo(Car o) {
        return 0;

    }
}
