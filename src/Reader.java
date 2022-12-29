import java.util.*;

public class Reader {
    String fio;
    int numberReaderTicket;
    String faculty;
    String dateOfBirth;
    String phone;

    HashMap<String, String> books = new HashMap<>();
    // Stack<String> books = new Stack<>();


    public void getBooks() {
        for (Map.Entry entry : this.books.entrySet()) {
            if (this.books.size() > 1) {
                System.out.println("У " + this.fio + " на руках остались книги " + entry);
            } else {
                System.out.println("У " + this.fio + " на руках осталась книга " + entry);
            }
        }
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumberReaderTicket() {
        return numberReaderTicket;
    }

    public void setNumberReaderTicket(int numberReaderTicket) {
        this.numberReaderTicket = numberReaderTicket;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Reader(String book) {

    }


    public Reader(String fio,
                  int numberReaderTicket,
                  String faculty,
                  String dateOfBirth,
                  String phone) {

        this.fio = fio;
        this.numberReaderTicket = numberReaderTicket;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Reader { " +
                "FIO: " + fio + ", " +
                "Number Reader Ticket: " + numberReaderTicket + ", " +
                "Faculty: " + faculty + ", " +
                "Date Of Birth: " + dateOfBirth + ", " +
                "Phone: " + phone +
                " }";
    }

    public void takeBook() {
        System.out.println(this.fio + " взял книгу");
    }

    // - takeBook, который будет принимать количество взятых книг.
    // Выводит на консоль сообщение "Петров В. В. взял 3 книги".
    public void takeBook(int countBook) {
        // Псевдосклонение, сделал чисто для разнообразия, сама идея есть как сделать, но нужно время поразмыслить.
        if (countBook > 1) {
            System.out.println(this.fio + " взял " + countBook + " книги");
        } else if (countBook % 10 == 0) {
            System.out.println(this.fio + " взял " + countBook + " книг");
        } else if (countBook == 1) {
            System.out.println(this.fio + " взял " + countBook + " книгу");
        }

    }

    // - takeBook, который будет принимать переменное количество названий книг.
    // Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
    public void takeBook(Book book) {
        this.books.put(book.nameBook, book.nameAuthor);
    }


    public void returnBook() {

        if (this.books.size() > 1) {
            System.out.println(this.fio + " вернул " + this.books.size() + " книги");
        } else if (this.books.size() % 10 == 0) {
            System.out.println(this.fio + " вернул " + 0 + " книг");
        } else {
            System.out.println(this.fio + " вернул " + this.books.size() + " книгу");
        }
        for (int i = 0; i <= books.size(); i++) {
            books.remove(i);
        }
    }

    public void returnBook(int countBook) {
        if (countBook > 1) {
            System.out.println(this.fio + " вернул " + countBook + " книги");
        } else if (countBook % 10 == 0) {
            System.out.println(this.fio + " вернул " + countBook + " книг");
        } else if (countBook == 1) {
            System.out.println(this.fio + " вернул " + countBook + " книгу");
        }
    }

    public void returnBook(String book) {
        if (this.books.get(book) != null) {
            this.books.remove(book);
            System.out.println(this.fio + " вернул книгу " + book);
        } else {
            System.out.println("Такой книги у читателя нет! ");
        }
    }

}
