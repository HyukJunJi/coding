package com.example.coding._2024.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num1932 {
  public static int[][]num;
  public static Integer[][]dp;
  public static int n;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    num = new int[n][];
    dp = new Integer[n][];
    for(int i = 0 ; i < n ; i++) {
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      num[i] = new int[array.length];
      dp[i] = new Integer[array.length];
      for(int j = 0 ; j< array.length; j++) {
        num[i][j] = array[j];
      }
    }
    System.out.println(find(0,0));
  }
  public static Integer find(int depth, int idx) {
    // Initialize the base case values
    if (depth == n - 1) {
      dp[depth][idx] = num[depth][idx];
      return dp[depth][idx];
    }

    // Check if this position is already computed
    if (dp[depth][idx] == null) {
      dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + num[depth][idx];
    }

    return dp[depth][idx];
  }
}
