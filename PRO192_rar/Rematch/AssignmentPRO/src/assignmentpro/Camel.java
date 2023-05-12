/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentpro;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Camel {

    private String desert;
    private int step;

    public Camel() {

    }

    public Camel(String desert, int step) {
        this.desert = desert;
        this.step = step;
    }

    public String getDesert() {
        return desert.toUpperCase();
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public void enterdesert() {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.print("Enter desert: ");
            setDesert(sc.nextLine());
            System.out.print("Enter step: ");
            setStep(sc.nextInt());
            System.out.println("1. Test getDesert()");
            System.out.println("2. Test setStep()");
            System.out.print("Enter TC (1 or 2) : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("OUTPUT: " + getDesert());
                    break;
                case 2:
                    System.out.println("Enter new step: ");
                    setStep(sc.nextInt());
                    System.out.println("OUTPUT: " + getStep());
                    break;
            }
        } while (choice < 3);
        System.out.println("Error!");
    }

}
