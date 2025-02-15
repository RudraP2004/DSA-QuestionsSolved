import java.util.Arrays;

public class RecursiveBubbleSort {
    // Recursive function to perform one pass of Bubble Sort
    static void bubbleSort(int[] arr, int n, int index) {
        // Base case: If we reach the end of an iteration, restart from index 0 for the next pass
        if (n == 1) {
            return;
        }
        
        // If we reach the last index, start a new pass and reduce n
        if (index == n - 1) {
            bubbleSort(arr, n - 1, 0);
            return;
        }

        // Swap if elements are in the wrong order
        if (arr[index] > arr[index + 1]) {
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
        }

        // Recursive call for the next pair
        bubbleSort(arr, n, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7, 4, 1};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Call the recursive bubble sort function
        bubbleSort(arr, arr.length, 0);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
