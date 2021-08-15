package cybertekschool.day52_Polymorphism_practice.books;

public class PaperBook extends Book implements Readable {

    int weight;

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight=weight;
    }

    @Override
    public void displayInfo() {

        System.out.println("Paper book's name is "+name+", nad the author is "+author+
                ", and it weighs "+weight+" pounds!");

    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNotes() {
        System.out.println("Bookmarking and Taking note from "+name);
    }

    @Override
    public void read() {
        System.out.println("Reading the "+name+" written by "+author);
    }
}
