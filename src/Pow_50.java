public class Pow_50 {
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(myPow(x,n));
    }
    public static double myPow(int x, int n){
        // x ^^ n ---> x ustu n
        double ans = 1.0;
        long num = n;

        if(n < 0){
            num = -1 * num;
        }
        while(num > 0){
            if(num % 2 == 0){
                x = x * x;
                num = num / 2;
            } else {
                ans = ans * x;
                num = num - 1;
            }
        }
        if(n < 0){
            return (double)(1.0) / (double)(ans);
        }
        return ans;
    }
}
