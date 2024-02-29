package com.example.coding.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num1003 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    int [][] dp = new int[41][2];
    dp[0] = new int[] {1, 0};
    dp[1] = new int[] {0, 1};

    for(int i = 0 ; i < T ; i ++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      if(n==0) {
        System.out.println(dp[n][0]+" "+dp[n][1]);
      } else if(n==1) {
        System.out.println(dp[n][0]+" "+dp[n][1]);
      }
      for(int j = 2 ; j <= n ; j++) {
        dp[j][0] = dp[j-1][0] +dp[j-2][0];
        dp[j][1] = dp[j-1][1] +dp[j-2][1];
        if(dp[n][0]+dp[n][1]>0) {
          System.out.println(dp[n][0]+" "+dp[n][1]);
          break;
        }
      }
    }
  }
}
