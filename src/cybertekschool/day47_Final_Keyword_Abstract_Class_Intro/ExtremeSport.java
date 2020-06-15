package cybertekschool.day47_Final_Keyword_Abstract_Class_Intro;

public class ExtremeSport extends Sport {

    //can not override
    //but U can do anything else
    //s.a.: Overload it...
    public void doSomething(int x){
        super.doSomething();
        System.out.println("doing extreme sport");
    }

    @Override
    //this final keyword
    //blocking sub class of Extremesport to override this method
    //public final void doSomethingElse(){
            public void doSomethingElse(){
        System.out.println("doing something Extreme");
    }
}
