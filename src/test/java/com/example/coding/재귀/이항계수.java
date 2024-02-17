package com.example.coding.재귀;

public class 이항계수 {
  public static void main(String[] args) {
    System.out.println(binomial(10,9));
  }
  public static int binomial(int n , int k) {
    if(k==0 || n==k) {
      return 1;
    } else {
      System.out.println(n+" "+k);
      return binomial(n-1,k)+ binomial(n-1,k-1);
    }
  }
}
