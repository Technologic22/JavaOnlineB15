package cybertekschool.day52_Polymorphism_practice.books;

public interface KnowledgeBank {

    public abstract void takeNotes();

    public default void showTAbleOfContent(){
        System.out.println("Chapter 1 till chapter 10: U do the rest");
    }

}
