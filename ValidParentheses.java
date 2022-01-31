import java.util.Deque;
import java.util.ArrayDeque;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();
        while(!s.isEmpty()) {
            char c = s.charAt(0);
            if(c == '(' || c == '[' || c == '{') {
                stack.addFirst(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    char lastOpeningBracket = stack.peekFirst();
                    switch(c) {
                        case ')':
                            if(lastOpeningBracket == '(') {
                                stack.removeFirst();
                                break;
                            } else {
                                return false;
                            }
                        case ']':
                            if(lastOpeningBracket == '[') {
                                stack.removeFirst();
                                break;
                            } else {
                                return false;
                            }
                        case '}':
                            if(lastOpeningBracket == '{') {
                                stack.removeFirst();
                                break;
                            } else {
                                return false;
                            }
                    }
                }
            }
            s = s.substring(1);
        }
        if(stack.isEmpty()) {
            return true;
        } else {
            // Reaching this statement means that we have parsed the entire string, but
            // there are still unmatched opening brackets on th stack.
            return false;
        }
    }
}
