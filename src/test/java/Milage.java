import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Milage {

    @Test
    public static void main(String[] args) {

        int km;
        int liters;
        int totalKm = 0;
        int totalLiters = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate and show how many liters did we spent while driving a car");

        System.out.println("Enter km: ");
        km = input.nextInt();

        System.out.println("Enter liters used: ");
        liters = input.nextInt();

        System.out.println("\nkm driven for this trip: " + km);
        System.out.println("Liters used for this trip: " + liters);
        totalKm += km;
        totalLiters += liters;
        System.out.printf("\nKm per liter for this trip: %f\nCombined km "
                + "per liter: %f\n",(double)km/liters, (double)totalKm/totalLiters);

    }


}
