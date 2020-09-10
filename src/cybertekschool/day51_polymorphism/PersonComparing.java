package cybertekschool.day51_polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparing {

    public static void main(String[] args) {

        Person p1=new Person("Leyla", 7);
        Person p2=new Person("Aynur", 3);
        Person p3=new Person("Selbi", 10);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1.compareTo(p2)); //we compare the objects in terms of age
        int result= p2.compareTo(p3);
        System.out.println("result = " + result);

        //Can we directly provide Person Object with new keyword?1!

        System.out.println(p3.compareTo(new Person("Aman", 13)));

        //print out the name of younger person between p1 and p3
        //it's asked to use compareTo methgod we just created

        if (p1.compareTo(p3)==1){
            System.out.println(p3.name);
        }else {
            System.out.println(p1.name);
        }

        List <Person> lst=new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(new Person("Shatlyk", 13));
        System.out.println("lst = " + lst);

     //   Collections.sort(lst);



        //compare p1 and p2 bye age
        //if p1 is older print 1
        //if p2 is older print -1
        //if they are at same age print O

//        if (p1.age>p2.age){
//            System.out.println(1);
//        }else if (p1.age<p2.age){
//            System.out.println(-1);
//        }else {
//            System.out.println(0);
//        }
    }
}
