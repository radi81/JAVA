import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {
        String input = new Scanner(System.in).next();
        int number = Integer.parseInt(input);
        String[] reversedNumber = new String[input.length()];
        int digit;
        String outputDigit = "";

        for (int i = 0; i < input.length(); i++){
            digit = number % 10;
            number /= 10;

            switch(digit) {
                case 0: outputDigit = "Gee"; break;
                case 1: outputDigit = "Bro"; break;
                case 2: outputDigit = "Zuz"; break;
                case 3: outputDigit = "Ma"; break;
                case 4: outputDigit = "Duh"; break;
                case 5: outputDigit = "Yo"; break;
                case 6: outputDigit = "Dis"; break;
                case 7: outputDigit = "Hood"; break;
                case 8: outputDigit = "Jam"; break;
                default: outputDigit = "Mack";

            }

            reversedNumber[i] = outputDigit;
        }

        for (int i = reversedNumber.length - 1; i >= 0; i--) {
            System.out.print(reversedNumber[i]);
        }
    }
}

