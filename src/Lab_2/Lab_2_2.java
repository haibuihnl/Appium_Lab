package Lab_2;

import java.util.Scanner;

/*
 * Allow user to input a number , print out it's odd or even number
 * */
public class Lab_2_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.printf("%d is a even number !", num);
        }else {
            System.out.printf("%d is a odd number !",num);
        }
    }
}
