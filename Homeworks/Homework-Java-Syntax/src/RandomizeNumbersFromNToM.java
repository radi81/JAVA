import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();


        List<Integer> generatedRandomNumbers = GenerateRandomIntegersInRange(m, n);

        System.out.print(generatedRandomNumbers + " ");
    }

    private static List<Integer> GenerateRandomIntegersInRange(int m, int n) {
        List<Integer> generatedRandomNumbers = new ArrayList<Integer>();

        while (generatedRandomNumbers.size() < n - m + 1) {
            int randomInt = generateRandomInt(m, n);

            if (!generatedRandomNumbers.contains(randomInt)) {
                generatedRandomNumbers.add(randomInt);
            }
        }

        return generatedRandomNumbers;
    }

    private static int generateRandomInt(int min, int max) {
        Random rnd = new Random();
        int randomNum;
        while (true) {
            randomNum = rnd.nextInt(max + min + 1) - min;

            if (min <= randomNum && randomNum <= max) {
                break;
            }
        }

        return randomNum;
    }
}

