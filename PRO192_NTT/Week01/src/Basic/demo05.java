package Basic;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 840G3
 */
//viết CTrinh qly dsach 10 sv
public class demo05 {

    public static void main(String[] args) {
        String name[] = new String[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of list: ");
        for (int i = 0; i < 2; i++) {
            name[i] = sc.nextLine();
        }
        System.out.println("-------------------------");
        System.out.println("Student list: ");
//        cách 1
//        for (int i = 0; i < 2; i++) {
//            System.out.println(name[i].substring(0, 1).toUpperCase()+ name[i].substring(1) );
//        }

//cách thầy chỉ (in theo kí tự)
        for (int i = 0; i < 2; i++) {
            char[] charArray = name[i].toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            System.out.println(charArray);
        }

    }
}
