public class DivideAndConquer {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) { // Base case: single element or invalid range
            return;
        }
        // Divide
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        // Conquer (merge)
        merge(arr, si, ei, mid);
    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;     // Iterator for left part
        int j = mid + 1; // Iterator for right part
        int k = 0;      // Iterator for temp array

        // Merge the two sorted halves
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted elements back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 5, 2, 1, 4, 9};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
