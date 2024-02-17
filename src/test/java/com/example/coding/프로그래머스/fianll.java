package com.example.coding.프로그래머스;

public class fianll {
  public static void main(String[] args) {
    int n =2 ;
    int l  =4;
    int r = 17;
    int one = (int)Math.pow(4, n);
    System.out.println("pow = " + one);
    int total = (int)Math.pow(5, n);
    System.out.println("total = " + total);
    int middleZero = (int)Math.pow(5, n-1);
    System.out.println("middleZero = " + middleZero);
    System.out.println("total/2 = " + ((total/2)-2));
//    if(l<total/2)
  }
}
