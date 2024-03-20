public class ReversWordsInAString_151 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s){
        StringBuffer sb = new StringBuffer();

        int i = s.length() - 1;

        while(i >= 0){
            if(s.charAt(i) == ' '){
                i--;
            }
            else {
                int j = i;
                while(i >= 0 && s.charAt(i) != ' '){
                    i--;
                }
                if(sb.length() > 0){
                    sb.append(' ');
                }
                for(int k = i + 1; k <= j; k++){
                    sb.append(s.charAt(k));
                }
            }
        }
        return sb.toString();
    }
}

/*
- i = 14; sb = '';

- s = "the sky is blue";
                     i
                     j
- s = "the sky is blue";
                 ik  j
- sb = blue
- s = "the sky is blue";
              ikj
- sb = blue_
- sb = blue_is
- s = "the sky is blue";
          ik j
- sb = blue_is_
- sb = blue_is_sky
- s = "the sky is blue";
       ikj
- sb = "blue_is_sky_the

 */