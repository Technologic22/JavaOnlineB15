package cybertekschool.day08_;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);

        System.out.println("Guess my favourite number : ");

        int myFavouriteNumber = scan.nextInt();

        if (myFavouriteNumber == 22) {
            System.out.println("Bingo!!!");
        } else {
            System.out.println(" U failed, try again!!");
        }


    }

}
