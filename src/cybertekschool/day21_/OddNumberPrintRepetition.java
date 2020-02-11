package cybertekschool.day21_;

public class OddNumberPrintRepetition {
    public static void main(String[] args) {
        /*
        count from 1 to 10 --> print only odd numbers
        repeat 4 times
        */
        for (int i = 1; i <=4 ; i++) {
            System.out.println("Iteration : "+ i);

            for (int y = 1; y <=10 ; y++) {

                if (y%2==1){
                    System.out.print(y+ " - ");
                }

            }
            System.out.println();
        }

    }
}
