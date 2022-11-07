public class AudioBook extends Book {
    private int runTime;

    // Getters
    public int getRunTime(){
        return this.runTime;
    }

    // Constructor
        // Devo eliminare il default dal costruttore
    AudioBook(String title, String author, int runTime) {
        // Super serve a richiamare il constructor della classe genitore!
        // Posso passare un default per ignorare uno dei dati del genitore
        super(title, author, 0);

        this.runTime = runTime;
    }

        // toString() personalizzato per la sottoclasse
        public String toString() {
            return String.format("'%s' by %s, runtime: %d", getTitle(), getAuthor(), this.runTime);
        }
}
