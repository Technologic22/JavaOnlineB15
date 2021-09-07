package cybertekschool.day53_Polymorphism_practice;

public class FruitShopUtility {

    public static void main(String[] args) {

        Fruit fx=  //new Orange("sweet", "yellowish", 2);
                   new Apple("crispy but tasteless", "hot red", "Gala");

        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);

        displayFruit(f1);
        displayFruit(f2);
        //can we directly pass any object that IS-A Fruit rather than saving it into a variable
        displayFruit(new Apple("tasteless", "red", "Golden"));

        digestBetter(f2);
        digestBetter(new Orange("sweet", "yellowish", 2));

        Fruit x = getMyFavouriteFruit();
        x.getDigested();   // what can be done with the "x"
        System.out.println("B15 Favourite Fruit = "+x);

        System.out.println("_________________getFavouriteByType  Call____________");
        System.out.println("getFavouriteByType 1 "+getFavouriteByType(1));
        System.out.println("getFavouriteByType 1 "+getFavouriteByType(2));
        System.out.println("getFavouriteByType 1 "+getFavouriteByType(3));

    }

    //Create a static method called getFavouriteByType
    //It has one int parameter
    //return Favourite apple obj if type is 1, orange if type 2
    public static Fruit getFavouriteByType(int type){
        if (type==1){
            return new Apple("tasteless", "red", "Golden");
        }else if (type==2){
            return new Orange("sweet", "yellowish", 2);
        }else {
            //we can return null for any method that return reference type
            //because null can be assigned to a reference type variable
            return null;
        }
    }


    //Create a static method called getMyFavouriteFruit
    // accept no parameter and return your Favourite Fruit Object
    public static Fruit getMyFavouriteFruit(){
        //Fruit f = new Orange("sweet", "greenish", 3);
        //Fruit f = new Apple("Sweet", "Blue", "Ginger");
        //return f;
        return new Apple("Sweet", "Blue", "Ginger");

    }


    //displayFruits
    public static void displayFruit( Fruit anyFruit){
        System.out.println("Displaying fruit \n" +anyFruit.toString());
    }


    //Create a static void method called digestBetter
    //it accept a Fruit as parameter type
    // and inside the method, it will digest the Fruit object 4 time then displayInformation
        public static void digestBetter(Fruit anyFruit){

//        //1st way!
//        for (int i = 1; i <= 4; i++) {
//                System.out.println("Fruit digested "+i+ " times" );
//            }

        //2nd way
            anyFruit.getDigested();
            anyFruit.getDigested();
            anyFruit.getDigested();
            anyFruit.getDigested();

            System.out.println(anyFruit.toString());
        }



    //sell Fruit
    //buyFruit



}