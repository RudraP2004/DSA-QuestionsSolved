public class reverseArray {

    public static void getReversedArray(int arr[]) {
        int first = 0; 
        int last = arr.length-1;

        while (first < last) {
            //swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {8,9,1,5,7};
        getReversedArray(arr);
        printArray(arr);
        
    }
}
