package cybertekschool.day06_;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {


        int myFavouriteNumber = 300;
        int yourFavouriteNumber = myFavouriteNumber;


        String yourOrder = "Tea";
        String myOrder = yourOrder;
        System.out.println("Your order is " + myOrder);
        System.out.println("My order is also " + myOrder);

    }
}
