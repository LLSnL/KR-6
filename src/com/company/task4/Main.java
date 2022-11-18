package com.company.task4;

public class Main {
    public static void main(String[] args) {
        Book a = new Book("Энциклопедия", "Попов В.А.");
        Book b = new Book("Словарь", "Золотов К.В.");
        Book c = new Book("Приключения", "Пушин А.А.");

        Reader reader = new Reader("Алексеев В.В", "921-421", "ИТТСУ",
                "19.10.2000", "9-987-654-32-10");

        reader.takeBook(3);
        reader.takeBook("Энциклопедия", "Слово");
        reader.takeBook(a, b, c);
        reader.returnBook(4);
        reader.returnBook("Словарь", "Приключения");
        reader.returnBook(a, c);
    }
}
