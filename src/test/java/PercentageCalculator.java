import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class PercentageCalculator {
    @Test
        public static void main(String args[]) {
        double percentage;
        double total_marks;
        double scored;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit:");
        scored = sc.nextDouble();

        System.out.println("Enter a digit:");
        total_marks = sc.nextDouble();

        percentage = (double) ((scored / total_marks) * 100);
        System.out.println("Percentage:" + percentage);
    }
}
