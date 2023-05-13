import java.util.*;

public class Main {
  static class Stack{
    static ArrayList<Integer> lis = new ArrayList<>();
    public static boolean isEmpty(){
      return lis.size() == 0;
    }
    public static void push(int data){
      lis.add(data);
    }
    public static int pop(){
      if(isEmpty()){
        return -1;
      }
      int top = lis.get(lis.size() - 1);
      lis.remove(lis.size() - 1);
      return top;
    }
    public static int peek(){
        if(isEmpty()){
        return -1;
      }
      return lis.get(lis.size() - 1);
    }
  }
    public static void main(String[] args) {
      Stack s = new Stack();
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);
      while(!s.isEmpty()){
             System.out.println(s.peek());
             s.pop();
      }
  }
}