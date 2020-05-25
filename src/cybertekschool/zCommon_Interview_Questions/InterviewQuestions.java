package cybertekschool.zCommon_Interview_Questions;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class InterviewQuestions {

    public static void main(String[] args) {



    String sentence = "this is me";
    String sentenceReversed ="";
        for (int i = sentence.length()-1; i >=0 ; i--) {

        sentenceReversed=sentenceReversed+sentence.charAt(i);


    }
        System.out.println("sentenceReversed = " + sentenceReversed);
        System.out.println("--------------------------------------------");

    int[] number= new int[]{4,71, 15, 43, 8};
    int max=number[0];
    int min = number[1];
        for (int eachNumber: number) {

        if (eachNumber>max) {
            max=eachNumber;
        }

        if (eachNumber<min) {
            min=eachNumber;
        }
    }
        System.out.println("Max num is : "+ max);
        System.out.println("min = " + min);


        int [] num3 = {1,2,3,4,5,};
        int [] num4 = {6,7,8,9};

        int lengthOfTwo = num3.length+num4.length;
        int [] num7 = new int [lengthOfTwo];

        for (int i = 0; i <num3.length ; i++) {

            num7[i]=num3[i];

        }
        for (int j = 0; j <num4.length ; j++) {
            num7[j+(num3.length)]=num4[j];

        }

        System.out.println(Arrays.toString(num7));




        int [] num5 = {num3[0], num3[1], num3[2], num3[3], num3[4], num4[0], num4[1], num4[2], num4[3]};

        System.out.println(Arrays.toString(num5));

            }

}
