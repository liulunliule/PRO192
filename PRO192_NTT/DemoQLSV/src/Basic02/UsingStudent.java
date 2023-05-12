package Basic02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 840G3
 */
public class UsingStudent {

    public static void main(String[] args) {
//        Student sv2 = new Student("SE170001", "Le Van Bao", "090123444", 20); // new Student();// là Instance
//        
//        Student sv1 = new Student();
//        sv1.setCode("SE170002");
//        sv1.setFullname("Le Van Luyen");
//        sv1.setPhone("090123456");
//        sv1.setAge(20);
//
//        sv1.printinfo();
//        sv2.printinfo();

        // Viet CTrinh Qly 5 sv
        Student[] list = new Student[5];
        Student sv1 = new Student("SE170001", "Le Van An", "090123441", 20);
        Student sv2 = new Student("SE170002", "Le Van Bao", "090123442", 21);
        Student sv3 = new Student("SE170003", "Le Van Cuong", "090123443", 19);
        Student sv4 = new Student("SE170004", "Le Van Dung", "090123444", 17);
        Student sv5 = new Student("SE170005", "Le Van Em", "090123445", 16);

        list[0] = sv1;
        list[1] = sv2;
        list[2] = sv3;
        list[3] = sv4;
        list[4] = sv5;

        //in ds age >19
//        for (int i = 0; i < list.length; i++) {
//            if (list[i].getAge() > 19) {
//                list[i].printinfo();
//            }
//        }
//        for (Student student : list) {
//            if (student.getAge() > 19) {
//                student.printinfo();
//            }
//        }
//        cập nhật in4 sv SE170003 là 25t
        for (Student student : list) {
            if (student.getCode().equals("SE170003")) {
                student.setAge(25);
                student.printinfo();
            }
        }
        System.out.println("------------------------------------");

        for (Student student : list) {
            student.printinfo();
        }
    }

}
