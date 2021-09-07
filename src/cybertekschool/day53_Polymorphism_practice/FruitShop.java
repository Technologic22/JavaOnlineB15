package cybertekschool.day53_Polymorphism_practice;

public class FruitShop {

    //Only reference type Decide what U can access at compile time
    //if we have Fruit as ref Type, getDigested method will point to the one under Fruit class
    //Actual Object type decide what method  will be called at run time
    //since actual Object is Apple/Orange, at runtime it will call overridden version of the method
    //and that is the power of Polymorphism, making the correct decision at runtime according to the actual Object


    public static void main(String[] args) {

        Apple a1 = new Apple("sweet", "red", "Fuji");

        //what can I access using reference variable a1
        //a1 has an Apple as reference type. so we can access anything inside apple

        System.out.println("a1.tastee "+ a1.taste);
        System.out.println("a1.colour "+ a1.color);
        System.out.println("a1.type "+ a1.type);

        a1.getDigested();

        System.out.println("------------------------------------------------");
        Fruit f1 = a1;   //f1 is  new Apple("sweet", "red", "Fuji");
        // reference type decides what we can access,
        // so here we can only access to f1.taste and
        // f1.color but not the 'type' (which is apple class's attribute)
        //In order f1 to access to 'type' we need to assign it as an 'apple'
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
        //f1.type // we can not access it since it is referred as Fruit
        //if Friut doesnt have get.digested method, below will not compile
        //because ONLY REFERENCE type decides what U can Access

        f1.getDigested();      //new Apple("sweet", "red", "Fuji").getDigested();

        f1=new Orange("sour-sweet", "redish", 11);

        System.out.println(f1.toString());


        String str = null;
       // System.out.println(str.charAt(0));    //It compiles successfully because it is
                                                // pointing to some method container, but it will give runtime error
        //System.out.println(str.bark());     //It doesnt compile even because String class has no bark or getDigested method
        //System.out.println(str.getDigested());


        Fruit f2 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f3 = new Orange("sour", "orange", 12);
        Fruit f4 = new Orange("very sweet", "Blood Red", 10);



        Fruit[] myFruits = {f1,f2,f3,f4};

        for (Fruit each : myFruits) {


        }



    }
}
