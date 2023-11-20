package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "loans")
public class Loan {
    @Id
    private String id;
    private String bookId;
    private String readerId;
    private Date loanDate;
    private Date returnDate;
    private boolean returned;

    // Constructor
    public Loan(String bookId, String readerId, Date loanDate, Date returnDate, boolean returned) {
        this.bookId = bookId;
        this.readerId = readerId;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.returned = returned;
    }

    // Getters y Setters (para todos los atributos)

    public String getId() {
        return id;
    }

    public String getBookId() {
        return bookId;
    }

    public String getReaderId() {
        return readerId;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    // Otros métodos relevantes

    @Override
    public String toString() {
        return "Loan{" +
                "id='" + id + '\'' +
                ", bookId='" + bookId + '\'' +
                ", readerId='" + readerId + '\'' +
                ", loanDate=" + loanDate +
                ", returnDate=" + returnDate +
                ", returned=" + returned +
                '}';
    }

}
