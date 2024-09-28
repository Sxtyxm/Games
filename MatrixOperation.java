import java.util.Arrays;
import java.util.Scanner;

public class MatrixOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the matrix
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] matrix = new int[n];

        // Input the elements of the matrix
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            matrix[i] = scanner.nextInt();
        }

        // Divide the matrix into even and odd index sub-matrices
        int[] evenMatrix = new int[(n + 1) / 2];
        int[] oddMatrix = new int[n / 2];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenMatrix[i / 2] = matrix[i];
            } else {
                oddMatrix[i / 2] = matrix[i];
            }
        }

        // Sort the sub-matrices in ascending order
        Arrays.sort(evenMatrix);
        Arrays.sort(oddMatrix);

        // Print the sorted sub-matrices
        System.out.print("Sorted even array: ");
        for (int num : evenMatrix) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Sorted odd array: ");
        for (int num : oddMatrix) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find the second largest number in both sub-matrices
        int secondLargestEven = evenMatrix[evenMatrix.length - 2];
        int secondLargestOdd = oddMatrix[oddMatrix.length - 2];

        // Print the sum of the second largest numbers
        int sum = secondLargestEven + secondLargestOdd;
        System.out.println("The sum of the second largest numbers from both matrices is: " + sum);
    }
}
