import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis_20 {
    private static HashMap<Character, Character> mappings;
    static {
        mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
    }

    public static void main(String[] args) {
        String s = "[()]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(mappings.containsKey(c)){
                char topElement = stack.empty() ? '#' : stack.pop();
                if(topElement != mappings.get(c)){
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
