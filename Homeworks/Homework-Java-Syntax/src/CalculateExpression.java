import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        // ((a2 + b2) / (a2 – b2))(a + b + c) / √c
        double firstExpression =
                Math.pow(
                        ((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2))),
                        ((a + b + c) / Math.sqrt(c)));
        // (a2 + b2 - c3)(a – b)
        double secondExpression =
                Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)), (a - b));
        // Average (a, b, c) – Average (firstExpression, secondExpression)
        double difference = Math.abs((a + b + c) / 3 - (firstExpression + secondExpression) / 2);

        System.out.printf(
                "F1 result: %.2f; F2 result: %.2f; Diff: %.2f",
                firstExpression,
                secondExpression,
                difference);
    }
}