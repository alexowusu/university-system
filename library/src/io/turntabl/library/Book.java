package io.turntabl.library;

public class Book {
    private String tittle;
    private String isbn;
    private BookCategory category;
    private BookState state;
    private String Authur;

    public Book(String tittle, String isbn, BookCategory category, BookState state, String authur) {
        this.tittle = tittle;
        this.isbn = isbn;
        this.category = category;
        this.state = state;
        Authur = authur;
    }

    public String getTittle() {
        return tittle;
    }

    public String getIsbn() {
        return isbn;
    }

    public BookCategory getCategory() {
        return category;
    }

    public BookState getState() {
        return state;
    }

    public String getAuthur() {
        return Authur;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", isbn='" + isbn + '\'' +
                ", category=" + category +
                ", state=" + state +
                ", Authur='" + Authur + '\'' +
                '}';
    }
}

