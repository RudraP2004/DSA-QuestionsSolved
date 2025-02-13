public class largestNum {

    public static int getLargestNum(int arr[]) {
        int largest = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {92564,8897548,502568745,1784,50000,8989589};
        System.out.println(getLargestNum(arr));
    }
}
