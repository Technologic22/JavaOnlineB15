package cybertekschool.day34_;

public class MathActionFromJDK {
    public static void main(String[] args) {

        ///where is String class coming from??
        // its coming from package called 'java.lang'
        //its a special package
        //and any class in it doesnt need importing when being used
        //fr exmp String class

        //what if I really want to import it explicitly
        //import java.lang.String

        String str = "Hello";

        //There is a class under java.lang called Math
        //and it has lots of math utility methods that ready to be used
        Math.addExact(10,20);


    }
}
