package cybertekschool.day19_;

public class ForLoopStairCase {
    public static void main(String[] args) {

        //    *
        //    * *
        //    * * *
        //    * * * *

        //        star = star + "* " ;
        //        System.out.println(star);
        //
        //        star = star + "* " ;
        //        System.out.println(star);
        //
        //        star = star + "* " ;
        //        System.out.println(star);
        //
        //        star = star + "* " ;
        //        System.out.println(star);
            String star = "";

            for (int i = 1; i <= 4; i++) {

                star = star + "* ";
                //star += "* ";
                System.out.println(i + " " + star);

            }



    }
}
