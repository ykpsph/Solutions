public class LengthOfLastWord_50 {
    public static void main(String[] args) {
        String str = "This is fun ";
        System.out.println(lolw(str));

    }
    public static int lolw(String str){
        int count = 0;
        for(int i = str.length()-1; i >=0; i--){
            if(str.charAt(i) != ' '){
                count++;
            } else {
                if(count > 0){
                    return count;
                }
            }
        }
        return count;
    }
}
