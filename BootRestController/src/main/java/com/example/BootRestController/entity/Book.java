package com.example.BootRestController.entity;

public class Book {

    private Long id;
    private String title;
    private String author;
    private Double price;


    public Book(){

    }

    public Book(Long id,String title,String author,Double price){
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
