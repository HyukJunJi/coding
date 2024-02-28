package com.example.coding.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2748topdown {
  public static long[] dp;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    dp = new long[n+1];
    dp[0] = 0;
    dp[1] = 1;
    System.out.println(fibo(n));
  }
  public static long fibo(int n) {
    if(n==0) {
      return 0;
    }
    if(n==1 || n==2) {
      return 1;
    }
    if(dp[n] != 0) {
      return dp[n];
    }
    dp[n] = fibo(n-1)+ fibo(n-2);
    return dp[n];
  }
}
