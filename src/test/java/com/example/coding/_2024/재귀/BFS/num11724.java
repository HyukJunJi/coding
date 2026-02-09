package com.example.coding._2024.재귀.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class num11724 {

  public static int cnt = 0;
  public static boolean[] visited;
  public static Queue<Integer> queue = new LinkedList<>();
  public static List<List<Integer>> arrs;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st =new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    visited = new boolean[N];

    arrs = new ArrayList<List<Integer>>();
    for(int i = 0 ; i < N ; i++) {
      arrs.add(new ArrayList<>());
    }
    for(int i = 0 ; i < M ; i ++) {
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      arrs.get(array[0]-1).add(array[1]-1);
      arrs.get(array[1]-1).add(array[0]-1);
    }

    for(int i = 0 ; i < N ; i ++) {
      if(!visited[i]) {
        BFS(i);
        cnt++;
      }
    }
    System.out.println(cnt);
  }
  public static void BFS(int vertex) {
    queue.add(vertex);
    visited[vertex] = true;
    while(!queue.isEmpty()) {
      int n = queue.poll();
      for(int next: arrs.get(n)) {
        if(!visited[next]) {
          queue.add(next);
          visited[next] = true;
        }
      }
    }
  }
}
