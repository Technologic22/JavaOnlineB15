package cybertekschool.day08_;

public class MultiBranchIfStatment2 {
    public static void main(String[] args) {





        int currentSpeed =70;

        if (currentSpeed > 70) {
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
