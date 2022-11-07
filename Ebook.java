public class Ebook extends Book {
    private String format;

    // Getters
    public String getFormat(){
        return this.format;
    }

    // Constructor
    Ebook(String title, String author, int pageCount, String format) {
        // Super serve a richiamare il constructor della classe genitore!
        super(title, author, pageCount);

        this.format = format;
    }

    // toString() personalizzato per la sottoclasse
    public String toString() {
        return String.format("'%s' by %s, format: %s", getTitle(), getAuthor(), this.format);
    }
}
