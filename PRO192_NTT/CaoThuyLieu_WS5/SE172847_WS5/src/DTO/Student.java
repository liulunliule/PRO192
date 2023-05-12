package DTO;

public class Student {

    private String code;
    private String name;
    private float mark;

    public Student() {
    }

    public Student(String code) {
        this.code = code;
    }

    public Student(String code, String name, float mark) {
        this.code = code;
        this.name = name;
        this.mark = mark;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return code + "-" + name + "-" + mark;
    }

    @Override
    public boolean equals(Object obj) {
        Student Stu = (Student) obj;
        return this.code.equalsIgnoreCase(Stu.getCode());
    }

}
