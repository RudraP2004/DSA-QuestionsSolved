public class quickSorts {

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void quickSort(int arr[], int si, int ei) {
        if(si >= ei) {
            return;
        }

        //pivot index finding
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); //Left array
        quickSort(arr, pIdx+1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; //taking pivot as last element
        int i = si-1; //to make place for the els smaller than the pivot
        
        for(int j=si; j<ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //setting pivot at the correct possition
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;


    }
    public static void main(String args[]) {
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
