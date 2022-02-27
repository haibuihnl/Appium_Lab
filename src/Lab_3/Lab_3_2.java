package Lab_3;


//Finding maximum value/minimum value from an integer array


public class Lab_3_2 {
    public static void main(String[] args) {

        int[] intArr = {2,3,1,5,4};
        int minArr = intArr[0];
        int maxArr = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if (minArr > intArr[i]) {
                minArr = intArr[i];
            } else if (maxArr < intArr[i]) {
                maxArr = intArr[i];
            }
        }
        System.out.println("Minimum of array : " + minArr);
        System.out.println("Maximum of array : " + maxArr);
    }
}
