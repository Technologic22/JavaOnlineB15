package cybertekschool.day08_;

public class MultiBranchIfSttmt {
    public static void main(String[] args) {

        /*
        *given your currenSpeed,SpeedLimit
        *check currentspt is more than 90  --->> jail
       *more than 80and less than 90 --->> reckless driving
        *---start from here above two optional
         * *more than 70 and less than 80 --->> point
        *more than 60 and less than 70 -->> warning
        *if no speeding keep driving
        */

        int currentSpeed =55;


        if (currentSpeed>90){
            System.out.println("go to jail!!");
        } else if (currentSpeed>80){
            System.out.println("reckless driving");
        }else if (currentSpeed > 70) {
            System.out.println("points taken!");
            //asking whether current speed less than 70 and more than 60
            //at this point, your speed is no more than 70
        }else if (currentSpeed>60) {
            System.out.println("Be careful, You are speeding!!!");
        }else{
            System.out.println("keep driving!!");
        }

    }
}
