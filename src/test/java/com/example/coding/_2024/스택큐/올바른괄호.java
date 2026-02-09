package com.example.coding._2024.스택큐;

import java.util.Stack;

public class 올바른괄호 {
  public static void main(String[] args) {
    String s = "(()(";
    Solution d = new Solution();
    System.out.println("d.solution(s) = " + d.solution(s));
  }
  public static class Solution {
    boolean solution(String s) {
      boolean answer = true;

      char[] charArray = s.toCharArray();
      Stack<Character> stack = new Stack<>();
      for(char c : charArray) {
        if(c=='(') {
          stack.add(c);
        }
        if(c==')') {
          if(stack.isEmpty()) {
            return false;
          }
          if(stack.pop()=='(') {
          } else {
            return false;
          }
        }
      }
      if(!stack.isEmpty()) {
        answer=false;
      }
      return answer;
    }
  }
}
