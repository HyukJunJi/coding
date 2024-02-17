package com.example.coding.재귀;

import java.util.ArrayList;
import java.util.List;

public class 순열문제 {
    public static int startidx=0;
  public static void main(String[] args) {
    int n = 4;
    int r = 2;
    boolean[] isSelected = new boolean[n];
    char[] al = new char[n];
    for(int i = 0 ; i < al.length;i++) {
      al[i] = (char)(97+i);
    }
    for(char b: al) {
      System.out.println(b);
    }
    for(boolean is : isSelected) {
      System.out.println(is);
    }
    pre(al,isSelected,n,r);
  }
  public static void pre(char[] al,boolean[] isSelected,int n,int r) {
    if(r==0) {
      return;
    } else {
      for(int i = 0 ; i < n;i++) {
        isSelected[startidx] = true;
      }
    }
  }
}
