package cybertekschool.day43_Const_Encap_Cust_Type;


public class StarbucksUtil {
    public static void main(String[] args) {

        Coffee c1=new Coffee("Mocha", 7, 3.4);

        printCoffeInfo(c1);
        Coffee c2=new Coffee("Frappe");
        stringCharacter(c2.getType());

// you can either store Coffee object into a variable like above
        // of your can directly pass a coffee object without storing it

        stringCharacter(new Coffee("Intensito", 8).getType());

        //        // we would need an object of current class if we wanted call
//        // instance method of current class
//        StarbucksUtil util = new StarbucksUtil();
//        util.printStringInfo(myString);
    }

    /**
     * a static method to accept a coffee object and print it's information
     * like this : This coffee is : name , price is <price> , caffine level is <level>
     *
     * @param // the coffee object caller pass
     */
    public static void printCoffeInfo (Coffee coffee){

//        coffee.setType("Mocha");
//        coffee.setPrice(3.2);
//        coffee.setCaffeineLevel(7);
        System.out.println("This Coffee is "+coffee.getType()+"\n"+
                "Price is: "+coffee.getPrice()+"\n"+
                "Caffeine Level is: "+coffee.getCaffeineLevel());
    }

/**
 * a static method to print out first and last character of a String
 *
 * @param str
 */
    public static void stringCharacter(String str){
        System.out.println("First Char: "+str.charAt(0)+"\n last Char: "+str.charAt(str.length()-1));
    }

}
