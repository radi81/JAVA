import java.util.Arrays;
import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        int[] integers = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        if (integers.length % 2 == 1) {
            System.out.println("Invalid length");
        } else {
            for (int i = 0; i < integers.length; i += 2) {
                if ((Math.abs(integers[i] - integers[i + 1])) % 2 == 1) {
                    System.out.printf(
                            "%d, %d -> different\n",
                            integers[i],
                            integers[i + 1]);
                } else {
                    if (integers[i] % 2 == 0) {
                        System.out.printf(
                                "%d, %d -> both are even\n",
                                integers[i],
                                integers[i + 1]);
                    } else {
                        System.out.printf(
                                "%d, %d -> both are odd\n",
                                integers[i],
                                integers[i + 1]);
                    }
                }
            }
        }
    }
}
