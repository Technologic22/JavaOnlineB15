package cybertekschool.day48_AbstractClass_Interface;

public class BouncingParty {

    public static void main(String[] args) {

        Kangaroo k1=new Kangaroo("Rocky", 8);
        System.out.println("k1 = " + k1);
        k1.bounce();
        k1.eat();

        Ball b1=new Ball("Round", "Gray");
        System.out.println("b1 = " + b1);
        b1.bounce();

        System.out.println(Bouncible.GRAVITY);
    }
}
