import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters_3 {
    public static void main(String[] args) {
        String s = "abcdabcdebb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s){
        int n = s.length();
        int ans = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0, j = 0; i < n; i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(map.get(s.charAt(i)), j);
            }
            ans = Math.max(ans, i - j + 1);
            map.put(s.charAt(i), i+1);
        }
        return ans;
    }
}
