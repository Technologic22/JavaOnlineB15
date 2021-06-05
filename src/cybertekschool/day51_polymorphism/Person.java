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

    //Method modified to make natural order comparing by name using 2nd Character

    @Override
    public int compareTo( Person otherPerson) {
//        if (this.name.charAt(1) > otherPerson.name.charAt(1)) {
//            return 1;
//        } else if (this.name.charAt(1) < otherPerson.name.charAt(1)) {
//            return -1;
//        } else {
//            return 0;
//        }
//
        //since String is already comparable itself, it has method to already compare
        // 2 string objects, so we are just directly using it

        return this.name.compareTo(otherPerson.name);
      }





    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
