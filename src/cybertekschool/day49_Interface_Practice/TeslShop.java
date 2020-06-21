package cybertekschool.day49_Interface_Practice;

public class TeslShop {
    public static void main(String[] args) {
        Tesla t1=new Tesla("CyberTruck", 2020, 390);

        System.out.println(t1.model);
        t1.start();
        t1.selfDrive();
        t1.chargedDaily();
        t1.goForward();
        t1.isEnvironmentFriendly();

        System.out.println("t1 = " + t1);
    }
}
