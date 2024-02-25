import java.util.ArrayList;
import java.util.List;

public class FizzBuzz_412 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        fizzbuzz(arr);
    }
    public static void fizzbuzz(int[]arr){
        List<String> li = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 5 == 0 && arr[i] % 3 == 0){
                li.add("FizzBuzz");
            } else if (arr[i] % 5 == 0){
                li.add("Buzz");
            } else if (arr[i] % 3 == 0){
                li.add("Fizz");
            } else {
                li.add(Integer.toString(arr[i]));
            }
        }
        System.out.println(li.toString());
    }
}
