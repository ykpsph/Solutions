public class isSubsequence_389 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        if(isSubsequence(s,t)){
            System.out.println(s + ", "+t+"'nin subsequence string'idir.");
        } else {
            System.out.println(s + ", "+t+"'nin subsequence string'i degildir.");
        }
    }
    public static boolean isSubsequence(String s, String t){
        if(s.isEmpty()){
            return true;
        }
        int p1 = 0;
        int p2 = 0;
        while(p1 < s.length() && p2 < t.length()){
            if(s.charAt(p1) == t.charAt(p2)){
                p1++;
                p2++;
            } else {
                p2++;
            }
        }
        if(p1 == s.length()){
            return true;
        }
        return false;
    }
}
