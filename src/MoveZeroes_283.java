import java.util.Arrays;

public class MoveZeroes_283 {
    public static void main(String[] args) {
        int[] nums = {1,5,2,0,0,4,0,3};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums){
        int currentIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[currentIndex] = nums[i];
                currentIndex++;
            }
        }
        for(int i = currentIndex; i < nums.length; i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
