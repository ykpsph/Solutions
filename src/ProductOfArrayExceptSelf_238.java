import java.util.Arrays;

public class ProductOfArrayExceptSelf_238 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums){
        int len = nums.length;
        int[] answer = new int[len];
        answer[0] =1;

        for(int i = 1; i <= len-1; i++){
            answer[i] = nums[i-1] * answer[i-1];
        }
        int right = 1;
        for(int i = len-1; i >= 0; i--){
            answer[i] = answer[i] * right;
            right = right * nums[i];
        }
        return answer;
    }
}
