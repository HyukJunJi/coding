package com.example.coding.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1463bottomup {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[]dp = new int[n+1];
    for(int i = 2 ; i <= n; i ++) {
      dp[i] = dp[i-1]+1;
      if(i%2 == 0) {
        dp[i] = Math.min(dp[i], dp[i/2]+1);
      }
      if(i%3==0) {
        dp[i] = Math.min(dp[i], dp[i/3]+1);
      }
      for(int b : dp) {
        System.out.print(b+" ");
      }
      System.out.println();
    }
    System.out.println(dp[n]);
  }
}
