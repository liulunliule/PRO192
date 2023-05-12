/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carprj;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BrandList extends DataManagement<Brand> {

    private static BrandList instance = new BrandList();

    public static BrandList getInstance() {
        return instance;
    }

    private BrandList() {
    }    
    
    public Brand addNew() throws CException {
        Brand brand = new Brand();
        brand.inputId();
        brand.input();
        if (brand == null) {
            throw new CException("Brand cannot be null");
        }
        for (Brand brandEntity : this.entityList) {
            if (brandEntity.getBrandId().equals(brand.getBrandId())) {
                throw new CException("Brand with id: " + brand.getBrandId() + " already exists");
            }
        }
        try {
            entityList.add(brand);
        } catch (Exception e) {
            throw new CException("Error adding brand to the list. Details: " + e.getMessage());
        }
        return brand;
    }
    
    public boolean updateBrandById(String brandId) throws CException{
        if(brandId != null && !brandId.isEmpty()){
            Brand updateBrand = getBrandById(brandId);
            if(updateBrand != null) {
                updateBrand.input();
                return true;
            } else {
                System.out.println("brand id did not existed");
            }
        } else {
            System.out.println("input brandId is null or blank");
        }
        return false;
    }
            
    public Brand getBrandById(String id) {
        if (id != null && !id.isEmpty()) {
            for (Brand brand : entityList) {
                if (id.equalsIgnoreCase(brand.getBrandId())) {
                    return brand;
                }
            }
        }
        return null;
    }
   
        public void printAllBrands() {
            System.out.println("Printing brand information...");
        for (Brand brand : this.entityList) {
            System.out.println(brand.output());
        }
    }
    
    @Override
    public boolean deleteData(String id){
        Brand brand = getBrandById(id);
        if (brand == null) {
            return false;
        }   
        return entityList.remove(brand);
    }
    
    @Override
    public boolean saveData(){
        List<String> brandList = new ArrayList<>();
        for (Brand brand : entityList) {
            brandList.add(brand.toString());
        }
        return super.getDatabaseService().saveData(brandList);
    }
    
    @Override
    public boolean insertData(Brand brand) {
        return super.getDatabaseService().insert(brand.toString());
    }
 
    @Override
    protected Brand parseString(String stringEntity) {
        try {
            Brand obj = new Brand();
            obj.parseString(stringEntity);
            return obj;
        } catch (CException ex) {
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
