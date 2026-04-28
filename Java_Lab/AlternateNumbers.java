import java.util.Scanner;

public class AlternateNumbers {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Alternate numbers in the array are:");

            for (int i = 0; i < n; i += 2) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
