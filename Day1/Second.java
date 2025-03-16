import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Must be odd
        int mid = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            int printVal;

            if (i <= n / 2) {
                // Left side (reverse from n/2 to 1)
                printVal = (n / 2) - (i - 1);
            } else if (i == mid) {
                // Middle value
                printVal = mid;
            } else {
                // Right side (reverse from n down to mid+1)
                printVal = n - (i - mid);
            }

            System.out.print(printVal + " ");
        }

        sc.close();
    }
}
