package com.example.coding.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num1890 {
  public static int[][] num;
  public static Long[][] dp;
  public static int N;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    num = new int[N][N];
    dp = new Long[N][N];
    for (int i = 0; i < N; i++) {
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      for (int j = 0; j < N; j++) {
        num[i][j] = array[j];
      }
    }

    System.out.println(find(0,0));

  }
  public static Long find(int i, int j) {
    if (i >= N || j >= N) return 0L; // 범위를 벗어난 경우
    if (i == N - 1 && j == N - 1) return 1L; // 도착지에 도달했을 때

    if (dp[i][j] != null) return dp[i][j]; // 이미 계산된 경우

    dp[i][j] = 0L; // 초기화

    int move = num[i][j];
    if (move > 0) {
      if (i + move < N) dp[i][j] += find(i + move, j); // 아래로 이동 가능한 경우
      if (j + move < N) dp[i][j] += find(i, j + move); // 오른쪽으로 이동 가능한 경우
    }
    return dp[i][j];
  }
}
