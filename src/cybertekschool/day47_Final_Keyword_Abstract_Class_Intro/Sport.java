package cybertekschool.day47_Final_Keyword_Abstract_Class_Intro;

//Can Not extend final class
//public final class Sport extends String{ - String is final!!!
public class Sport {
    //final method can not be overridden in subclass
    //it can be used as is in subclass
    //just like family tradition, it should stay the same in generations to come
    public final void doSomething(){
        System.out.println("doing regular sport");
    }

    public void doSomethingElse(){
        System.out.println("something else");
    }
}
