package Lab_2;

/*Get input from user about height(m) , weight(kg) then caculate BMI
 * Underweight =<  18.5
 * Nomal weight = 18.5 - 24.9
 * Over weight = 25 - 29.9
 * Obesity : BMI of 30 or greater
 * BMI = weight/(height * 2)
 * */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the height :");
        float height = sc.nextFloat();

        System.out.print("Input the weight :");
        float weight = sc.nextFloat();

        float BMI = weight/(height*2);

        if (BMI <= 18.5) {
            System.out.printf("Under weight! ");
        }else if (BMI > 18.5 && BMI <= 24.9) {
            System.out.printf("Nomal weight !");
        }else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Over weight ! ");
        }else {
            System.out.println("Obesity ! ");
        }
    }
}
