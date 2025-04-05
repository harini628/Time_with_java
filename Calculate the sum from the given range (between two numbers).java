import java.util.Scanner;
class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start number (M): ");
        int M = scanner.nextInt();
        System.out.print("Enter end number (N): ");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = M; i <= N; i++) {
            sum += i;
        }
        System.out.println("Sum from " + M + " to " + N + " is: " + sum);
    }
}
