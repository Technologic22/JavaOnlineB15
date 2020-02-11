package cybertekschool.day04_;

public class AmazonPractice {
    public static void main(String[] args) {
        //        String productName  Amazon Fire
//        String  model     HD
//        int   version         8
//        float price          79.99
//
//        I saw Fire HD8 hands-free with Alexa for $79.99\

        String productName = "Kindle PaperWhite";
        String model = "7th Generation";
        int screenSize = 8;
        float price = 69.99f;
        char usd = '$';

        System.out.println (" I saw a " + productName + " for " + price + usd + ". " +
                "Its not too expensive for " + "\n" + model + " and " + screenSize +
                "-inch screen sized E-Book reader." );


    }
}
