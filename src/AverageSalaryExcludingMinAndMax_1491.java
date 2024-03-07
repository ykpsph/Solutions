public class AverageSalaryExcludingMinAndMax_1491 {
    public static void main(String[] args) {
        int[] nums = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000}; //{4000, 3000, 1000, 2000};
        System.out.println(average(nums));
    }
    public static double average(int[] nums){
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            minSalary = Math.min(minSalary, nums[i]);
            maxSalary = Math.max(maxSalary, nums[i]);
        }
        double sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(minSalary != nums[i] && maxSalary != nums[i]){
                sum += nums[i];
            }
        }
        return sum / (nums.length - 2);
    }
}
