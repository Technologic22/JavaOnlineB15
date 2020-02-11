package cybertekschool.day34_;

public class IntroMethodOverloading {
    public static void main(String[] args) {


        System.out.println("Method  overloading");
        System.out.println(12);
        ///01234567890
        String name = "Overloading";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1, 4));

        //two version of indexOf method (there are 4!)
        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o",2));
        ///Arrays.toString has 9 different version to accept different parameters

        //Method Overloading :
        //using same name and different parameter for methods
        //to reuse the name for similar actions

    }

    public static void sayHello(){
        System.out.println("Hello, World");
    }
    public static void sayHello (String name){
        System.out.println("Hello, "+name);
    }
    public static void sayHello (int num){
        System.out.println("Hello, "+num);
    }

    //this is regarded as same method as above method
    // public static void sayHello (int X)

}
