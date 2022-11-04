import java.time.LocalDate;

class HelloWorld {
    public static void main(String[] args) {
            //Creazione istanza e assegnazione #1
        User youngUser = new User();
        youngUser.name = "G. G. Croce";
        youngUser.birthday = LocalDate.parse("1995-04-18");

        System.out.printf("Il tuo nome: %s \nLa tua data di nascina: %s \nI tuoi anni: %d \n", youngUser.name, youngUser.birthday, youngUser.age());

            //Creazione istanza e assegnazione #2
        User oldUser = new User();
        oldUser.name = "Ugo de Ughi";
        oldUser.birthday = LocalDate.parse("1975-04-18");

        System.out.printf("Il tuo nome: %s \nLa tua data di nascina: %s \nI tuoi anni: %d \n", oldUser.name, oldUser.birthday, oldUser.age());
    
    }
}