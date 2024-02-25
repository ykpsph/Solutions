public class ReverseString_344 {
    public static void main(String[] args) {
        char[] ch = {'y', 'a', 'k', 'o'};
        reverseString(ch);
    }
    public static void reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        for (char c : s) {
            System.out.print(c);
        }
    }
}
