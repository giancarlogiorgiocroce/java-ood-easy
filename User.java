import java.time.LocalDate;
import java.time.Period;

public class User {
    public String name;
    public LocalDate birthday;

    public int age() {
        int age = Period.between(this.birthday, LocalDate.now()).getYears();
        return age;
    }
}