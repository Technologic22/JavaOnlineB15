package cybertekschool.day06_;
import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {


        Scanner java = new Scanner (System.in);

        System.out.println("what is your name?");
        String name = java.nextLine();

        System.out.println("what is your age?");
        int age = java.nextInt();
        // u can also use String age = java.nextLine();
        //notice we r not storing this into variable
        //we want below line capture enter keyboard enter
        //so that it does not accidentally get captured by
        //the nextline we use to capture address

        java.nextLine();

        System.out.println("Your age is " + age);

        System.out.println("what is your address?");
        String address = java.nextLine();

        System.out.println("your address is " + address);



    }
}
