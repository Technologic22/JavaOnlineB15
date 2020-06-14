package cybertekschool.day45_Constructor_In_Inheritance;


    public class Dog extends Animal{


        @Override
        public void speak(){

            System.out.println("Bark!!");
           }

        public static void main(String[] args) {
            Dog twix= new Dog();
            twix.speak();
        }
    }

