
package workshop06;

public class StudentManager {

    public static void main(String[] args) {
        String[] options = {
            "Add a new student", "Search a student", "Update name and mark",
            "Remove a student", "List all student(s)", "Quit"};
        int choice = 0;
        StudentList sl = new StudentList();
        do {
            System.out.println("\nStudent managing program");
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1:
                    sl.addStudent();
                    break;
                case 2:
                    sl.searchStudent();
                    break;
                case 3:
                    sl.updateStudent();
                    break;
                case 4:
                    sl.removeStudent();
                case 5:
                    sl.printAll();
                default:
                    System.out.println("Good Bye!");
            }
        } while (choice > 0 && choice < 6);

    }
}
