package cybertekschool.day52_Polymorphism_practice.books;

import java.util.Arrays;
import java.util.List;

public class PolymorphicBookCounting {

    public static void main(String[] args) {


        PaperBook b1 = new PaperBook("Java", "Akbar", 3);
        Book b2 = new PaperBook("Selenium", "Vasyl", 2);
        Book b3 = new AudioBook("Agile", "G.jannat", 1.8);
        Book b4 = new PaperBook("The Kite Runner","b3.", 4 );
        Book b5 = new PaperBook("The Lord Of the Rings", "J.R.R Tolkien", 200);
        Book b6 = new AudioBook("Game of Thrones", "George R.R. Martin", 95.6);

        List<Book> bookList= Arrays.asList(b1,b2,b3,b4,b5,b6);

        //Counting how many Paperbook we have
        int pCount=0;
        for ( Book each: bookList  ) {
            //each.displayInfo();
            String className = each.getClass().getSimpleName();
            System.out.println(  className  );

            if (className.equals("PaperBook")){
                ++pCount;
            }
        }

        System.out.println("Paper Book count is : "+pCount);
        //we want to get the class type name using the object
        //obj.getClass().getSimpleName()

    }

}
