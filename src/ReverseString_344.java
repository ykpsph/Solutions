public class ReverseString_344 {
    public static void main(String[] args) {
        char[] ch = {'k', 'u', 'b', 'r', 'a'};
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
/*
-  Y  A  K  U  P
  (L)         (R)
- L = 0; R = 4; temp = Y; s[0] = P; s[4] = Y;

-  Y  A  K  U  P
     (L)   (R)
- L = 1; R = 3; temp = A; s[1] = U; s[3] = A;

-  Y  A  K  U  P
        (L)
        (R) ---> L < R ? X ---> loop ends
*/
