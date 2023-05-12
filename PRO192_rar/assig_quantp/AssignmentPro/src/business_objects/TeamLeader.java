/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_objects;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class TeamLeader extends Developer {

    private double bonus_rate;

    /**
     * @return the bonus_rate
     */
    public double getBonusRate() {
        return bonus_rate;
    }

    /**
     * @param bonus_rate the bonus_rate to set
     */
    public void setBonusRate(double bonus_rate) {
        this.bonus_rate = bonus_rate;
    }

    /**
     * @param empID
     * @param empName
     * @param baseSal
     * @param teamName
     * @param programmingLanguages
     * @param expYear
     */
    public TeamLeader(String empID, String empName, int baseSal, String teamName,
            ArrayList<String> programmingLanguages, int expYear, double bonus_rate) {
        super(empID, empName, baseSal, teamName, programmingLanguages, expYear);
        this.bonus_rate = bonus_rate;
    }

    // getSalary implementation for TeamLeader
    @Override
    public double getSalary() {
        return super.getSalary() + super.getSalary() * getBonusRate();
    }


}
