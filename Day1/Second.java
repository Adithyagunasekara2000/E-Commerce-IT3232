import java.util.Scanner;


public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Using a single loop
        for (int i = 1; i <= n; i++) {
            if (i <= n/2) {
                // Left part (reversed)
                System.out.print((n/2 - i + 1) + " ");
            } else if (i == n/2 + 1 && n % 2 != 0) {
                // Midcddle element (only for odd n)
                System.out.print(i + " ");
            } else {
                // Right part (reversed)
                System.out.print((n - (i - (n/2 + (n % 2))) + 1) + " ");
            }
        }
    }
}