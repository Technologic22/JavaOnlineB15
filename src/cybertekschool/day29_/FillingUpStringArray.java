package cybertekschool.day29_;

import java.util.Arrays;

public class FillingUpStringArray {
    public static void main(String[] args) {

        String [] love = new String[300];

        System.out.println("Before filling it up love : "+ Arrays.toString(love));

        love [0]= "I Love Java";
        love [1]= "I Love Java";
        love [2]= "I Love Java";

        for (int i = 0; i <love.length ; i++) {

            love[i]= i+1+ " - I Love java";

        }
        System.out.println("After fill up: \n"+ Arrays.toString(love));
    }
}
