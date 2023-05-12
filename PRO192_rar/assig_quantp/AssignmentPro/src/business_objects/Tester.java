/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_objects;

/**
 *
 * @author USER
 */
public class Tester extends Employee {

    private double bonusRate;
    private String type;

    /**
     * @return the bonusRate
     */
    public double getBonusRate() {
        return bonusRate;
    }

    /**
     * @param bonusRate the bonusRate to set
     */
    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param empID
     * @param empName
     * @param baseSal
     * @param bonusRate
     * @param type
     */
    public Tester(String empID, String empName, int baseSal, double bonusRate, String type) {
        super(empID, empName, baseSal);
        this.bonusRate = bonusRate;
        this.type = type;
    }

    // Implemented getSalary method for Tester
    @Override
    public double getSalary() {
        return getBaseSal() + getBonusRate() * getBaseSal();
    }

}
