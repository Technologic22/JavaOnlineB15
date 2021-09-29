package cybertekschool.day55_Oop_review_Casting_HasA;

public class Calculator {

   private int result;

    public Calculator minusNum(int num){
        this.result-=num;
        return this;
    }

    // addNum is a method to add numbers to current result
    //and return the same Calculator Obj.
    //this will allow method chaining
    //we can keep calling the method with the same object
    //obj.add(100).add(50).add(150);
    //only one object.  multiple method calls with chaining
    //this is called Builder Pattern in Java

   //'this' represents the current object here: c1
   //If we change return type to current object then:

    public Calculator addNum(int num){
        //modify current object attribute
        this.result+=num;
        //below code will create new object different than the current object
        // Calculator c = new Calculator();
        // return c;
        //----------//------------
        //in order to return to just return current object after adding number
        //we can use this   --->>> THE CURRENT Object We r working On!
        //it will return the same object u used to call this method
        //it will allow method chaining using the same object
        // this refers to current object that is why it doesn't complain

        return this;
    }

    public void displayResult(){
        System.out.println("Final result is: "+result);

    }

}
