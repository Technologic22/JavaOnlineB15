package cybertekschool.day36_;

import java.util.Scanner;

public class Array_List_Intro {
    public static void main(String[] args) {

        double price1, price2, price3;

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter Item1 and its price:");
        String item1 = scan.nextLine();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        String item2 = scan.nextLine();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3 and its price:");
        String item3 = scan.nextLine();
        price3 = scan.nextDouble();



        //System.out.println("Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3);

        double totalPrice = price1+ price2 + price3;


        String report  = "Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3+ ". Total price: "+totalPrice;
        System.out.println(report);



    }
}
