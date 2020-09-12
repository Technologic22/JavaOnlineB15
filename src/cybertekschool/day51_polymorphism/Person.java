package cybertekschool.day51_polymorphism;


//Persin IS-A Comparable
//yes it is because it implements comparable interface
//Its an inheritance | IS-A | Super-Sub Relationship
public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    //now this become natural order for comparing Person Object
//   @Override
//    public int compareTo( Person otherPerson){
//    if (this.age>otherPerson.age){
//        return 1;
//    }else if (this.age<otherPerson.age){
//        return -1;
//    }else{
//        return 0;
//    }
//
//    }

    //Method modified to make natural order comparing by name
    @Override
    public int compareTo( Person otherPerson) {
        if (this.name.charAt(1) > otherPerson.name.charAt(1)) {
            return 1;
        } else if (this.name.charAt(1) < otherPerson.name.charAt(1)) {
            return -1;
        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
