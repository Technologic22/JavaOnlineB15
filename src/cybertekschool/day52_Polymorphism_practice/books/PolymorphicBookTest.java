package cybertekschool.day52_Polymorphism_practice.books;

public class PolymorphicBookTest {

    public static void main(String[] args) {

            //We can refer the paper book object using
            //=-- using its OWN Type: Paperbook;
            //--- or it's SUPER Type : Book, Readable, KnowledgeBank, Object

        PaperBook b1 = new PaperBook("Java", "Akbar", 3);
        b1.displayInfo();

        //this is the very similar idea as putting the small coffee cup into grande cup
        KnowledgeBank kb=b1;
        kb.takeNotes();
        kb.showTAbleOfContent();

        System.out.println("___-------------__________________-------------___");

        Book b3 = new AudioBook("Agile", "G.jannat", 1.8);
        b3.showTAbleOfContent();
        b3.displayInfo();
        System.out.println("b3 = " + b3);

        Book b2 = new PaperBook("Selenium", "Vasyl", 2);
        Book b4 = new PaperBook("The Kite Runner","b3.", 4 );
        Book b5 = new PaperBook("The Lord Of the Rings", "J.R.R Tolkien", 200);
        Book b6 = new AudioBook("Game of Thrones", "George R.R. Martin", 95.6);


    }

}
