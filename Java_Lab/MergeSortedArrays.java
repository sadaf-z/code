import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter size of array A: ");
            int n1 = sc.nextInt();

            int[] A = new int[n1];

            System.out.println("Enter elements of array A in ascending order:");
            for (int i = 0; i < n1; i++) {
                A[i] = sc.nextInt();
            }

            System.out.print("Enter size of array B: ");
            int n2 = sc.nextInt();

            int[] B = new int[n2];

            System.out.println("Enter elements of array B in ascending order:");
            for (int i = 0; i < n2; i++) {
                B[i] = sc.nextInt();
            }

            int[] C = new int[n1 + n2];

            int i = 0, j = 0, k = 0;

            while (i < n1 && j < n2) {
                if (A[i] < B[j]) {
                    C[k] = A[i];
                    i++;
                } else {
                    C[k] = B[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                C[k] = A[i];
                i++;
                k++;
            }

            while (j < n2) {
                C[k] = B[j];
                j++;
                k++;
            }

            System.out.println("Merged sorted array C:");

            for (int num : C) {
                System.out.print(num + " ");
            }
        }
    }
}
