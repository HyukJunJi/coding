package com.example.coding._2024.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1904topdown {
  public static long []dp;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    dp = new long[N+2];
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 2;
    System.out.println(topdown(N));
  }
  public static long topdown(int n) {
    if(n==1) {
      return 1;
    }
    if(n==2) {
      return 2;

    }
    if(dp[n]>0) {
      return dp[n];
    }
    dp[n] = (topdown(n-1) + topdown(n-2))%15746;
    return dp[n];
  }
}
