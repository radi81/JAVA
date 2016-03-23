import java.util.Scanner;

public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int base7Number = console.nextInt();

        int decimalNumber = Integer.parseInt(Integer.toString(base7Number, 10), 7);

        System.out.print(decimalNumber);
    }
}
