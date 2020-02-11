package cybertekschool.day06_;

import java.util.Scanner;

public class ScannerCapturingWholeLine {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.nextLine();

        System.out.println("Where do You live now?");
        String city = scan.nextLine();

        System.out.println("What is your home address?");
        String address = scan.nextLine();

        System.out.println("Your name is " + name + " and You are now living in " + city + ". Yourhome is located at "+ address);



        // Task 4
        // use nextLine() to ask your bio
        // What is your name
        // Which city you live in inculuding state , Tyson , VA
        // What is your street address



    }
}
