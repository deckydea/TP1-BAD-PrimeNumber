import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input angka bilangan bulat: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPrime(num)) {
            System.out.println(num + " adalah bilangan prima");
        } else {
            System.out.println(num + " bukan bilangan prima karena bisa dibagi " + findFactors(num));
        }
    }

    // Untuk memeriksa apakah sebuah angka merupakan bilangan prima atau bukan
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Untuk mencari faktor-faktor dari sebuah angka yang bukan prima
    public static String findFactors(int num) {
        StringBuilder factors = new StringBuilder();
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (!factors.isEmpty()) {
                    factors.append(", ");
                }
                factors.append(i);
                if (i != num / i) {
                    factors.append(", ").append(num / i);
                }
            }
        }
        return factors.toString();
    }
}