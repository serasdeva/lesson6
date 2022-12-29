import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader(
                "Ivanov Ivan Ivanovich",
                1,
                "IT",
                "01/01/1991",
                "9994591526");
        Reader reader2 = new Reader(
                "Demander Alex Mnemonic",
                2,
                "IT",
                "02/02/1991",
                "9893571550");

        Book bookOne = new Book("Мастер и Маргарита", "Булгаков");
        Book bookTwo = new Book("Словарь", "Жуков: Орехов: Стоянов");
        Book bookThree = new Book("Война и мир", "Лев Николаевич Толстой");

        reader1.takeBook(bookOne);
        reader1.takeBook(bookTwo);
        reader1.takeBook(bookThree);

        reader1.returnBook("Словарь");
        reader1.getBooks();
        reader1.takeBook(reader1.books.size());
        reader1.returnBook();

        reader2.takeBook(bookOne);
        reader2.takeBook(bookTwo);
        reader2.takeBook(bookThree);

        reader2.returnBook("Словарь");
        reader2.getBooks();
        reader2.takeBook(reader2.books.size());
        reader2.returnBook();

    }
}