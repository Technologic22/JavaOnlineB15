package cybertekschool.day44_StatiecField_InheritanceIntro;

public class HouseBuilder {
    public static void main(String[] args) {

        CyberHouse.showNeighborhood();
        CyberHouse c1= new CyberHouse("Bungalow", 22);
        c1.showAllInfo();

        CyberHouse c2= new CyberHouse("Classic", 33);
        c1.showAllInfo();

        //System.out.println(CyberHouse.showNeighborhood());

        // How do I get max value of Short
        System.out.println(Short.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);


    }
}
