
import java.util.Scanner;

public class Clockwise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int last = numbers[n - 1];
        for (int i = n - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];

        }
        numbers[0] = last;
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        sc.close();
    }
}
