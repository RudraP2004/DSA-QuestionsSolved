public class linearSearch {

    public static int linearSearchs(int nums[], int key) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == key) {
                return i;
            }
        }
        return-1;
    }
    public static void main(String arg[]) {
        int nums[] = {1,5,2,9,7};
        int key = 9;
        System.out.println(linearSearchs(nums, key));
    }
}
