/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 840G3
 */
public class StudentManager {
    Student studentList[] =new Student[50];
    int numOfStudent =0;
    public Student getStudentByIndex(int index){
        return studentList[index];
    }
    
    public int addStu(Student newStudent){
        if (numOfStudent< studentList.length) {
            studentList[numOfStudent++]= newStudent;
            return 1;
        } else {
            return 0;
        }
    }
    public void printStu(){
        System.out.println("Student list: ");
        for (int i = 0; i < numOfStudent; i++) {
            System.out.println(studentList[i].toString());
        }
    }
    public int findStu(String ID){
        int result =0;
        return result;
    }
    public void updateStu(Student newStudent){
        
    }
}
