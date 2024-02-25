public class FactorialTrailingZeroes_172 {
    public static void main(String[] args) {
        int num = 10;

        System.out.println(trailingZeroes(num));
    }
    public static int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }
}
