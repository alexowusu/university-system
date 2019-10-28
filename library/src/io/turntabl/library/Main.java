package io.turntabl.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book book3 = new Book("kofi and ama","as54z",BookCategory.COMIC, BookState.LOST,"alex");
        Book book2 = new Book("ananse and the dog","as54z",BookCategory.ADVENTURE, BookState.AVAILABLE,"owusu");
        Book book1 = new Book("alidu and the goat","as54z",BookCategory.FICTION, BookState.BORROWED,"ofori");
        Book book4 = new Book("kofi andthe canoe","as54z",BookCategory.HISTORY, BookState.BORROWED,"patricia");
        Book book5 = new Book("kwame the sale boy","as54z",BookCategory.ADVENTURE, BookState.LOST,"forster");
        Book book6 = new Book("the mechant","as54z",BookCategory.FICTION, BookState.AVAILABLE,"doreen");
        Book book11 = new Book("school boys","as54z",BookCategory.HISTORY, BookState.AVAILABLE,"christiana");
        Book book7 = new Book("ww2","as54z",BookCategory.ADVENTURE, BookState.BORROWED,"angelina");
        Book book8 = new Book("slave trade","as54z",BookCategory.ADVENTURE, BookState.BORROWED,"francis");
        Book book9 = new Book("1948 riot","as54z",BookCategory.ADVENTURE, BookState.AVAILABLE,"kwame");
        Book book10 = new Book("the return of the king","as54z",BookCategory.ADVENTURE, BookState.AVAILABLE,"kofi");

        List<Book> books = Arrays.asList(book2, book1, book3, book4,book5,book6, book7, book8, book9,book10,book11);

           for (Book book:books){
               if(book.getCategory()== BookCategory.ADVENTURE){
                   System.out.println(book.getTittle());
               }
           }
        for (Book book:books) {
            if (book.getState() == BookState.BORROWED) {
                System.out.println(book.getTittle());

            }
        }

       // System.out.println(book);
        List<Book> borrowedBooks = Arrays.asList(book3, book4, book7, book11);

        Borrower borrower = new Borrower("owusu",123,"12/12/2019","12:23","15/11/2019", BorrowerType.CHILDREN, borrowedBooks);

        System.out.println("=========================== ");
        System.out.println("Name: " + borrower.getName());
        System.out.println("Books Borrowed: " );


        for (Book book : borrower.getBooks()){
            System.out.println("-> " + book.getTittle());
        }
        System.out.println("=========================== ");


//**********************printing borrowers*****************************
        List <Borrower> borrowerList = Arrays.asList(
                new Borrower("alex", 1247, "12/1/2019", "12:40", "15/4/2021", BorrowerType.PREMIUM, books)
                ,new Borrower("sam", 1246, "12/2/2019", "12:04", "15/4/2022", BorrowerType.CHILDREN, books)
                ,new Borrower("ofori", 1249, "12/3/2019", "12:54", "15/4/2023", BorrowerType.PREMIUM, books)
                ,new Borrower("shadrack", 1274, "12/5/2019", "12:34", "15/4/2024", BorrowerType.REGULAR, books)
                ,new Borrower("franklin", 1824, "12/7/2019", "12:14", "15/4/2025", BorrowerType.CHILDREN, books)
                ,new Borrower("david", 1274, "12/9/2019", "12:24", "15/4/2026", BorrowerType.PREMIUM, books)
                ,new Borrower("francis", 1624, "12/10/2019", "12:11", "15/4/2027", BorrowerType.CHILDREN, books)
                ,new Borrower("christiana", 1524, "12/11/2019", "12:15", "15/4/2028", BorrowerType.REGULAR, books)
                ,new Borrower("lexis", 1244, "1/10/2019", "12:13", "15/4/2029", BorrowerType.PREMIUM, books)
                ,new Borrower("dennis", 1324, "2/1/2019", "12:14", "15/4/2019", BorrowerType.CHILDREN, books)
        );

        printBorrower(borrowerList);

       List<Borrower> children = new ArrayList<>();

        for(Borrower childBorrower : borrowerList){
            if (childBorrower.getBorrowerType() == BorrowerType.CHILDREN){
                children.add(childBorrower);
            }
        }
        printBorrower(children);

        List <String> childrenNames = new ArrayList<>();

        for(Borrower childBorrower : children){
            childrenNames.add(childBorrower.getName());
        }

        for(String name : childrenNames){
            System.out.println(name);

        }
        Borrower minBId = borrowerList.stream().filter(b->b.getBorrowerType()== BorrowerType.CHILDREN).min(Comparator.comparing(Borrower::getId)).get();
        System.out.print(minBId.getName());
    }


    private static void printBorrower(List<Borrower> borrower) {
        System.out.println(borrower);
        System.out.println(borrower.size());
    }
}
