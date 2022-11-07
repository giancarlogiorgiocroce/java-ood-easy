import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthday;
    private ArrayList<Book> books = new ArrayList<Book>();

    // Costructor
    User(String name, String birthday) {
        this.name = name;
        this.birthday = LocalDate.parse(birthday);
    }

    // Getters
    public String getName() {
        return this.name;
    }
    public String getBirthday() {
        return this.birthday.toString();
    }

    // Metodo per aggiungere un book a books
    // In Java è necessario che i metodi abbiano un return di qualcosa, se servono a svolgere funzioni e non a passare un dato allora va utilizzato il tipo "void"
    public void borrow(Book book) {
        this.books.add(book);
    }
    // Metodo per recuperare i Books ora che sono resi privati
    public String borrowedBooks() {
        return this.books.toString();
    }

    // Metodo per calcolare l'età
    public int age() {
        //Period.between funziona in modo strano e non restituisce un int
        //.getYears() restituisce un int
        int age = Period.between(this.birthday, LocalDate.now()).getYears();
        return age;
    }
}