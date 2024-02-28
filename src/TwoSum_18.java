import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_18 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 26; // 11 + 15
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            int complete = target - nums[i];
            if(hashMap.containsKey(complete)){
                return new int[]{hashMap.get(complete), i};
            }
            else {
                hashMap.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution.");
    }
}
