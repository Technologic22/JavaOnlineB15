package cybertekschool.zCommon_Interview_Questions;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;


public class AlphabetAtoZ {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        System.out.println("Enter a Value: ");
        String msg= object.nextLine();
        System.out.println("age = " + msg);


        // Write a loop that displays all possible combinations of two letters where
        // the letters are 'z', or 'y', or 'x', or 'w', or 'v'. The combinations should be
        // displayed in descending alphabetical order:

        for (char iChar = 'z'; iChar >='v' ; iChar--) {

            for (char iChar2 = 'z'; iChar2 >='v' ; iChar2--) {

                System.out.print(iChar);
                System.out.print(iChar2);
                System.out.println();

            }


        }





    }
}
