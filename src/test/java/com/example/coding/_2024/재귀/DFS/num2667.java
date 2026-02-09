package com.example.coding._2024.재귀.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class num2667 {
  public static int N;
  public static int[][] house;
  public static int[] dx = {1,-1, 0 ,0 };
  public static int[] dy = {0, 0 ,1 ,-1};

  public static boolean[][] visited;
  public static List<Integer> list;
  public static int cnt = 1;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    house = new int[N][N];
    visited = new boolean[N][N];
    for(int i = 0 ; i < N ; i++) {
      int[] array = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
      for(int j = 0 ; j <N ; j++) {
        house[i][j] = array[j];
      }
    }
    list = new ArrayList<>();

    for(int i = 0 ; i < N ; i++) {
      for(int j = 0 ; j < N ; j++) {
        if(!visited[i][j] && house[i][j] !=0) {
          DFS(i, j);
          list.add(cnt);
          cnt = 1;
        }
      }
    }
    System.out.println(list.size());
    list.sort(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1-o2;
      }
    });
    for(Integer l: list) {
      System.out.println(l);
    }
  }
  public static void DFS(int i,int j) {
    if(i < 0 || j < 0 || i >= N || j >=N || house[i][j]==0) {
      return;
    }
    visited[i][j] = true;
    for(int a = 0 ; a < 4; a++) {
      int x = dx[a] + i;
      int y = dy[a] + j;
      if(x >= 0 && y >=0 && x < N && y < N) {
        if(house[x][y] ==1 && !visited[x][y]){
        visited[x][y] = true;
        cnt++;
        DFS(x, y);
        }
      }

    }
  }
}
