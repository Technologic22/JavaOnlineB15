package cybertekschool.day45_Constructor_In_Inheritance;

public class Earth extends Planet {

    int population;

    public Earth(int population) {
        this.population = population;
    }

    /**
     * Practical USAGE of Super() Keyword to call Super Class Constructor is
     * to reuse the functionality of super class constructor in subClass Constructor
     */
    public Earth(double gravity, int radius, boolean hasLife, int population) {
        super(gravity, radius, hasLife);
        this.population = population;
    }


    public static void main(String[] args) {
        Earth e1= new Earth(9.8, 5000, true, 7500000);
        System.out.println("e1 = " + e1);
    }

    //ADDING toString Method so we can print out object

    @Override
    public String toString() {
        return "Earth{" +
                "population=" + population +
                ", gravity=" + gravity +
                ", radius=" + radius +
                ", hasLife=" + hasLife +
                '}';
    }
}
