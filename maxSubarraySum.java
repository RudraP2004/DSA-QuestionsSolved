public class maxSubarraySum {

    public static void maxSubarrayCalculate(int arr[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            int start = 0;
            for(int j=i; j<arr.length; j++) {
                int end = j;
                currentSum = 0;
                for(int k=start; k<end; k++) {
                    //sub-array sum
                    currentSum += arr[k];
                }
                if(maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("maxSum = " +maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {8,7,1,2,5,9,7};
        maxSubarrayCalculate(arr);
    }
}
