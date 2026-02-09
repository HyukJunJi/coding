package com.example.coding._2024.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num1149 {
  final static int Red = 0;
  final static int Green = 1;
  final static int Blue = 2;

  static int[][] Cost;
  static int[][] DP;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Cost = new int[N][3];
    DP = new int[N][3];

    for(int i = 0 ; i < N ; i++) {
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      Cost[i][Red] = array[0];
      Cost[i][Green] = array[1];
      Cost[i][Blue] = array[2];
    }
    DP[0][Red] = Cost[0][Red];
    DP[0][Green] = Cost[0][Green];
    DP[0][Blue] = Cost[0][Blue];

    System.out.println(Math.min(Paint_cost(N - 1, Red), Math.min(Paint_cost(N - 1, Green), Paint_cost(N - 1, Blue))));
    for(int[] d: DP) {
      for(int b: d) {
        System.out.print(b+" ");
      }
      System.out.println();
    }
  }

  static int Paint_cost(int N, int color) {

    // 만약 탐색하지 않은 배열이라면
    if(DP[N][color] == 0) {
      // color의 색에 따라 이전 집의 서로 다른 색을 재귀호출하여 최솟값과 현재 집의 비용을 더해서 DP에 저장한다
      if(color == Red) {
        DP[N][Red] = Math.min(Paint_cost(N - 1, Green), Paint_cost(N - 1, Blue)) + Cost[N][Red];
      }
      else if(color == Green) {
        DP[N][Green] = Math.min(Paint_cost(N - 1, Red), Paint_cost(N - 1, Blue)) + Cost[N][Green];
      }
      else {
        DP[N][Blue] = Math.min(Paint_cost(N - 1, Red), Paint_cost(N - 1, Green)) + Cost[N][Blue];
      }
    }
    return DP[N][color];
  }
}
