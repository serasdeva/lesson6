import java.util.Arrays;

public class Book {
    String nameBook;
    String nameAuthor;

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void getNameAuthor() {
        String[] nameAuthors = this.nameAuthor.split(": ");
        if (nameAuthors.length > 1){
            System.out.println("Авторы " + Arrays.toString(nameAuthors));
        } else {
            System.out.println("Автор " + Arrays.toString(nameAuthors));
        }
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public Book(String nameBook, String nameAuthor) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + this.nameBook + '\'' +
                ", nameAuthor='" + this.nameAuthor + '\'' +
                '}';
    }

}
