package cybertekschool.day43_Const_Encap_Cust_Type;

import java.util.ArrayList;
import java.util.List;

public class Starbucks {
    public static void main(String[] args) {

        Coffee c1 = new Coffee();
        c1.setPrice(-3.5);
        c1.setCaffeineLevel(5);
        c1.setType("Arabica");

        System.out.println("c1 = " + c1);

        Coffee c2 = new Coffee("Mint Mocha",3);
        System.out.println("c2 = " + c2);
        Coffee c3 = new Coffee("Intensito", 9, 3.4);
        System.out.println("c3 = " + c3);
        Coffee c4 = new Coffee("Latte", 4, -2.5);
        System.out.println("c4 = " + c4);

        double sumOfAllCoffee = c1.getPrice()+c2.getPrice()+c3.getPrice()+c4.getPrice();
        System.out.println("sumOfAllCoffee = " + sumOfAllCoffee);


        List <String>lst1=new ArrayList<>();
        lst1.add("abc");
        lst1.add(null);
        lst1.add(null);
        lst1.add(null);
        //any non-primitive type can be assigned 'null' ==>

       // c1=null;   //it is not tied to object anymore! no more leash to dog! object is the garbage collected
    }
}
