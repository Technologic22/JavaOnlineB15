package cybertekschool.day09_;

public class DayPrinter {
    public static void main(String[] args) {

        /*
         * if daycode is 1 --> Monday
         * if daycode is 2 --> Tuesday
         * if daycode is 3 --> wednesday
         * if daycode is 4 --> thursday
         * if daycode is 5 --> friday
         * if daycode is 6 --> saturday
         * if daycode is 7 --> sunday
         * if none of the above just print unknown day
         * */


        int dayCode = 55;




        ///// LLLOOOOONG WAY

        if (dayCode == 1) {
            System.out.println("today is : Monday");

        } else if (dayCode == 2) {
            System.out.println("today is : Tuesday");
        } else if (dayCode == 3) {
            System.out.println("today is : Wednesday");
        } else if (dayCode == 4) {
            System.out.println("today is : Thursday");
        } else if (dayCode == 5) {
            System.out.println("today is : Friday");
        } else if (dayCode == 6) {
            System.out.println("today is : Saturday");
        } else if (dayCode == 7) {
            System.out.println("today is : Sunday");
        } else {
            System.out.println("Day is unknown");
        }


    }
    }

