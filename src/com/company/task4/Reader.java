package com.company.task4;

public class Reader{
    private final String FIO;
    private final String ticketNumber;
    private final String faculty;
    private final String dateOfBirth;
    private final String telephoneNumber;

    public Reader(String FIO, String ticketNumber, String faculty, String dateOfBirth, String telephoneNumber) {
        this.FIO = FIO;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.telephoneNumber = telephoneNumber;
    }

    public void takeBook(int bookNumber) {
        System.out.println(FIO + " взял " + bookNumber + " книги");
    }

    public void takeBook(String ... bookName) {
        System.out.print(FIO + " взял книги: ");
        for (int i = 0; i < bookName.length - 1; i++) {
            System.out.print(bookName[i] + ", ");
        }
        System.out.println(bookName[bookName.length - 1] + ".");
    }

    public void takeBook(Book ... book) {
        System.out.print(FIO + " взял книги: ");
        for (int i = 0; i < book.length - 1; i++) {
            System.out.print(book[i].getName() + ", ");
        }
        System.out.println(book[book.length - 1].getName() + ".");
    }

    public void returnBook(int bookNumber) {
        System.out.println(FIO + " вернул " + bookNumber + " книги");
    }

    public void returnBook(String ... bookName) {
        System.out.print(FIO + " вернул книги: ");
        for (int i = 0; i < bookName.length - 1; i++) {
            System.out.print(bookName[i] + ", ");
        }
        System.out.println(bookName[bookName.length - 1] + ".");
    }

    public void returnBook(Book ... book) {
        System.out.print(FIO + " вернул книги: ");
        for (int i = 0; i < book.length - 1; i++) {
            System.out.print(book[i].getName() + ", ");
        }
        System.out.println(book[book.length - 1].getName() + ".");
    }
}
