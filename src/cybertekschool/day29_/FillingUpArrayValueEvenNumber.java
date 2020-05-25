package cybertekschool.day29_;

import java.util.Arrays;

public class FillingUpArrayValueEvenNumber {
    public static void main(String[] args) {



        //create an array with size 100 and fill it up as below
        //fill up this array with even number starting from 0



        int[] numbers = new int[100];

        System.out.println("Before Filling up \n"+ Arrays.toString(numbers));

        //this is what we do without the looop
        numbers [0] = 0; // 0*2
        numbers [1] = 2; //1*2
        numbers [2] = 4; //2*2
        numbers [3] = 6; //3*2
        numbers [4] = 8; //4*2
        numbers [99] = 198; //99*2

        // numbers [x] = x*2;
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i*2;

        }

        System.out.println("After Filling Up \n" +Arrays.toString(numbers));

    }
}
