public class JumpGame_55 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4}; //{3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums){
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(max < i){
                return false;
            }
            max = Math.max(max, i + nums[i]);
        }
        return true;
    }
}
