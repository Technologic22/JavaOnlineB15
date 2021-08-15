package cybertekschool.day52_Polymorphism_practice.books;

public class AudioBook extends Book {

    double duration;

    public AudioBook(String name, String author, double duration) {

        super(name, author);
        this.duration=duration;
    }

       //this is abstract method implementation from book class
    @Override
    public void displayInfo() {
        System.out.println("The name of Audiobook is "+name+"" +
                " and the author is "+author+", " +
                "the duration is "+duration+" mins");
    }

      // this is abstract method implementation from KnowledgeBank Interface
    @Override
    public void takeNotes() {
        System.out.println("Taking notes on the digital book by "+name+" writing the provided digital table ");
    }

    // this is abstract method implementation from KnowledgeBank Interface
    @Override
    public void showTAbleOfContent() {
        System.out.println("If U wanna see the Table of Contents of "+name+" by "+author+" press...");
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
