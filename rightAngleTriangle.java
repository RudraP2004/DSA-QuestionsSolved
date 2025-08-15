import java.util.Scanner;

public class rightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Loop through each column
            for (int j = 1; j <= i; j++) {
                // Print star at first column, last column or last row
                if (j == 1 || j == i || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // space for hollow part
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
