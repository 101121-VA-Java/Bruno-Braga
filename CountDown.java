import java.util.Scanner;

public class CountDown {

    public static void main(String[] args) {
        countit(5);
    }

    public static void countit(int value) {
        if (value < 0) {
            System.out.println("input must be positive or 0.");
        }
        while (value >= 0) {
            System.out.println(value);
            value -= 1;
        }
    }

}
