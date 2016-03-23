import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstString = console.next();
        String secondString = console.next();

        int sum = MultiplyCharacters(firstString, secondString);

        System.out.println(sum);

    }

    private static int MultiplyCharacters(String firstString, String secondString) {
        int sum = 0;
        for (int i = 0; i < Math.min(firstString.length(), secondString.length()); i++) {
            sum += firstString.charAt(i) * secondString.charAt(i);
        }

        if (firstString.length() > secondString.length()) {
            for (int i = secondString.length(); i < firstString.length(); i++) {
                sum += firstString.charAt(i);
            }
        } else {
            for (int i = firstString.length(); i < secondString.length(); i++) {
                sum += secondString.charAt(i);
            }
        }

        return sum;
    }
}
