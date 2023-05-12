
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 840G3
 */
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        String mID, mFullName, mPhone, mAddress;
        Date mDOB = null;
        Scanner sc = new Scanner(System.in);
        StudentManager stdManager = new StudentManager();
        do {
            System.out.println("Select a function");
            System.out.println("1. Add a new Student ");
            System.out.println("2. View stuend list");
            System.out.println("3. Find a student by ID");
            System.out.println("4. Update astudent");
            System.out.println("5. Exist");
            System.out.print("Select: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    mID = sc.next();

                    System.out.print("Full Name: ");
                    mFullName = sc.next();

                    System.out.print("DOB(dd/mm/yyy): ");
                    SimpleDateFormat f = new SimpleDateFormat("(dd/mm/yyy)");

                    try {
                        mDOB = f.parse(sc.next());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("Address: ");
                    mAddress = sc.next();

                    System.out.print("Phone: ");
                    mPhone = sc.next();

                    Student newStudent = new Student(mID, mFullName, mDOB, mPhone, mAddress);

                    stdManager.addStu(newStudent);
                    break;
                case 2:
                    stdManager.printStu();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again.");
                    break;
            }
        } while (true);

    }

}
