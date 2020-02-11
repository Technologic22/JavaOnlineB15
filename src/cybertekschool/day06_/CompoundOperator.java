package cybertekschool.day06_;

public class CompoundOperator {
    public static void main(String[] args) {


        //assignment operator = will save the result of whatever operation on the right side
        //and assign the result to the left side variable

        int studentOnline = 263;
        studentOnline = studentOnline + 5;

        System.out.println("5 people joined" + studentOnline);

        studentOnline = studentOnline - 3;
        System.out.println("3 students left " + studentOnline);
        studentOnline = studentOnline*2;

        System.out.println("student number doubled " + studentOnline);

        studentOnline = studentOnline/3;

        System.out.println("one third of the students dropped, number left is  " + studentOnline);


    }
}
