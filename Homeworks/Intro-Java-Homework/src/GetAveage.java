import java.util.Scanner;

public class GetAveage {
    public static void main(String[] args) {
        double firstNumber = new Scanner(System.in).nextDouble();
        double secondNumber = new Scanner(System.in).nextDouble();
        double thirdNumber = new Scanner(System.in).nextDouble();

        double averageNumber = findTheAverageOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        System.out.printf("%.2f", averageNumber);
    }

    public static double findTheAverageOfThreeNumbers(double firstNumber, double secondNumber, double thirdNumber) {
        double averageNumber = (firstNumber + secondNumber + thirdNumber) / 3;

        return averageNumber;
    }
}
