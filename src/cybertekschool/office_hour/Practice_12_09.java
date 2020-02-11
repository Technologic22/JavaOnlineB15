package cybertekschool.office_hour;

import java.util.Arrays;

public class Practice_12_09 {
    public static void main(String[] args) {

        int num = 9;
            num = 15;

        System.out.println(num);

        int nums  [] = new int[4];
        nums [0]=5;
        //I assign a value of num to 2 member of array
        nums [1]=num;
        nums [2]=25;
        nums [3]=22;
        //print info about array
        //toString () - method returns human readable info about array
        System.out.println(Arrays.toString(nums));
        System.out.println("How many numbers in array "+nums.length);
        //when we want to get some value from array , we provide index
        //1 its an index of 2nd value in array

        System.out.println(nums[1]);
        //if I want to get last value from the array
        System.out.println("Last value in array: "+nums[nums.length-1]);
        //how to find middle value

        System.out.println("Middle value in an array: "+ nums[nums.length/2]);


        int [] newNums = new int[]{1,3,4,5,7,};
        System.out.println("Middle vaalue is: " + newNums[newNums.length/2]);

        //how to find biggest number?
        int max = newNums[0];
        for (int index = 0; index < newNums.length; index++) {
            //if any value greater than current max
            if (newNums[index]>max){
                //change max variable to this value
                max=newNums[index];


            }


        }


    }
}
