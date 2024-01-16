package Entities;

import javax.lang.model.element.Name;

public class Book {
    public String name;
    public String author;
    public String language;
    public int count;
    public int price;
    private int id;
    private static int _id;
    public Book(String Name,String Author,String Language,int Count, int Price){
        _id++;
        id=_id;
        name=Name;
        author=Author;
        language=Language;
        count=Count;
        price=Price;
    }

    public void fullInfo(){
        System.out.println("Id:"+ id + " Name:"+ name + " Author:" + author + " Language:" + language + " Count:" + count + " Price" +price);
    }
}
