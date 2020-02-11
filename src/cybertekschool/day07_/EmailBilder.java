package cybertekschool.day07_;

import java.util.Scanner;

public class EmailBilder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name, last name and company seperated by space");

        String firstName, lastName, company, email;

        firstName = scan.next();
        lastName = scan.next();
        company = scan.next();
        email = scan.next();

        System.out.println("My full name is "+ firstName+ " "+ lastName+ ". "+ "I work for "+ company + " Inc. My email is "+ email );


                /////


        firstName = "Muhamed";
        lastName = "Allaguly";
        company = "TechnoLogic";


    }
}
