/*
import java.util.Scanner;
import java.util.*;

public class OperationChoices {
    public static int operationchoices(int c, int a, int b) {
        switch (c) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value for c (1 for addition, 2 for subtraction, 3 for multiplication, 4 for division): ");
        int c = scanner.nextInt();

        int result = operationchoices(c, a, b);
        System.out.println("The result is: " + result);
    }
}
*/


import java.util.Scanner;

public class OperationChoices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array
        int n = scanner.nextInt();

        // Read the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate total sum of the array
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // Find the equilibrium index
        int leftSum = 0;
        int equilibriumIndex = -1;
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];

            if (leftSum == totalSum) {
                equilibriumIndex = i;
                break;
            }

            leftSum += arr[i];
        }

        // Output the result
        if (equilibriumIndex == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println(equilibriumIndex + 1);  // +1 to make it 1-indexed
        }
    }
}
