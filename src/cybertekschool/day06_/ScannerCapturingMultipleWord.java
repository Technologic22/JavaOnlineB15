package cybertekschool.day06_;


import java.util.Scanner;

public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println("what is your name ?");
        String name = blabla.next();         //.next only capture first word sperated by space,

        String anotherWord = blabla.next();

        System.out.println("You have entered " + name);
        System.out.println(anotherWord);

        int age = 34;
        System.out.println("You have entered age " + age);

        //String name = blabla.nextLine();





    }
}

