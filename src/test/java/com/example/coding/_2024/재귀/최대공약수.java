package com.example.coding._2024.재귀;

public class 최대공약수 {
  public static void main(String[] args) {
    System.out.println(gcd(18,38));
  }
  public static int gcd(int n, int m ) {
    if(m==0) {
      return n;
    } else {
      return gcd(m, n%m);
    }
  }
}
