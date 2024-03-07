import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies_1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < candies.length; i++){
            max = Math.max(max, candies[i]);
        }

        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= max){
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
