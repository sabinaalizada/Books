import Entities.Book;
import Entities.Library;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1=new Book("A Clockwork Orange","Anthony Burgess","Eng",3,45);
        Book book2=new Book("As I Lay Dying","William Faulkner","Tr",10,66);
        Book book3=new Book("Tender Is the Night","F. Scott Fitzgerald","Gr",7,50);
        book1.fullInfo();
        book2.fullInfo();
        book3.fullInfo();

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.ShowBooks();

    }
}