package cybertekschool.day06_;

import java.util.Scanner;

public class RemainderOperator {
    public static void main(String[] args) {

       //+ - * /
        // %


        System.out.println(5/2);
        //System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5.0/2f);

        System.out.println("------modulus . remainder-----");

        //5 dvd by 2 is 2 and remainder is 1
        // 2*2 + 1 = 5

        System.out.println(5 % 2);
        //10*9 + 9 = 99

        //declare a variable called minutes data type int
        // ask user to enter minute as whole numbers
        //print the result in x hour y minutes format
        // for example 135 minutes, 2 hour 15 minutes
        Scanner scan = new Scanner(System.in);

        System.out.println(" what is ");
       // Scanner java = java.nextInt();

        int minutes = 135 ;
        int hour = 135/60;  //2 hours
        int minsPart = 135%60; //15
        System.out.println(" it is "+ hour + " hours and " + minsPart + " minutes");


    }
}
