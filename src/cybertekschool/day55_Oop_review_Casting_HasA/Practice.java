package cybertekschool.day55_Oop_review_Casting_HasA;

// we learned that super(...) always should be the first line of the constructor
//what about 'this();': used to call current class's constructor to reuse its code
                    //  it should be always in first statement
                    //just like super(); we can only call it once
                    // and can not be used together with super(...)
                    // once this(); used, super(); will noty be added by compiler


public class Practice {


    //any object created using this constructor
    //should call Practice (int x) constructor with value 100
    public Practice(){
        this(100);
        System.out.println("no arg constructor");
    }

    //any object U created using constructor must call no arg constructor first
    //first line of any constructor is: super();  keyword
    public Practice(int x){
        //super();
        //this();
        System.out.println("1 arg constructor"+x);
    }

    public Practice(String str){
        //how do I call each constructor
        //this();  - 1st one
        //this(100); - 2nd one
        //this(str); - 3rd one

        System.out.println( "1 arg constructor with String "+str);
    }

    public static void main(String[] args) {
        //program flow when we run: Line 23-->7-->8-->15-->18-->7-->9
        Practice t = new Practice();
    }
}
