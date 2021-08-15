package cybertekschool.day52_Polymorphism_practice.books;

public abstract class Book implements KnowledgeBank {    //to implement Book class, right click on "Book" --> Show Context actions -->
    //implement abstract class
    String name;
    String author;

    public Book (String name, String author){
        this.name=name;
        this.author=author;
    }

    public abstract void displayInfo();


}
