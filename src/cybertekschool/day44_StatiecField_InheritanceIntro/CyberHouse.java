package cybertekschool.day44_StatiecField_InheritanceIntro;

public class CyberHouse {
    private String design;
    private int houseNum;

    // we can change default value of the fields
    // by assigning value directly in the template class
    static String neighborhood="Cybertek Avenue";
    // constructor  can access anything
    public CyberHouse(String design, int houseNum){
        this.design=design;
        this.houseNum=houseNum;
    }
        //instance method can access anything
    public void showAllInfo(){
        System.out.println("design = " + design+ ", House Number = "+houseNum+", Neighborhood = "+neighborhood);
    }
    // static method can only access static members of same class
    public static void showNeighborhood(){
        System.out.println("neighborhood = " + neighborhood);
        // CAN NOT ACCESS ANYTHING NON-STATIC INSIDE STATIC METHODS
        //System.out.println("houseNum = " + houseNum);
    }

}
