package com.example.coding._2024.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num10162 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    int A=0,B=0,C=0;
    A = T/300;
    T = T%300;
    B = T/60;
    T = T%60;
    C = T/10;
    T = T%10;
    if(T!=0) {
      System.out.println(-1);
      System.exit(0);
    }
    System.out.println(A+" "+B+" "+C);
  }
}
