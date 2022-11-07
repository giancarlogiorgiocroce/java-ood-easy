public class Book {
    private String title;
    private String author;
    private int pageCount;

    // Getters
    public String getTitle(){
        return this.author;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPageCount(){
        return this.pageCount;
    }

    // Constructor
    Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // toString() funziona sulle classi base, se si usa una custom class bisogna farselo da sé
    public String toString() {
        return String.format("'%s' by %s", this.title, this.author);
    }
}
