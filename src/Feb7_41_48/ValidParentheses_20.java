package Feb7_41_48;

import java.util.Stack;

/**
 * Created by zhupd on 2/10/2017.
 */
public class ValidParentheses_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    stack.push(')');break;
                case '{':
                    stack.push('}');break;
                case '[':
                    stack.push(']');break;
                default:
                    if (!stack.isEmpty() && c == stack.pop()) {
                        break;
                    } else {
                        return false;
                    }

            }
        }
        return stack.isEmpty();
    }
}
