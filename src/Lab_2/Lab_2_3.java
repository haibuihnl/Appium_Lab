package Lab_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Continue Lab_2_1. Suggest weight
 * */
public class Lab_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the height :");
        float height = sc.nextFloat();

        System.out.print("Input the weight :");
        float weight = sc.nextFloat();

        float BMI = weight/(height*2);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");

        float weightExp = 20*(height * 2);
        float numWeight;

        if (weight > weightExp){
            numWeight = weight - weightExp ;
        }else {
            numWeight = weightExp - weight ;
        }

        if (BMI <= 18.5) {
            System.out.printf("Under weight! ");
            System.out.printf("You should increase %s kg to beauty ",decimalFormat.format(numWeight));
        }else if (BMI > 18.5 && BMI <= 24.9) {
            System.out.printf("Nomal weight !");
        }else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Over weight ! ");
            System.out.printf("You should decrease %s kg to beauty ",numWeight);
        }else {
            System.out.println("Obesity ! ");
            System.out.printf("You should decrease %s kg to beauty ",numWeight);
        }
    }
}
