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
        float BMIdec = Float.parseFloat(decimalFormat.format(BMI));

        float weightExp = Float.parseFloat(decimalFormat.format(20*(height * 2)));
        float numWeight;

        if (weight > weightExp){
            numWeight = weight - weightExp ;
        }else {
            numWeight = weightExp - weight ;
        }

        numWeight = Float.parseFloat(decimalFormat.format(numWeight));

        if (BMIdec <= 18.5) {
            System.out.printf("Under weight! ");
            System.out.printf("You should increase %f kg to beauty ",numWeight);
        }else if (BMIdec > 18.5 && BMIdec <= 24.9) {
            System.out.printf("Nomal weight !");
        }else if (BMIdec >= 25 && BMIdec <= 29.9) {
            System.out.println("Over weight ! ");
            System.out.printf("You should decrease %f kg to beauty ",numWeight);
        }else {
            System.out.println("Obesity ! ");
            System.out.printf("You should decrease %f kg to beauty ",numWeight);
        }
    }
}
