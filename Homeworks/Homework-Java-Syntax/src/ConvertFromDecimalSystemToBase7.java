import java.util.Scanner;

public class ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int decimalNumber = console.nextInt();

        int base7Number = Integer.parseInt(Integer.toString(decimalNumber, 7));

        System.out.print(base7Number);
    }
}
