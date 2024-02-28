public class BinarySearch_704 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,12,34,35};
        int target = 34;
        System.out.println(search(arr, target));
    }
    public static int search(int[] arr, int target){
        int left = 0;
        int mid = 0;
        int right = arr.length - 1;

        while(left <= right){
            mid = (left + right) / 2;
            if(arr[mid] == target){
                return mid;
            } else if(target > arr[mid]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
