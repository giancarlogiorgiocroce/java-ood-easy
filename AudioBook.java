public class AudioBook extends Book {
    private int runTime;

    // Getters
    public int getRunTime(){
        return this.runTime;
    }

    // Constructor
    AudioBook(String title, String author, int pageCount, int runTime) {
        // Super serve a richiamare il constructor della classe genitore!
        super(title, author, pageCount);
        
        this.runTime = runTime;
    }
}
