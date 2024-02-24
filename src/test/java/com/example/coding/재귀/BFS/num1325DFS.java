package com.example.coding.재귀.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class num1325DFS {
  public static List<Integer>[] num;
  public static boolean[] visited;
  public static int N,M;
  public static int cnt = 0;
  public static int max = Integer.MIN_VALUE;
  public static List<Integer> list;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    num = new LinkedList[N+1];
    list = new ArrayList<>();
    for(int i = 0 ; i < N+1 ; i++) {
      num[i] = new LinkedList<>();
    }
    visited = new boolean[N+1];
    for(int i = 0 ; i < M ; i++) {
      StringTokenizer st1 = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st1.nextToken());
      int y = Integer.parseInt(st1.nextToken());
      num[y].add(x);
    }
    for(int i = 1 ; i < N+1;i++) {
      if(!visited[i]){
        DFS(i);
        if(cnt>=max) {
          max = cnt;
          list.add(i);
        }
      }
      visited = new boolean[N+1];
      cnt = 0;
    }
    list.sort(Integer::compareTo);
    for(Integer a: list) {
      System.out.print(a+" ");
    }
  }
  public static void DFS(int start) {
    if(visited[start]) {
      return;
    }
    visited[start] = true;
    for(Integer next: num[start]) {
      if(!visited[next]) {
        cnt++;
        DFS(next);
      }
    }
  }
}
