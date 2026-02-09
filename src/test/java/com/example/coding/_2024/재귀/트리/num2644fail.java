package com.example.coding._2024.재귀.트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class num2644fail {
  public static int n;
  public static int m;
  public static int ppl1;
  public static int ppl2;
  public static List<List<Integer>> nums;
  public static boolean[] visited;
  public static int CNT=0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    ppl1 = Integer.parseInt(st.nextToken());
    ppl2 = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(br.readLine());
    nums = new ArrayList<List<Integer>>();
    visited = new boolean[n+1];
    for(int i = 0 ; i < n+1 ; i ++) {
      nums.add(new ArrayList<>());
    }
    for(int i = 0 ; i < m ; i ++) {
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      nums.get(array[0]).add(array[1]);
      nums.get(array[1]).add(array[0]);
    }
    int cnt= 0 ;
    DFS(ppl1, cnt, ppl2);
    if(CNT==0) {
      System.out.println(-1);
    }else{
      System.out.println(CNT);
    }
  }
  public static void DFS(int ppl1, int cnt, int ppl2) {
    if(ppl2 == ppl1) {
      CNT = cnt;
      return;
    }
    visited[ppl1] = true;
    for(Integer next: nums.get(ppl1)) {
      if(!visited[next]) {
        visited[next] = true;
        cnt+=1;
        DFS(next, cnt, ppl2);
        cnt-=1;
      }
    }
  }
}
