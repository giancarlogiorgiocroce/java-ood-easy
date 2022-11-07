// import java.time.LocalDate; 

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
        User user = new User("Braccobaldo Bau", "1995-04-18");

            // Istanziazione Libro
        Book firstBook = new Book("Diritto e Società di massa, un profilo", "Michael Thaler", 300);
            // Attribuzione libri ad user
        user.borrow(firstBook);

            //Aggiungiamo le classi figlie.
        AudioBook secondBook = new AudioBook("The Gulag Archipelago", "Aleksandr Solzhenitsyn", 2250);
        user.borrow(secondBook);

        Ebook thirdBook = new Ebook("La Società aperta e i suoi nemici", "Carl Popper", 600, "pdf");
        user.borrow(thirdBook);


            // Stampa
        System.out.printf("Il tuo nome: %s \nLa tua data di nascina: %s \nI tuoi anni: %d \n", user.getName(), user.getBirthday(), user.age());
        // toString() funziona sulle classi base, se si usa una custom class bisogna farselo da sé
        System.out.printf("Libri presi in prestito: %s", user.borrowedBooks());

    
    }
}