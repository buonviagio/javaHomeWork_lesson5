package homeWork_lesson7;

import java.awt.*;

public class ReaderTest {
    public static void main(String[] args) {

        Book book1 = new Book("Антон Павлович Чехов");
        Book book2 = new Book("Лев Николаевич Толстой");
        Book book3 = new Book("Михаил Булгаков");

        Reader Ivanov = new Reader("Сергей Иванов", "АБ1234", "Философия", "01.01.1990", "380661234567");

        Ivanov.takeBook( 3);
        Ivanov.takeBook("Война и Мир", "Рассказы", "Белая Гвардия");
        Ivanov.takeBook(book1, book2, book3);
    }
}
