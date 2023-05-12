/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop06;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class StudentList extends ArrayList<Student> {

    public Student search(String code) {
        code = code.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equalsIgnoreCase(code));
            return this.get(i);

        }
        return null;
    }

    private boolean isCodeDupplicated(String code) {
        code = code.trim().toUpperCase();
        return search(code) != null;
    }

    public void addStudent() {
//        String newCode, newName;
//        double newMark;
//        boolean codeDuplicated = false;
//        
//        do {
//            newCode = Inputter.inputPattern("St. code s000: ", "[s][\\d]{3}");        
//            newCode = newCode.trim().toUpperCase();
//            codeDuplicated = isCodeDupplicated(newCode);
//            if (codeDuplicated) {
//                System.out.println("Code is duplicated");
//            }
//        } while (codeDuplicated == true);
//        newName = Inputter.inputNonBlankString("Name of new student: ");
//        newName = newName.toUpperCase();
//        newMark = Inputter.inputInt("Mark: ", 0, 10);
//       
//        Student st = new Student(newCode, newName, newMark);
//        this.add(st);
//        System.out.println("Student" + newCode + "has been updated");

        //Input data of new Student
        String newCode, newName;
        int newMark;
        boolean codeDuplicated = false;
        do {//pattern: s000 or S000 => Pattern: "[sS][\\d]{3}"
            newCode = Inputter.inputPattern("St. code s000: ", "[sS][\\d]{3}");
            newCode = newCode.trim().toUpperCase();
            codeDuplicated = isCodeDupplicated(newCode); //check code duplication
            if (codeDuplicated) {
                System.out.println("Code is duplicated");
            }
        } while (codeDuplicated == true);

        newName = Inputter.inputNonBlankString("Name of new student: ");
        newName = newName.toUpperCase();
        newMark = Inputter.inputInt("Mark: ", 0, 10); // 0 <= mark <= 10

        //Create new student
        Student st = new Student(newCode, newName, newMark);

        //Add new student to the list
        this.add(st);
        System.out.println("Student " + newCode + " has been added.");

    }

    public void searchStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list");
        } else {
            String sCode = Inputter.inputStr("Input studen code for search: ");
            Student st = this.search(sCode);
            if (st == null) {
                System.out.println("Student: " + sCode + " not found");

            } else {
                System.out.println("Found: " + st);
            }
        }
    }

    public void updateStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list!");
        } else {
            String uCode = Inputter.inputStr("Input code of updated student: ");
            Student st = this.search(uCode);
            if (st == null) {
                System.out.println("Student " + uCode + " does not exist");
            } else {
                String oldName = st.getName();
                String newName = Inputter.inputNonBlankString("Old name: " + oldName + ", new name:");
                st.setName(newName);

                double oldMark = st.getMark();
                double newMark = Inputter.inputInt("Old mark" + oldMark + ", new mark:", 0, 10);
                st.setMark(newMark);
                System.out.println("Student" + uCode + " has been updated");
            }
        }
    }

    public void removeStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list!");
        } else {
            String rCode = Inputter.inputStr("Input code of removed student: ");
            Student st = this.search(rCode);
            if (st == null) {
                System.out.println("Student " + rCode + " does not exist");
            } else {
                this.remove(st);
                System.out.println("Student " + rCode + " has been removed");
            }
        }
    }

    public void printAll() {
        if (this.isEmpty()) {
            System.out.println("Empty list!");
        } else {
            System.out.println("Student list");
            for (Student x : this) {
                System.out.println(x);

            }
            System.out.println("Total: " + this.size() + ", student(s).");
        }
    }

}
