/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carprj;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Brand implements Comparable<Brand> {

    private static int ENTITY_ATTRIBUTE_COUNT = 4;

    private String brandId;
    private String brandName;
    private String soundBrand;
    private double price;

    public Brand(String brandId, String brandName, String soundBrand, double price) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.soundBrand = soundBrand;
        this.price = price;
    }

    public Brand() {
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String id) throws CException {
        if (id == null || id.isEmpty()) {
            throw new CException("Error: id is invalid.");
        }
        this.brandId = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) throws CException {
        if (brandName == null || brandName.isEmpty()) {
            throw new CException("Error: brandName is null or blank...");
        }
        this.brandName = brandName;
    }

    public String getSoundBrand() {
        return soundBrand;
    }

    public void setSoundBrand(String soundBrand) throws CException {
        if (soundBrand == null || soundBrand.isEmpty()) {
            throw new CException("Error: soundBrand is null or blank...");
        }
        this.soundBrand = soundBrand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws CException {
        if (price > 0) {
            this.price = price;
        } else {
            throw new CException("Error:price is negative...");
        }
    }

    public void inputId() {
        while (true) {
            try {
                setBrandId(Util.inputString("Input brand id", false));
                break;
            } catch (CException ex) {
//                Logger.getLogger(Brand.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void input() {
        while (true) {
            try {
                setBrandName(Util.inputString("Input name", false));
                break;
            } catch (CException ex) {
//                Logger.getLogger(Brand.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while (true) {
            try {
                setSoundBrand(Util.inputString("Input sound", false));
                break;
            } catch (CException ex) {
//                Logger.getLogger(Brand.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while (true) {
            try {
                setPrice(Util.inputDouble("input price (a real number >0)", Double.valueOf(0), null));
                break;
            } catch (CException ex) {
//                Logger.getLogger(Brand.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public String output() {
        StringBuilder sb = new StringBuilder();
        sb.append("Brand{");
        sb.append(toString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(brandId);
        sb.append(",").append(brandName);
        sb.append(",").append(soundBrand);
        sb.append(":").append(price);
        return sb.toString();
    }

    public void parseString(String entityString) throws CException {
        String[] attributes = entityString.split("[,:]", -1);
        if (attributes.length != this.ENTITY_ATTRIBUTE_COUNT) {
            throw new CException("Error: the number of attributes in the string is incorrect.");
        }
        try {
            setBrandId(attributes[0].trim());
            setBrandName(attributes[1].trim());
            setSoundBrand(attributes[2].trim());
            setPrice(Double.parseDouble(attributes[3]));
        } catch (CException ex) {
            throw new CException("Error: an attribute in the string is invalid. " + ex.getMessage());
        }
    }

    @Override
    public int compareTo(Brand o) {
        if (o != null) {
            return this.brandId.compareTo(o.brandId);
        }
        return 1;
    }

}
