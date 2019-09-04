import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class PercentageCalculator {
    @Test
        public static void main(String args[]) {
        float percentage;
        float total_marks;
        float scored;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit:");
        scored = sc.nextFloat();

        System.out.println("Enter a digit:");
        total_marks = sc.nextFloat();

        percentage = (float) ((scored / total_marks) * 100);
        System.out.println("Percentage:" + percentage);
    }
}
