import java.util.*;

public class Question10 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Harsh", "Ravi", "Ankit");

        // Using Lambda Expression
        names.forEach(name -> System.out.println(name));

        // Using Method Reference (simpler)
        names.forEach(System.out::println);
    }
}
