package com.example.coding._2024.프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
  public static void main(String[] args) {
    int n = 3;
    int [] narr = new int[n];
    List<String> arr = new ArrayList<>();
    if (n == 0) {
      System.out.println(1);
    }
    else{
      arr.add("1");
    }
    for(int i = n ; i > 0  ; i--) {
      narr[i-1]=n;
      n=n-1;
    }
    System.out.println("arr.toString() = " + arr);
    System.out.println(Arrays.toString(narr));
    for(int i = 0 ; i < narr.length ; i++) {
      String str="";
      for(int j = 0 ; j< (int)Math.pow(5, narr[i]-1); j ++){

        System.out.println("j = " + j);
        if(arr.get(i).charAt(j)=='0'){
          System.out.println("arr.get("+i+").charAt("+j+") = " + arr.get(i).charAt(j));
          str=str+"00000";
        }else{
          str=str+"11011";
        }

        System.out.println("arr = " + arr);
      }
      arr.add(str);
    }
    long l = 2;
    long r = 25;
    String sub = arr.get(n).substring((int)l-1,(int)r);
    int countOfOnes = (int)sub.chars().filter(ch -> ch == '1').count();
    System.out.println("countOfOnes = " + countOfOnes);
  }

}
