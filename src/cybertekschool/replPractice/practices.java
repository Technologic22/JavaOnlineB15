package cybertekschool.replPractice;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class practices {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = scan.nextLine();
        String vowels ="";

        for (int i = 0; i <word.length()-1 ; i++) {


            if(word.substring(i, i+1).equalsIgnoreCase("a") || word.substring(i, i+1).equalsIgnoreCase("e") || word.substring(i, i+1).equalsIgnoreCase("i") ||word.substring(i, i+1).equalsIgnoreCase("o") ||word.substring(i, i+1).equalsIgnoreCase("u")){
                vowels=vowels+word.substring(i, i+1);
            }

        }
        System.out.println(vowels);





    }
}




