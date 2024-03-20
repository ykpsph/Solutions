import java.util.Arrays;

public class SquaresOfASortedArray_977 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};// {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquare(nums)));
    }
    public static int[] sortedSquare(int[] nums){
        int size = nums.length;
        int[] result = new int[size];

        int current = size-1;
        int p1 = 0;
        int p2 = size-1; // current

        while(p1 <= p2){
            int tempLeft = nums[p1] * nums[p1];
            int tempRight = nums[p2] * nums[p2];

            if(tempLeft > tempRight){
                result[current] = tempLeft;
                current--;
                p1++;
            } else {
                result[current] = tempRight;
                current--;
                p2--;
            }
        }
        return result;
    }
}
