package cybertekschool.day44_StatiecField_InheritanceIntro;

public class PersonAction {
    public static void main(String[] args) {
        Person p1 = new Person("Leyla", 3);
        p1.species= "Human";
        System.out.println("p1 = " + p1);

        Person p2 = new Person("Aynur", 7);
        p2.species="Humanoid";
        System.out.println("p2 = " + p2);

        Person p3= new Person("Selbi,", 10);
        System.out.println("p3 = " + p3);


        // what is the correct way to access static member of the class : STATIC WAY !!!
        System.out.println("Person.species = " + Person.species);



    }
}
