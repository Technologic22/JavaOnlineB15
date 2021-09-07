package cybertekschool.day53_Polymorphism_practice;

public class Orange extends Fruit {

    int vcLevel;

    public Orange(String taste, String color, int vcLevel) {
        super(taste, color);
        this.vcLevel=vcLevel;
    }

    @Override
    public void getDigested() {
        System.out.println("Orange with Vitamin C level "+vcLevel+" has color "+
                color+" and it has "+ taste+ " taste when U digest it");
    }

    @Override
    public String toString() {

        return "Orange{" +
                "vcLevel=" + vcLevel +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';

    }
}
