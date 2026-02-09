package com.example.coding._2024.재귀.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class num1260 {

  public static boolean[] visited;
  public static int N;
  public static int M;
  static List<List<Integer>> nodeList;
  static Queue<Integer> queue;


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] NMV = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    N = NMV[0];
    M = NMV[1];
    int V = NMV[2];
    queue = new LinkedList<>();
    visited = new boolean[N + 1];
    nodeList = new ArrayList<List<Integer>>();
    for (int i = 0; i <= N; i++) {
      nodeList.add(new ArrayList<Integer>());
    }

    for (int i = 0; i < M; i++) {
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      nodeList.get(array[0]).add(array[1]);
      nodeList.get(array[1]).add(array[0]);
    }
    for (List<Integer> list : nodeList) {
      list.sort(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
          return o1-o2;
        }
      });
    }
    dfs(V);
    visited = new boolean[N+1];
    System.out.println();
    bfs(V);
  }

  static void dfs(int cur) {
    if (visited[cur]) {
      return;
    }

    visited[cur] = true;
    System.out.print(cur+" ");

    for(int next : nodeList.get(cur)) {
      if(!visited[next]) {
        dfs(next);
      }
    }
  }
  static void bfs(int cur) {
    queue.add(cur);
    visited[cur] = true;

    while(!queue.isEmpty()) {
      cur = queue.poll();
      System.out.print(cur+" ");
      for(int next: nodeList.get(cur)) {
        if(!visited[next]) {
          queue.add(next);
          visited[next] = true;
        }
      }
    }
  }
}