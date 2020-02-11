package cybertekschool.day08_;

import java.util.Scanner;

public class JustIfStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        System.out.println( " What is your current speed ; ");
        int currentSpeed = scan.nextInt();

        System.out.println("What is the speed Limit?");
        int speedLimit = scan.nextInt();


        if (currentSpeed>=speedLimit){
            System.out.println(" Slow down immediately!");}
        // there is no else, program just move on
    }
}
