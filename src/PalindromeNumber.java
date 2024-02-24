public class PalindromeNumber {
    public static void main(String[] args){
        int num = 121;

        if(isPalindrome(num)){
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }

    public static boolean isPalindrome(int num){
        if(num < 0 || (num % 10 == 0 && num != 0)){
            return false;
        }
        int reversedNum = 0;

        while(num > reversedNum){
            reversedNum = reversedNum * 10 + (num % 10);
            num /= 10;
        }
        return num == reversedNum || num == (reversedNum / 10);
    }
}
