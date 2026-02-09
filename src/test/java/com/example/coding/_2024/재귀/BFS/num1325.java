package com.example.coding._2024.재귀.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class num1325 {
  public static List<List<Integer>> num;
  public static boolean[] visited;
  public static int N,M;
  public static Queue<Integer> queue;
  public static int cnt = 0;
  public static List<Integer> c;
  public static int max = Integer.MIN_VALUE;
  public static List<Integer> list;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    num = new LinkedList<List<Integer>>();
    list = new ArrayList<>();
    for(int i = 0 ; i < N+1 ; i++) {
      num.add(new LinkedList<>());
    }
    queue = new LinkedList<>();
    c = new ArrayList<>();
    visited = new boolean[N+1];
    for(int i = 0 ; i < M ; i++) {
      StringTokenizer st1 = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st1.nextToken());
      int y = Integer.parseInt(st1.nextToken());
      num.get(y).add(x);
    }
    for(int i = 1 ; i < N+1;i++) {
      if(!visited[i]){
        BFS(i);
        if(cnt>=max) {
          max = cnt;
          c.add(i);
        }
      }
      visited = new boolean[N+1];
      cnt = 0;
    }
    c.sort(Integer::compareTo);
    for(Integer h: c){
      System.out.print(h+" ");
    }
  }
  public static void BFS(int start) {
    queue.add(start);
    visited[start] = true;
    while(!queue.isEmpty()) {
      int cur = queue.poll();
      for(Integer next:num.get(cur)) {
        if(!visited[next]) {
          visited[next] = true;
          cnt++;
          queue.add(next);
        }
      }
    }
  }
}
