public class LongestPalindromicSubstring_5 {
    public static void main(String[] args) {
        String s = "abasba";
        System.out.println(lps(s));
    }

    public static String lps(String s){
        if(s == null || s.length() < 1){
            return "";
        }
        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length() - 1; i++){
            int len1 = expandAroundCenter(s,i,i);
            int len2 = expandAroundCenter(s,i, i+1);
            int len = Math.max(len1, len2);

            if(len > end-start){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start, end+1);
    }
    public static int expandAroundCenter(String s, int left, int right){
        int L = left;
        int R = right;

        while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }
}
