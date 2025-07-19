import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<Integer> roll = new ArrayList<Integer>();
        roll.add(1);
        roll.add(2);
        roll.add(3);

        System.out.println("Elements of the ArrayList: ");
        roll.forEach(n -> System.out.println(n));
    }
}