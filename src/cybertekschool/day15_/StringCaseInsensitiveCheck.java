package cybertekschool.day15_;

import java.util.Scanner;

public class StringCaseInsensitiveCheck {
    public static void main(String[] args) {


        String name = "Muhammed Allakul";
        System.out.println("name.contains al RESULT IS :  " + name.contains("al" ) );

        // I wanna check whether name contains "al" no matter the case
        //so I want to store the upper version of this name then check for ST

        String upperCaseName = name.toUpperCase();
        System.out.println("UpperCaseName Contains AL or Not ? : " + upperCaseName.contains("AL") );

        String lowerCaseName = name.toLowerCase();

        System.out.println("lowerCaseName contains al or not ?" + lowerCaseName.contains("al"));

        // This is called method chaining , combining multiple method call
        // make my name all lowercase (String) then check whether it contains lowercase st
        // THIS WORK BECAUSE name.toLowerCase() result in another String object

        System.out.println(name.toLowerCase().contains("al"));
        //System.out.println(name.length().toUpperCase() ); BAD IDEA!


    }
}
