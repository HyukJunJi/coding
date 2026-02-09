package com.example.coding._2024.재귀;

public class 팩토리얼 {
  public static void main(String[] args) {
    System.out.println(factorial(4));
  }
  public static int factorial(int n) {
    if(n==1) {
      return 1;
    } else {
      return n * factorial(n-1);
    }
  }
}
