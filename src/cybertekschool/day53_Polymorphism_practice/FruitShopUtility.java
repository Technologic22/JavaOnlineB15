package cybertekschool.day53_Polymorphism_practice;

public class FruitShopUtility {

    public static void main(String[] args) {

        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);

        displayFruit(f1);
        displayFruit(f2);
    }

    //sell Fruit
    public static void displayFruit(Fruit anyFruit){
        System.out.println("Displaying fruit \n" +anyFruit.toString());
    }
    //displayFruits
    //buyFruit


}
