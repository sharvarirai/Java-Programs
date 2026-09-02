
import java.util.Scanner;

public class pointers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int first = numbers[0];

        for (int i = 0; i < n - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[n - 1] = first;

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        sc.close();

    }
}
