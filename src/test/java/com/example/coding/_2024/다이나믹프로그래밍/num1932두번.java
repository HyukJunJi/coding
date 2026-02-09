package com.example.coding._2024.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num1932두번 {
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
    for (int i = 0; i < n; i++) {
      dp[n - 1][i] = num[n - 1][i];
    }
    System.out.println(find(0, 0));
    for(Integer [] c: dp) {
      for(Integer b :c ){
        System.out.print(b+" ");
      }
      System.out.println();
    }
  }


  static int find(int depth, int idx) {
    // 마지막 행일 경우 현재 위치의 dp값 반환
    if(depth == n - 1) return dp[depth][idx];

    // 탐색하지 않았던 값일 경우 다음 행의 양쪽 값 비교
    if (dp[depth][idx] == null) {
      dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + num[depth][idx];
    }
    return dp[depth][idx];

  }
}
