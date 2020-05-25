package cybertekschool.replPractice;
import java.util.*;
public class CoreJava {
    public static void main(String[] args) {

int [] num1 = new int []{4,5,6,7};
//int [] num2 = new int []{4,5,6,7};

int [] num2;
num2=num1;

num1[1]=25;
num2[3]=49;
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));

    }
}
