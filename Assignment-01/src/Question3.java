import java.util.ArrayList;
import java.util.Optional;

public class Question3 {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Harsh");

        name.ifPresent(n -> System.out.println("Name is: " + n));

        Optional<String> emptyName = Optional.empty();

        String result = emptyName.orElse("Default Name");
        System.out.println("Result: " + result);


    }
}
