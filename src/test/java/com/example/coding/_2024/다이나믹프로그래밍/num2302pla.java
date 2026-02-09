package com.example.coding._2024.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2302pla {
  public static long []dp;

  public static long cnt = 1;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    dp = new long[41];
    dp[0] = 1 ;
    dp[1] = 1;
    dp[2] = 2;
    for(int i = 3 ; i < 41; i++) {
      dp[i] = dp[i-1]+dp[i-2];
    }

    int beforeSeat = 0;

    for(int i = 0 ; i < M ; i++) {
      int temp = Integer.parseInt(br.readLine());
      cnt *= dp[temp - beforeSeat -1];
      beforeSeat = temp;
    }
    cnt *= dp[N-beforeSeat];

    System.out.println(cnt);
  }
}
