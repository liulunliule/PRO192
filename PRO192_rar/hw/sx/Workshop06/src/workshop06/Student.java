
package workshop06;

public class Student {

    protected String code = "";
    protected String name = "";
    protected double mark = 0;

    public Student() {
    }

    public Student(String code, String name, double mark) {
        this.code = code;
        this.name = name;
        this.mark = (mark >= 0 && mark <= 10) ? mark : 0;
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
        name = name.trim().toUpperCase();
        if (name.length() > 0) {
            this.name = name;
        }
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
        }
    }

    @Override
    public String toString() {
        return code +", "+ name + ", "+ mark;
    }
    

}
