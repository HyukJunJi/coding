package com.example.coding.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num1495포문 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int S = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[] volumes = new int[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      volumes[i] = Integer.parseInt(st.nextToken());
    }

    boolean[][] dp = new boolean[N + 1][M + 1];
    dp[0][S] = true;

    for (int i = 1; i <= N; i++) {
      for (int j = 0; j <= M; j++) {
        if (!dp[i - 1][j]) continue;
        if (j - volumes[i - 1] >= 0) dp[i][j - volumes[i - 1]] = true;
        if (j + volumes[i - 1] <= M) dp[i][j + volumes[i - 1]] = true;
      }
    }

    int answer = -1;
    for (int i = M; i >= 0; i--) {
      if (dp[N][i]) {
        answer = i;
        break;
      }
    }
    for(boolean[] d: dp) {
      for(boolean b : d) {
        System.out.print(b+" ");
      }
      System.out.println();
    }
    System.out.println(answer);
  }
}

