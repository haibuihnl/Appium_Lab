package Lab_4;

/*
* =====MENU======
1. Add number into ArrayList
2. Print numbers
3. Get maximum number
4. Get minimum number
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab_4 {
    public static void main(String[] args) {
        List<Integer> myIntList = new ArrayList<>();

        myIntList.add(4);
        myIntList.add(2);
        myIntList.add(7);
        myIntList.add(1);
        myIntList.add(9);
        myIntList.add(3);

        boolean isContinuing = true;


        Scanner sc = new Scanner(System.in);
        while (isContinuing) {

            System.out.print("\n==========Menu=========\n" +
                    "1. Add number into ArrayList\n" +
                    "2. Print number\n" +
                    "3. Get maximum number\n" +
                    "4. Get minimum number\n" +
                    "Option Number Choice: ");

            int userInput = sc.nextInt();

            int minArr = myIntList.get(0);
            int maxArr = myIntList.get(0);
            for (int i = 0; i < myIntList.size(); i++) {
                if (minArr > myIntList.get(i)) {
                    minArr = myIntList.get(i);
                } else if (maxArr < myIntList.get(i)) {
                    maxArr = myIntList.get(i);
                }
            }
            if (userInput == 0) {
                isContinuing = false;
            }
            if (userInput == 1) {
                System.out.print("Add a number into ArrayList: ");
                int number = sc.nextInt();
                myIntList.add(2, number);
            } else if (userInput == 2) {
                System.out.println("Print numbers in list: ");
                for (Integer value : myIntList) {
                    System.out.println(value + " ");
                }

            } else if (userInput == 3) {
                System.out.printf("Maximum number is : %d", maxArr);
            } else if (userInput == 4) {
                System.out.printf("Minimum number is : %d", minArr);

            }

        }
        /*Find index of number */
        System.out.print("\nInput a number in the list want to find index: ");
        int numFind = sc.nextInt();
        System.out.printf("Index of %d in list : %d", numFind, myIntList.indexOf(numFind));
    }
}
