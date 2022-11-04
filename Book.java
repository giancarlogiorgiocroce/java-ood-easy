public class Book {
    public String title;
    public String author;

    // toString() funziona sulle classi base, se si usa una custom class bisogna farselo da sé
    public String toString() {
        return String.format("'%s' by %s", title, author);
    }
}
