import java.time.LocalDate;

class HelloWorld {
    public static void main(String[] args) {
        User youngUser = new User();

        youngUser.name = "G. G. Croce";
        youngUser.birthday = LocalDate.parse("1995-04-18");

        System.out.printf("Il tuo nome: %s \nLa tua data di nascina: %s \nI tuoi anni: %d \n", youngUser.name, youngUser.birthday, youngUser.age());
    }
}