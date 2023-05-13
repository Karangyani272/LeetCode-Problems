import java.util.*;
import java.util.Stack;

public class Main {

class MinStack {

    private Stack<Integer> st;
    private Stack<Integer> s2;

    public MinStack() {
        st = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int val) {
        if (s2.empty() || val <= s2.peek()) {
            s2.push(val);
        } else if (val == s2.peek()) {
            // If the new value is equal to the current minimum value
            // we still need to push it onto both stacks
            s2.push(val);
        }
        st.push(val);
    }

    public void pop() {
        if (st.peek().equals(s2.peek())) {
            s2.pop();
        }
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return s2.peek();
    }
}

 public static void main(String[] args) {
   
  }
}