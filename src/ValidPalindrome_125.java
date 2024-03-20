public class ValidPalindrome_125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Paxnama";
        System.out.println(isValidPalindrome(s));
    }
    public static boolean isValidPalindrome(String s){
        int p1 = 0;
        int p2 = s.length()-1;

        while(p1 <= p2){
            if(!Character.isLetterOrDigit(s.charAt(p1))){
                p1++;
            } else if(!Character.isLetterOrDigit(s.charAt(p2))){
                p2--;
            } else {
                if(Character.toLowerCase(s.charAt(p1)) != Character.toLowerCase(s.charAt(p2))){
                    return false;
                }
                p1++;
                p2--;
            }
        }
        return true;
    }
}
