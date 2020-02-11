package cybertekschool.day07_;

import java.util.Scanner;

public class CastingTheCharacter {
    public static void main(String[] args) {

      //  scecial case of character to int conversion
      //char aChar = 'a';   -- int n=aChar;

        char grade = 'B';
        System.out.println(grade);

        int letterNumber = 'B';           //'B' represented by 66 in asci table,
        //here char is automatically widened to int
        // and tstored as number
        System.out.println(letterNumber);

        int letterNumber2 = 'b';
        System.out.println(letterNumber2);

        Scanner input = new Scanner(System.in);


        int firstLetter  = 'M';
        int secondLetter = 'u';
        int thirdLetter  = 'h';
        int fourthLetter = 'a';
        int fifthLetter  = 'm';
        int sixthLetter = 'e';
        int seventhLetter = 'd';

        System.out.println(firstLetter);
        System.out.println(secondLetter);
        System.out.println(thirdLetter);
        System.out.println(fourthLetter);
        System.out.println(fifthLetter);
        System.out.println(sixthLetter);
        System.out.println(seventhLetter);


        char letterA = 'a';
        //adding a char to int number will result in int
        //(int) letterA + 1
        System.out.println(letterA + 1);

        System.out.println(""+ letterA+1);
        //space is string letter A is char and 1 is int result "space'a'1"

    }
}
