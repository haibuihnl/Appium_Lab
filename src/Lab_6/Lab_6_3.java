package Lab_6;

/*
*String myStr = "100 minutes";
NOT using REGEX, extract digit character from that String
Expected output: "100".
EX: "12345nabc678" -> "12345678"
* */
public class Lab_6_3 {
    public static void main(String[] args) {
        String myStr = "100 minutes";
        String myStringExp = myStr.substring(0, 3);
        System.out.println(myStringExp);
    }
}
