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

public class num2583 {
  public static int M,N,K;
  public static int[][]num;
  public static int[] dx = {0, 0 , 1 , -1};
  public static int[] dy = {1, -1, 0 , 0 };
  public static boolean[][] visited;
  public static Queue<Integer> queue;
  public static List<Integer> list;
  public static int cnt = 1;
  public static int totalcnt = 0 ;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    M = Integer.parseInt(st.nextToken());
    N = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());
    num = new int[M][N];
    list = new ArrayList<>();
    visited = new boolean[M][N];
    queue = new LinkedList<>();
    for(int i = 0 ; i < K ; i++) {
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      for(int j = array[0] ; j < array[2]; j++) {
        for(int k = array[1]; k < array[3]; k++) {
          num[k][j] = 1;
        }
      }
    }
    for(int i = 0 ; i < M ; i++) {
      for(int j = 0 ; j < N; j++) {
        if(num[i][j]==0 && !visited[i][j]) {
          BFS(i,j);
          totalcnt++;
          cnt=1;
        }

      }
    }
    System.out.println(totalcnt);
    list.sort(Integer::compareTo);
    for(Integer n : list) {
      System.out.print(n+" ");
    }
  }
  public static void BFS(int i,int j) {
    queue.add(i);
    queue.add(j);
    visited[i][j] = true;
    while(!queue.isEmpty()) {
      i = queue.poll();
      j = queue.poll();
      for(int a = 0 ; a < 4 ; a++) {
        int x = dx[a] + i;
        int y = dy[a] + j;
        if(x<M&&y<N&&x>=0&&y>=0&&num[x][y]!=1&& !visited[x][y]) {
          queue.add(x);
          queue.add(y);
          visited[x][y] = true;
          cnt++;
        }
      }
    }
    list.add(cnt);
  }
}
