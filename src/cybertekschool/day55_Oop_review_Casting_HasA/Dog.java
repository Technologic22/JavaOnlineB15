package cybertekschool.day55_Oop_review_Casting_HasA;

public class Dog {

    String type;

    public Dog(String type) {
        this.type = type;
    }

    public void bark() {
        System.out.println(type + " Dog is barking");
    }
}
