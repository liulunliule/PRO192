/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Developer extends Employee {

    private String teamName;

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return the programmingLanguages
     */
    public ArrayList<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    /**
     * @param programmingLanguages the programmingLanguages to set
     */
    public void setProgrammingLanguages(ArrayList<String> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    /**
     * @return the expYear
     */
    public int getExpYear() {
        return expYear;
    }

    /**
     * @param expYear the expYear to set
     */
    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    private ArrayList<String> programmingLanguages;
    private int expYear;

    /**
     * @param empID
     * @param empName
     * @param baseSal
     * @param teamName
     * @param programmingLanguages
     * @param expYear
     */
    public Developer(String empID, String empName, int baseSal, String teamName, ArrayList<String> programmingLanguages,
            int expYear) {
        super(empID, empName, baseSal);
        this.teamName = teamName;
        this.programmingLanguages = programmingLanguages;
        this.expYear = expYear;
    }

    @Override
    public double getSalary() {
        if (getExpYear() >= 5) {
            return getBaseSal() + getExpYear() * 2000000;
        } else if (5 > getExpYear() && getExpYear() >= 3) {
            return getBaseSal() + getExpYear() * 1000000;
        } else {
            return getBaseSal();
        }

    }

    @Override
    public String toString() {
        return getEmpID() + "_" + getEmpName() + "_" + getBaseSal() + "_" + getTeamName() + "_"
                + getProgrammingLanguages() + "_" + getExpYear();
    }

}
