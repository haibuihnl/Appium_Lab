package Lab_3;


// Count how many odd, even number(s) in an integer array


public class Lab_3_1 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int oddNumber = 0;
        int evenNumber = 0;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                oddNumber = oddNumber + 1;
            } else {
                evenNumber = evenNumber + 1;
            }
        }
        System.out.println("Odd numbers : " + oddNumber);
        System.out.println("Even numbers : " + evenNumber);

    }
}
