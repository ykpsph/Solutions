public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        String[] strs = {"leetcode", "lead", "leet"};
        System.out.println(lcp(strs));
    }
    public static String lcp(String[] strs){
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];

        for(int i = 1; i <= strs.length - 1; i++){
            while(strs[i].indexOf(prefix) != 0){
                // System.out.println(prefix);
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}

/*
- prefix = strs[0] = "leetcode"

- dongu icerisinde :
prefix = leetcod
prefix = leetco
prefix = leetc
prefix = leet
prefix = lee
prefix = le
return prefix;

*/
