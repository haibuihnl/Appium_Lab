package Lab_5;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
*Allow user to input student name and id
Find by using ID
* Create a simple menu
1. Input student info
2. Find Student by ID
0. Exit!

* */
public class Lab_5 {
    public static void main(String[] args) {
        int studentID;
        String studentName;
        Map<Integer, String> studentList = new HashMap<>();
        Set<Integer> allIds = studentList.keySet();
        boolean isContinuing = true;
        Scanner sc = new Scanner(System.in);
        while (isContinuing) {
            System.out.println("\n=====Menu=====\n" +
                    "1. Input student name\n" +
                    "2. Find student by ID\n" +
                    "0. Exit !");

            System.out.print("Input selection : ");
            int inputSelection = sc.nextInt();

            if (inputSelection == 1) {
                System.out.print("Enter student ID: ");
                studentID = sc.nextInt();

                System.out.print("Enter student name: ");
                studentName = sc.next();

                studentList.put(studentID, studentName);
                System.out.printf("List student:\n");
                for (Integer id : allIds) {
                    System.out.println(studentList.get(id));
                }
            } else if (inputSelection == 2) {
                System.out.print("Enter studentID want find: ");
                studentID = sc.nextInt();
                System.out.print("Student name is : " + studentList.get(studentID));
            } else if (inputSelection == 0) {
                isContinuing = false;
            }
        }
    }
}
