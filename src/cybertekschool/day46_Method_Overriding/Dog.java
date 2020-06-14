package cybertekschool.day46_Method_Overriding;


import cybertekschool.day45_Constructor_In_Inheritance.Animal;

public class Dog extends Animal {

        //Why do we want to call super class version of Overridden method
        //we want to build on top of whats already written
        //code reuse
        //parent provide step abc, child wants to do abcdefg
        //so instead of repeating abc, child can directly call super class version of method
        @Override
        public void speak(){
            // 'super.' - can be used to specify we r calling super class version of the method!
           // can we use super. or this. outside of instance method - BIG NO!!!
           //can only be used only inside instance method
            super.speak();
            System.out.println("Bark!!");
            super.speak();
            super.speak();
        }

        public static void main(String[] args) {
            Dog twix= new Dog();
            twix.speak();
        }
    }

