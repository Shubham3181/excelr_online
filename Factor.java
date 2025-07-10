import java.util.Scanner;

class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Read integer input

        System.out.println("Factors of " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

       sc.close(); // Close the scanner
    }
}
