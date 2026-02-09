package com.example.coding._2024.재귀;

public class 하노이의탑 {
  public static void main(String[] args) {
    hanoi(3,1,3,2);
    ha(3,1,3,2);
  }
  public static void hanoi(int n , int src, int dst,int via) {
    if(n==1) {
      System.out.println(src+"->"+dst);
    } else {
      hanoi(n-1,src,via,dst);
      System.out.println(src+"->"+dst);
      hanoi(n-1, via,dst,src);
    }
  }
  public static void ha(int n, int src,int dst,int via) {
    n= n+1;
    int a = (int)Math.pow(2,n-1) -1;
    System.out.println(a);
  }
}
