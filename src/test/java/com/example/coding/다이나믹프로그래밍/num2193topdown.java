package com.example.coding.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2193topdown {
  public static long [] dp;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    dp = new long[N+1];
    dp[0] = 0;
    dp[1] = 1;


    System.out.println(pinary(N));
  }
  public static long pinary(int N) {
    if(N==0) {
      return 0;
    }
    if(N==1) {
      return 1;
    }
    if(dp[N]>0) {
      return dp[N];
    }
    dp[N] = pinary(N-1)+pinary(N-2);
    return dp[N];
  }
}
