package cybertekschool.day29_;

import java.util.Arrays;

public class FillingUpArray {
    public static void main(String[] args) {

        //create an array with size 100 and fill it up as below

        int[] numbers = new int[100];

        System.out.println("Before Filling up \n"+ Arrays.toString(numbers));

        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;

        System.out.println(Arrays.toString(numbers));

        for (int x =0; x<numbers.length; x++){
            numbers[x]=x+1;

        }

        System.out.println("After Filling Up \n" + Arrays.toString(numbers));


    }

}
