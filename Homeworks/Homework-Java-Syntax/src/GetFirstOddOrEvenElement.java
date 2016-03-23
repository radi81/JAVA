import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFirstOddOrEvenElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (console.hasNextInt()) {
            int number = console.nextInt();
            numbers.add(number);
        }

        // Get <number of elements> <odd/even>
        console.next();
        int numberOfElements = console.nextInt();
        String oddEven = console.next();

        List<Integer> outputNumbers = getFirstNOddOrEvenElements(numberOfElements, oddEven, numbers);
        System.out.print(outputNumbers);
    }

    private static List<Integer> getFirstNOddOrEvenElements(int n, String oddEven, List<Integer> elements) {
        List<Integer> outputNumbers = new ArrayList<>();
        int numbersCount = 0;

        for (int i = 0; i < elements.size(); i++) {
            if (outputNumbers.size()== n || numbersCount == elements.size()) {
                break;
            }

            if (elements.get(i) % 2 == 1 && oddEven.equals("odd"))  {
                outputNumbers.add(elements.get(i));
            }

            if (elements.get(i) % 2 == 0 && oddEven.equals("even")) {
                outputNumbers.add(elements.get(i));
            }

            numbersCount++;
        }

        return outputNumbers;
    }
}
