package cybertekschool.day06_;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SaleCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double regularPrice = 80;
        double discount  = 0.3;
        double salePrice = (regularPrice - (regularPrice*discount) );

        //if u have mutliple variable of the same type, and wanna use in one line
        //double regulaPrice, salePrice, discount;


        System.out.println("What is the price for this shoes?");
        regularPrice = scan.nextDouble();

        System.out.println("Is there any discount? Yes, you have 30% discount on this item");
        discount = scan.nextDouble();

        System.out.println("regular price is " + regularPrice + " and You got deal for " + salePrice + " $");


    }
}
