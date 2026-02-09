package com.example.coding._2024.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num1932위에서아래로 {
  public static int[][] num;
  public static Integer[][] dp;
  public static int n;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    num = new int[n][];
    dp = new Integer[n][n]; // 모든 가능한 경로를 고려할 수 있도록 n*n 크기로 초기화

    for(int i = 0; i < n; i++) {
      num[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    // 초기 위치 설정
    dp[0][0] = num[0][0];

    // 위에서 아래로 내려오면서 각 위치까지의 최대 합 계산
    for(int i = 1; i < n; i++) {
      for(int j = 0; j <= i; j++) {
        int leftUp; // 왼쪽 위에서 오는 경우
        if (j == 0) {
          leftUp = 0;
        } else {
          leftUp = dp[i - 1][j - 1];
        }
        int rightUp; // 바로 위에서 오는 경우
        if (j == i) {
          rightUp = 0;
        } else {
          rightUp = dp[i - 1][j];
        }
        System.out.println("rightUp = " + rightUp);
        System.out.println("leftUp = " + leftUp);
        dp[i][j] = Math.max(leftUp, rightUp) + num[i][j];
      }
    }

    // 마지막 행에서 최대값 찾기
    int max = dp[n-1][0];
    for(int i = 1; i < n; i++) {
      if(dp[n-1][i] > max) {
        max = dp[n-1][i];
      }
    }
    for(Integer [] c: dp) {
      for(Integer b :c ){
        System.out.print(b+" ");
      }
      System.out.println();
    }
    System.out.println(max);
  }
}

