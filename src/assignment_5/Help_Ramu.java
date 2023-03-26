package assignment_5;

import java.util.Scanner;

public class Help_Ramu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {
            int c1 = scanner.nextInt();
            int c2 = scanner.nextInt();
            int c3 = scanner.nextInt();
            int c4 = scanner.nextInt();

            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int [] rick = new int[n];
            for (int i = 0; i < n; i++) {
                rick[i] = scanner.nextInt();
            }

            int [] cab = new int[m];
            for (int i = 0; i < m; i++) {
                cab[i] = scanner.nextInt();
            }

            System.out.println(minAmount(c1, c2, c3, c4, rick, cab));
            t--;
        }
    }
    private static int minAmount(int c1, int c2, int c3, int c4, int[] rick, int[] cab) {

        int rickshawMinFare = minVehicle(c1, c2, c3, rick);
        int carsMinFare = minVehicle(c1, c2, c3, cab);

        return Math.min(rickshawMinFare + carsMinFare, c4);

    }
    public static int minVehicle(int c1, int c2, int c3, int[] vehicle) {

        int sum = 0;
        for (int i = 0; i < vehicle.length; i++) {
            sum += Math.min(vehicle[i] * c1, c2);
        }
        return Math.min(sum, c3);
    }
}
