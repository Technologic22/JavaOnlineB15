package cybertekschool.day45_Constructor_In_Inheritance;

// If we dont explicitly (visibly, manually)extend another class
//we always automatically extend to Object Class
//Object class is super class of all the classes in Java
public class Book extends Object{

    public static void main(String[] args) {
        Book b1= new Book();
        System.out.println("b1 = " + b1.toString());
    }
    @Override //Annotation is making it obvious to declare we r rewriting the inherited super class method
    public String toString(){
        return "My own version of toString Method";
    }
}
