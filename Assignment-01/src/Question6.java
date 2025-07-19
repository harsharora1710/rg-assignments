import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Question6 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        // Get current time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        // Get current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTime);
    }
}
