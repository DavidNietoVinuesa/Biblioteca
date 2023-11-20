package com.example.demo;

public class Book {
    private Long id;
    private String title;
    private String author;
    private String ISBN;
    private int quantityAvailable;

    // Constructor sin argumentos requerido por JPA
    public Book() {
    }

    // Constructor con argumentos
    public Book(String title, String author, String ISBN, int quantityAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.quantityAvailable = quantityAvailable;
    }

    // Getters y Setters (para todos los atributos)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    // Otros métodos relevantes, como toString(), equals(), etc.
}
