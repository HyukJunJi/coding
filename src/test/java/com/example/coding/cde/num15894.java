package com.example.coding.cde;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num15894 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    long sum = 0L;
    if(n==1) {
      sum = 4L;
      System.out.println(sum);
    } else{
      sum = 4L * n;
      System.out.println(sum);
    }
  }
}
