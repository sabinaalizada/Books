package Entities;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(){
        books=new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void ShowBooks(){
        for (Book item: books){
            item.fullInfo();
        }

    }

}
