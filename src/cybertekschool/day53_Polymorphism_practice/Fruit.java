package cybertekschool.day53_Polymorphism_practice;

public abstract class Fruit {

    String taste;
    String color;

    public Fruit(String taste, String color) {
        this.taste = taste;
        this.color = color;
    }

    public abstract void getDigested();


}
