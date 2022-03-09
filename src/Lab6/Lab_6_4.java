package Lab6;

/*
*String url = "https://google.com";
Check http OR https; domain name, .com OR .net
* */
public class Lab_6_4 {
    public static void main(String[] args) {
        String url = "https://google.com";
        String domainName = url.substring(8);
        if (url.contains("https")) {
            System.out.println("URL is https");
        } else {
            System.out.println("URL is http");
        }
        if (url.contains(".com")) {
            System.out.println("URL is .com");
        } else {
            System.out.println("URL is .net");
        }

        System.out.println("Domain name is : " + domainName);
    }
}
