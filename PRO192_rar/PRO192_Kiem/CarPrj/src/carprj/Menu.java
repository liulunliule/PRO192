/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carprj;

import static carprj.MenuItem.BRAND;
import static carprj.MenuItem.CAR;

public class Menu {

    private final MenuItem[] primaryOptions = {
        MenuItem.EXIT,
        MenuItem.BRAND,
        MenuItem.CAR
    };

    private final MenuItem[] brandOptions = {
        MenuItem.BACK,
        MenuItem.BRAND_LIST_ALL,
        MenuItem.BRAND_ADD,
        MenuItem.BRAND_FILTER_BY_ID,
        MenuItem.BRAND_UPDATE,
        MenuItem.BRAND_SAVE_TO_FILE,
    };

    private final MenuItem[] carOptions = {
        MenuItem.BACK,
        MenuItem.CAR_SHOW_ALL_ASCENDING_BY_BRAND_NAME,
        MenuItem.CAR_FILTER_BY_BRAND_NAME,
        MenuItem.CAR_ADD,
        MenuItem.CAR_DELETE,
        MenuItem.CAR_UPDATE,
        MenuItem.CAR_SAVE_TO_FILE
    };

    private MenuItem primaryOption = null;
    private MenuItem subOption = null;

    public Menu() {
        this.primaryOption = MenuItem.EXIT;
        this.subOption = MenuItem.BACK;
    }

    public MenuItem getUserChoice() {
        do {
            if (subOption == MenuItem.BACK) {
                primaryOption = getChoice(null);
            }
            if (primaryOption != MenuItem.EXIT) {
                subOption = getChoice(primaryOption);
            }
        } while (primaryOption != MenuItem.EXIT && subOption == MenuItem.BACK);
        return primaryOption.equals(MenuItem.EXIT) ? MenuItem.EXIT : subOption;
    }

    private MenuItem getChoice(MenuItem option) {
        MenuItem[] optionList = getOptionList(option);
        String menuCaption;
        if (option == null) {
            menuCaption = "Car manager:";
        } else {
            menuCaption = option.getLabel();
        }
        int numItems = showOptionMenu(menuCaption, optionList);
        int choice = Util.inputInteger("Please enter your choice", 0, numItems - 1);

        return optionList[choice];
    }

    private int showOptionMenu(String menuCaption, MenuItem[] optionList) {
        int numItems = 1;
        System.out.println("*********************************************");
        System.out.println(menuCaption);
        for (int i = 1; i < optionList.length; i++) {
            System.out.printf("(%d) -> %s\n", numItems, optionList[i].getLabel());
            numItems++;
        }
        System.out.printf("(0) -> %s\n", optionList[0].getLabel());
        System.out.println("*********************************************");
        return numItems;

    }

    private MenuItem[] getOptionList(MenuItem option) {
        MenuItem[] optionList ;
        if (option == null) {
            optionList = primaryOptions;
        } else {
            if (option == BRAND){
                optionList = brandOptions;
            } else if (option == CAR){
                optionList = carOptions;
            } else {
                optionList = primaryOptions;
            }
//            optionList =
//                    switch (option) {
//                case BRAND ->
//                    brandOptions;
//                case CAR ->
//                    carOptions;
//                default ->
//                    primaryOptions;
//            };
        }

        return optionList;
    }
}

