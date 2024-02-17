package com.example.coding.프로그래머스;

public class spot {
  public static void main(String[] args) {
    long answer = 0;
    int d = 10;
    int k =2;
    for (int i = 0; i <= d; i += k) {
      long dd = (long) d * d;
      long ii = (long) i * i;
      int top = (int) Math.sqrt(dd - ii);
      answer += (top / k) + 1;
    }
    System.out.println("answer = " + answer);
  }
}
