package cybertekschool.day55_Oop_review_Casting_HasA;

public class TaxiAction {

    public static void main(String[] args) {
        Engine en = new Engine("V6", 250);

        Taxi t1 = new Taxi(1699, en);
        System.out.println("t1 = " + t1.toString());
    }

}
