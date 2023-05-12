package Controlers;

import DTO.Student;
import java.util.ArrayList;

public class StuList extends ArrayList<Student> {

    public void createStudent() {
        System.out.println("Input Student's infomation:");
        String code, name;
        float mark;
        boolean check = true;
        do {
            code = Utils.Utils.getStringreg("Enter code: ", "^SE\\d{6}$",
                    "Code cannot null", "The Employee Code must be SExxxxxx format!");
            check = this.contains(new Student(code));
            if (check) {
                System.out.println("Duplicated code!");
            }
        } while (check);

        name = Utils.Utils.getString("Input the Student's name: ");
        mark = Utils.Utils.getFloat("Input mark: ", 0, 10);

        Student Stu = new Student(code, name, mark);
        this.add(Stu);
        System.out.println(Stu.toString());
    }

    public void update() {
        String code = Utils.Utils.getStringreg("Enter code: ", "^SE\\d{6}$",
                "Code cannot null", "The Employee Code must be SExxxxxx format!");
        int index = this.indexOf(new Student(code));
        if (index < 0 || index >= this.size()) {
            System.out.println("Student's code does not exist: ");
        } else {
            String oldName = ((Student) this.get(index)).getName();
            String newName = Utils.Utils.getString("Enter new Name: ", oldName);
            this.get(index).setName(newName);

            float oldMark = ((Student) this.get(index)).getMark();
            float newMark = Utils.Utils.getFloat("Input new mark: ", 0, 10, oldMark);
            this.get(index).setMark(newMark);
        }
        System.out.println(this.get(index).toString());
    }

    public void find() {
        boolean checkcontinues = true;
        do {
            boolean checkformat = true;
            boolean isExist = false;
            String search = Utils.Utils.getString("Input Student code to search: ");
            for (Student stu : this) {
                if (search.isEmpty()) {
                    System.out.println(stu.toString());
                    isExist = true;
                } else if (stu.getCode().equals(search)) {
                    System.out.println(stu.toString());
                    isExist = true;
                }
            }
            if (!isExist) {
                System.out.println("The Student does not exist!");
            }
            String create_continues
                    = Utils.Utils.getString("Do you want to find Student continue? (Y/N) ");
            if ("Y".equals(create_continues.toUpperCase())) {
                checkcontinues = true;
                checkformat = true;
            } else if ("N".equals(create_continues.toUpperCase())) {
                checkcontinues = false;
                checkformat = true;
            } else {
                System.out.println("You must be input true format!! Try again !!!");
                checkcontinues = false;
                checkformat = false;
            }
        } while (checkcontinues);
    }

    public void removeStu() {
        String code = Utils.Utils.getStringreg("Enter code: ", "^SE\\d{6}$",
                "Code cannot null", "The Employee Code must be SExxxxxx format!");
        int index = this.indexOf(new Student(code));
        if (index < 0 || index >= this.size()) {
            System.out.println("Student's code does not exist: ");
        } else {
            remove(this.get(index));
            System.out.println("Delete Success!");
        }
    }

    public void output() {
        for (Student stu : this) {
            System.out.println(stu.toString());
        }
    }
}
