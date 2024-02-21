package com.example.coding.재귀.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class num2606 {
  public static List<List<Integer>> networks;
  public static int cnt=0;
  public static boolean[] visited;
  public static int N;
  public static int M;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    M = Integer.parseInt(br.readLine());
    visited = new boolean[N+1];
    networks = new ArrayList<List<Integer>>();
    for(int i = 0 ; i <=N;i++) {
      networks.add(new ArrayList<>());
    }
    for(int i = 0 ; i < M ; i++) {
      int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      networks.get(num[0]).add(num[1]);
      networks.get(num[1]).add(num[0]);
    }

    dfs(1);
    System.out.println(cnt);
  }
  public static void dfs(int cur) {
    if(visited[cur]) {
      return;
    }
    visited[cur] = true;
    for(int next: networks.get(cur)) {
      if(!visited[next]) {
        cnt+=1;
        dfs(next);
      }
    }
  }
}
