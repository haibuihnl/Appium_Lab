package Lab_3;

/*
 * Merge 2 SORTED integer array into one SORTED array
 * Array 01: {1, 12, 16, 28, 34}
 * Array 02: {1, 13, 16, 27, 99}
 * Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
 */
public class Lab_3_4 {
    public static void main(String[] args) {
        int [] intArr1 = {1,12,16,28,34};
        int [] intArr2 = {1,13,16,27,99};
        int lenghtArr3 = intArr1.length + intArr2.length;
        int[] intArr3 = new int[lenghtArr3] ;
        int pos = 0;
        for (int value : intArr1) {
            intArr3[pos] = value;
            pos++;
        }
        for (int value : intArr2) {
            intArr3[pos] = value;
            pos++;
        }
        int unSortedPosition = intArr3.length - 1;
        while (unSortedPosition > 0){

            for (int i = 0; i < unSortedPosition; i++) {

                if (intArr3[i] > intArr3[i+1]) {
                    int temp = intArr3[i];
                    intArr3[i] = intArr3[i+1];
                    intArr3[i+1] = temp;
                }
            }
            unSortedPosition--;
        }
        for (int value : intArr3) {
            System.out.println(value);
        }
    }
}
