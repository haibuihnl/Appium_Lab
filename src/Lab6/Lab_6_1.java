package Lab6;


/*
 *Given input string: "2hrs and 5 minutes"
Please calculate how many minutes in total
 */
public class Lab_6_1 {
    public static void main(String[] args) {
        String timeInput = "2hr and 5minutes";
        String timeInputStr = timeInput.replaceAll("[^0-9]", "");
        String timeInputStr1 = timeInputStr.substring(0, 1);
        String timeInputStr2 = timeInputStr.substring(1, 2);
        int totalMinute = Integer.parseInt(timeInputStr1) * 60 + Integer.parseInt(timeInputStr2);
        System.out.printf("Total minute is : %d minutes", totalMinute);
    }
}
