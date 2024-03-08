import java.util.ArrayList;
import java.util.List;

public class SequentialDigits_1291 {
    public static void main(String[] args) {
        int low = 1000;
        int high = 13000;
        System.out.println(sequentialDigits(low, high));

    }
    public static List<Integer> sequentialDigits(int low, int high){
        String digits = "123456789";
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= 9; i++){
            for(int k = 0; k+i <= digits.length(); k++){
                String substr = digits.substring(k, i + k);
                int value = Integer.parseInt(substr);

                System.out.println("i = " + i + " k = " + k + " substr = " + substr + " value = " + value);


                if(value >= low && value <= high){
                    list.add(value);
                }
            }
        }
        return list;
    }
}
