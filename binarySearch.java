public class binarySearch {

    public static int binarySearchs(int num[], int key) {
        int start = 0;
        int end = num.length-1;

        while(start < end) {
            int mid = (start+end)/2;
            //comparisions
            if(num[mid] == key) {
                return mid;
            }
            else if(num[mid] < key) { //right
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        int arr[] = {9,8,1,78,85};
        int key = 78;
        System.out.println(binarySearchs(arr, key));
    }
}
