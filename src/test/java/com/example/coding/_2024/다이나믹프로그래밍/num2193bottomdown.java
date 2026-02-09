package com.example.coding._2024.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2193bottomdown {
  public static long [] dp;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    dp = new long[N+1];
    dp[0] = 0;
    dp[1] = 1;

    for(int i = 2 ; i < N+1 ; i++) {
      dp[i] = dp[i-1] + dp[i-2];
    }
    System.out.println(dp[N]);
  }
}
