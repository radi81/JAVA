import java.util.Scanner;
public class SumNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.print(sum);
    }
}
