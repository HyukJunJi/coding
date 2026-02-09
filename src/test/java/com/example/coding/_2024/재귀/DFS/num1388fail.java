package com.example.coding._2024.재귀.DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num1388fail {
  static int N, M;
  static char[][] arr;
  static boolean[][] visited;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    arr = new char[N][M];
    visited = new boolean[N][M];

    for (int i = 0; i < N; i++) {
      String str = br.readLine();
      for (int j = 0; j < M; j++) {
        arr[i][j] = str.charAt(j);
      }
    }

    int cnt = 0;

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if(visited[i][j]) continue;
        if(arr[i][j] == '-') {
          System.out.println(i+" "+j);
          dfs(i, j, true);
          System.out.println("roop-"+i+" "+j);
        }
        else {
          System.out.println(i+" "+j);
          dfs(i, j, false);
          System.out.println("roop|"+i+" "+j);
        }
        cnt++;
      }
    }
    System.out.println(cnt);

  }

  private static void dfs(int i, int j, boolean row) {
    visited[i][j] = true;
    if(row) {
      j++;
      if(j<M && arr[i][j] == '-') {
        dfs(i, j, true);
        System.out.println(i+"dfs- "+j);
      }
    }
    else {
      i++;
      if(i<N && arr[i][j] == '|') {
        dfs(i, j, false);
        System.out.println(i+"dfs| "+j);
      }
    }

  }
}
