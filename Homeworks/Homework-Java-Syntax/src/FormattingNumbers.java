import java.math.BigInteger;
import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        double b = console.nextDouble();
        double c = console.nextDouble();

        System.out.printf(
                "|%-10x|%010d|%10.2f|%-10.3f|",
                a,
                new BigInteger(Integer.toBinaryString(a)),
                b,
                c);
    }
}
