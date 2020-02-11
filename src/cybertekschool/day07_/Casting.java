package cybertekschool.day07_;

public class Casting {
    public static void main(String[] args) {



        // Casting converting one data type and storing into another diffrt data type

        // i.e. 10 is int, it can be stored into double
        //bc dbl has much bigger range than 10
        // 10 ll be converted 10.0 and be stored as dbl
        //this called widening -->>smaller data type-->>biggerdata type and this happens implicitly/automatically

        // 12.99 is dbl, it cant be stored into int variable
        //since int can only hold whole number and smaller range i.e int x = 12.99  -->> COMPILER ERRORR!!
        //In order to save this we need to specifically tellcompiler that we r ok with data loss(fractional point!)
        // ths has to be happen explicitly by programmer
        // this is called
        double potatoPrice = 12.99;
        int potatoRounded = (int)potatoPrice;

        long earthToMoon = 1000000; //-->> 100000L
        int earthToMoon_int = (int)earthToMoon;

        System.out.println(potatoRounded);
        System.out.println(earthToMoon_int);



    }
}
