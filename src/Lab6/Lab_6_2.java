package Lab6;

import java.util.Scanner;

/*
*String myPassword = "password123";
Allow user to input maximum 3 times
 * */
public class Lab_6_2 {
    public static void main(String[] args) {
        String myPassword = "password123";
        int timeInput = 0;
        Scanner sc = new Scanner(System.in);

        while (timeInput < 3) {
            System.out.print("Please enter the password: ");
            String passWord = sc.nextLine();
            if (passWord.equals(myPassword)) {
                System.out.println("Password Correct");
                break;
            } else {
                timeInput++;
            }
        }
        if (timeInput >= 3) {

            System.out.println("You are entered more 3 times");
        }
    }
}
