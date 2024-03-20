import java.util.Arrays;

public class RotateArray_189 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3; //10
        rotate(nums, k);
    }
    public static void rotate(int[] nums, int k){
        k = k % nums.length;
        System.out.println("nums.length: "+nums.length+"k: "+k);
        reverse(nums, 0, nums.length-1); // reverse the entire array
        reverse(nums, 0, k-1); // reverse the first k element
        reverse(nums, k, nums.length-1); // reverse the rest element
        System.out.println("cevap: "+Arrays.toString(nums));

    }
    private static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
