import java.time.LocalDate;

class HelloWorld {
    public static void main(String[] args) {
            //Creazione istanza e assegnazione #1
        // User youngUser = new User();
        // youngUser.name = "G. G. Croce";
        // youngUser.birthday = LocalDate.parse("1995-04-18");

        // System.out.printf("Il tuo nome: %s \nLa tua data di nascina: %s \nI tuoi anni: %d \n", youngUser.name, youngUser.birthday, youngUser.age());

            //Creazione istanza e assegnazione #2
        // User oldUser = new User();
        // oldUser.name = "Ugo de Ughi";
        // oldUser.birthday = LocalDate.parse("1975-04-18");

        // System.out.printf("Il tuo nome: %s \nLa tua data di nascina: %s \nI tuoi anni: %d \n", oldUser.name, oldUser.birthday, oldUser.age());

        // ESEMPIO A SINGOLO UTENTE

            // Istanziazione Utente
        User user = new User();
        user.name = "Braccobaldo Bau";
        user.birthday = LocalDate.parse("1995-04-18");

            // Istanziazione Libro
        Book firstBook = new Book();
        firstBook.title = "Diritto e Società di massa, un profilo";
        firstBook.author = "Michael Thaler";
            // Attribuzione libri ad user
        user.borrow(firstBook);

            // Stampa
        System.out.printf("Il tuo nome: %s \nLa tua data di nascina: %s \nI tuoi anni: %d \n", user.name, user.birthday, user.age());
        // toString() funziona sulle classi base, se si usa una custom class bisogna farselo da sé
        System.out.printf("Libri presi in prestito: %s", user.books.toString());
    
    }
}