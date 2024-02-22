package com.example.coding.재귀.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class num24479 {
  public static int N;
  public static int M;
  public static int [][]num;
  public static boolean [] visited;
  public static List<List<Integer>> list;
  public static int [] n;
  public static int cnt=1;
  public static int R;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    R = Integer.parseInt(st.nextToken());
    num = new int[M][2];
    visited = new boolean[N+1];
    list = new ArrayList<List<Integer>>();
    n = new int[N+1];
    for(int i = 0 ; i<N+1 ; i++) {
      list.add(new ArrayList<>());
    }
    for (int i = 0; i < M; i++) {
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      for (int j = 0; j < array.length; j++) {
        num[i][j] = array[j];
      }
    }
    Arrays.sort(num, (a, b) -> {
          if (a[0] == b[0]) {
            return Integer.compare(a[1], b[1]);
          } else {
            return Integer.compare(a[0], b[0]);
          }
        }
    );
    for(int i = 0 ; i < M ; i ++) {
      list.get(num[i][0]).add(num[i][1]);
      list.get(num[i][1]).add(num[i][0]);
    }

    DFS(R);
    for(int i = 0 ; i < N; i++) {
      System.out.println(n[i]);
    }
  }
  public static void DFS(int cur) {
    if(visited[cur]) {
      return;
    }
    visited[cur] = true;
      n[cur-1] = cnt;
    for(Integer next: list.get(cur)) {
      if(!visited[next]) {
        cnt+=1;
        DFS(next);
      }
    }
  }
}
