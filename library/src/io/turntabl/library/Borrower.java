package io.turntabl.library;

import java.util.List;

public class Borrower {
    private String name;
    private int id;
    private String returnDate;
    private String takenTime;
    private String takenDate;
    private BorrowerType BorrowerType;
    private List<Book> books;

    public Borrower(String name, int id, String returnDate, String takenTime, String takenDate, io.turntabl.library.BorrowerType borrowerType, List<Book> books) {
        this.name = name;
        this.id = id;
        this.returnDate = returnDate;
        this.takenTime = takenTime;
        this.takenDate = takenDate;
        BorrowerType = borrowerType;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public String getTakenTime() {
        return takenTime;
    }

    public String getTakenDate() {
        return takenDate;
    }

    public io.turntabl.library.BorrowerType getBorrowerType() {
        return BorrowerType;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", returnDate='" + returnDate + '\'' +
                ", takenTime='" + takenTime + '\'' +
                ", takenDate='" + takenDate + '\'' +
                ", BorrowerType=" + BorrowerType +
                ", books=" + books +
                '}';
    }
}
