import java.util.*;

public class Main {
public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (st.empty()) {
                st.push(c);
            } else if ((st.peek() == '(' && c == ')') ||
                       (st.peek() == '[' && c == ']') ||
                       (st.peek() == '{' && c == '}')) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        
        return st.isEmpty();
    }
    public static void main(String[] args) {
     String s = "([{}])";
       if (isValid(s))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
  }
}