package cybertekschool.day08_;

public class IfStatement {
    public static void main(String[] args) {


        int speedLimit = 60;
        int currentSpeed = 45;
        boolean IamSpeeding  = currentSpeed>speedLimit;
         //inside paranthesis we can only put
         //boolean value : true false
         //boolean variable
         //any axpression that return boolean value


        //if (IamSpeeding)
        //if (true)
        if (currentSpeed>speedLimit)
        {
            System.out.println("Pulled Over By Police ");
            System.out.println("Ticket Issued");
            System.out.println("Some Points ");
            System.out.println("Go to court!! ");
        }else {
            System.out.println("Buy Icecream");
            System.out.println("Go to shopping!!");
            System.out.println("Enjoy your day!");
        }

        System.out.println("THE END");
        // why we always say "the end"
    }
}
