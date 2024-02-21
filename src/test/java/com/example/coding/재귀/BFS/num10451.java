package com.example.coding.재귀.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class num10451 {
  public static int N;
  public static int[][] arrs;
  public static Queue<Integer> queue;
  public static boolean[][] visited;
  public static int cnt = 0 ;
  public static StringBuilder sb= new StringBuilder();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    arrs = new int[T][];
    visited = new boolean[T][];
    queue = new LinkedList<>();

    for (int i = 0; i < T; i++) {
      N = Integer.parseInt(br.readLine());
      arrs[i] = new int[N];
      visited[i] = new boolean[N];
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      for (int j = 0; j < arrs[i].length; j++) {
        arrs[i][j] = array[j]-1;
      }
    }
    for (int i = 0; i < T; i++) {
      for (int j = 0; j < arrs[i].length; j++) {
        BFS(j,i);
      }
      sb.append(cnt);
      cnt=0;
      sb.append("\n");
    }
    System.out.println(sb);

  }
  public static void BFS(int vertex,int who) {
    queue.add(vertex);
    visited[who][vertex] = true;
    while(!queue.isEmpty()) {
      int num = queue.poll();
      int next = arrs[who][num];
      if(!visited[who][next]) {
        queue.add(next);
        visited[who][next] = true;
      }
      if (vertex == next) {
        cnt++;
        break;
      }
    }
  }
}
