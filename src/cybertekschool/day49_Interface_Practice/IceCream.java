package cybertekschool.day49_Interface_Practice;


public class IceCream extends Object implements Edible{

//--Who IS THE SUPERCLASS of IceCream class??
    //-- OBJECT CLASS

    @Override
    public void eat() {
        System.out.println("Eat with spoon!!!");
    }

    @Override
    public void drink() {
        System.out.println("drink it if it is melted!");
    }

    public static void main(String[] args) {

        IceCream i1=new IceCream();

        Object i2=new IceCream();   // generalization! Since OBJ class exists we can create Object of it
        i1.drink();
        i1.eat();
        System.out.println(i1.toString());
    }
}
