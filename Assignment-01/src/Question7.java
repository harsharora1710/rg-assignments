import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Question7 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "python", "spring");

        List<String> upperCaseLanguages = languages.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upperCaseLanguages.forEach(System.out::println);
    }

}
