package cybertekschool.day04_;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        // I want to saveusers inputafter asking some questions
        // and I want to save this input so I can do sth with it

        //step1: Use scanner class to create scanner object
        //that have this functionality
        Scanner scan = new Scanner(System.in);
        // ask user to enter name
        System.out.println("Enter your first name pls: ");

        //capture what user typed on keyboard in console

        String firstName = "Muhammet";  //scan.next();
        // print the result of what we saved from user input
        System.out.println("U have entered : " + firstName);

        //ask question from the user
        System.out.println("what is your age : ");
        // capture what user typed on keyboard in console for age
        int age = 34; //scan.nextInt(); //scan.nextInt() is capturing single number that user entered
        //print the result of users age
        System.out.println("your age is : " + age);

    }
}
