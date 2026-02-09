package com.example.coding._2024.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num1495 {
  static int N, S, M;
  static int[] volumes;
  static Integer[][] dp; // 메모이제이션을 위한 배열

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    S = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    volumes = new int[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      volumes[i] = Integer.parseInt(st.nextToken());
    }

    dp = new Integer[N][M + 1]; // 메모이제이션 배열 초기화


    int answer = find(0, S);
    System.out.println(answer);
    for(Integer [] d : dp) {
      for(Integer b : d) {
        System.out.print(b+" ");
      }
      System.out.println();
    }
  }

  public static int find(int index, int volume) {
    if (volume < 0 || volume > M) return -1; // 볼륨이 범위를 벗어난 경우
    if (index == N) return volume; // 모든 곡을 다 처리한 경우

    if (dp[index][volume] != null) return dp[index][volume]; // 이미 계산된 경우

    // 볼륨을 높이거나 낮추어 다음 곡으로 넘어가기
    int plus = find(index + 1, volume + volumes[index]);
    int minus = find(index + 1, volume - volumes[index]);

    // 가능한 최대 볼륨을 메모이제이션 배열에 저장
    dp[index][volume] = Math.max(plus, minus);
    return dp[index][volume];
  }
}
