package cybertekschool.day46_Method_Overriding;

public class JavaProgrammer extends Programmer{


    @Override
    void code(){
        System.out.println("I code Java!");
        super.code();
    }

    @Override
    void test(){
        System.out.println("We DO Test In Junit!");
        super.test();
    }

    public void drinkCoffee(){
        System.out.println("Java programmers drink lots of coffee!");
    }

    public void doJavaDevelopment(){
        System.out.println("Javba Programmers write lots of code!");
    }
}
