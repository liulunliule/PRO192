/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carprj;

public enum MenuItem {
    BACK("Back"),
    EXIT("Exit"),
    BRAND("Brand"),
    BRAND_LIST_ALL("List all brand"),
    BRAND_ADD("Add"),
    BRAND_UPDATE("Update"),
    BRAND_FILTER_BY_ID("Filter by id"),
    BRAND_SAVE_TO_FILE("Save Brand to file"),
    //...

    CAR("Car"),
    CAR_SHOW_ALL_ASCENDING_BY_BRAND_NAME("show all cars ascending by brand name"),
    CAR_FILTER_BY_BRAND_NAME("List cars based on a part of an input brand name"),
    CAR_ADD("Add"),
    CAR_UPDATE("Update"),
    CAR_DELETE("Delete"),
    CAR_SAVE_TO_FILE("Save Car to file"),
    ;

    private final String label;

    public String getLabel() {
        return label;
    }

    private MenuItem(String label) {
        this.label = label;
    }

}
