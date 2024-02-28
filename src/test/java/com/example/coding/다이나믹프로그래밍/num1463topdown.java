package com.example.coding.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1463topdown {
  public static Integer []dp;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int X = Integer.parseInt(br.readLine());
    dp = new Integer[X+1];
    dp[0] = dp[1]  = 0;
    System.out.println(find(X));

  }
  static int find(int N) {
    if(dp[N] == null) {
      if(N%6==0) {
        System.out.println("N%6==0");
        dp[N] = Math.min(find(N-1), Math.min(find(N/3), find(N/2))) +1;

      }
      else if(N%3==0) {
        System.out.println("N%3==0");
        dp[N] = Math.min(find(N-1), find(N/3))+1;

      }
      else if(N%2==0) {
        System.out.println("N%2==0");
        dp[N] = Math.min(find(N-1),find(N/2))+1;

      }else {
        System.out.println("else");
        dp[N] = find(N-1) + 1;

      }
      for(Integer b : dp) {
        System.out.print(b+" ");
      }
      System.out.println();
    }
    return dp[N];
  }
}
