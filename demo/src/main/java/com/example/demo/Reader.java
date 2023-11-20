package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "readers")
public class Reader {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private List<String> borrowedBooks;


    // Constructor
    public Reader(String firstName, String lastName, String email, List<String> borrowedBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.borrowedBooks = borrowedBooks;
    }

    // Getters y Setters (para todos los atributos)

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBorrowedBooks(List<String> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    // Otros métodos relevantes

    @Override
    public String toString() {
        return "Reader{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email=" + email +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }

}
