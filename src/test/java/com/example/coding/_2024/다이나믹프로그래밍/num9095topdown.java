package com.example.coding._2024.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num9095topdown {
  public static Integer[]dp;
  public static Integer[]num;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    num = new Integer[n];
    for(int i = 0 ; i < n ; i++) {
      num[i] = Integer.parseInt(br.readLine());
    }
    dp = new Integer[12];
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 4;
    for(int i = 0 ; i < n ; i++) {
      System.out.println(topdown(num[i]));
    }
  }
  public static int topdown(int n) {

    if(dp[n] != null) {
      return dp[n];
    }
    dp[n] = topdown(n-1)+topdown(n-2)+topdown(n-3);
    return dp[n];
  }
}
