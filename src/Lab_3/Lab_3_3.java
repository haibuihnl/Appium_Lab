package Lab_3;


//Sort an integer array from min to max


public class Lab_3_3 {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};

        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    int swap1 = intArr[j];
                    int swap2 = intArr[i];
                    intArr[i] = swap1;
                    intArr[j] = swap2;
                }
            }
        }

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
    }
}
