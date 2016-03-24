import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int target = console.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int j = i; j <= 20; j++) {
                if (i + j == target) {
                    System.out.printf("%d + %d = %d\n", i, j, target);
                }

                if (j + i == target) {
                    System.out.printf("%d + %d = %d\n", j, i, target);
                }

                if (i - j == target) {
                    System.out.printf("%d - %d = %d\n", i, j, target);
                }

                if (j - i == target) {
                    System.out.printf("%d - %d = %d\n", j, i, target);
                }
            }
        }
    }
}
