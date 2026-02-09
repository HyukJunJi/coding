package com.example.coding._2024.재귀.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 높이가 0 이상이라면서 0은 왜고려해
 */
public class num2486 {
  public static int N;
  public static int[][] num;
  public static boolean[][] visited;
  public static int maxHeight = Integer.MIN_VALUE;
  public static int[] dx = {1,-1,0,0};
  public static int[] dy = {0,0,1,-1};
  public static int cnt=0;
  public static int max = Integer.MIN_VALUE;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    num = new int[N][N];
    visited = new boolean[N][N];
    for(int i = 0 ; i < N ; i++) {
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      for(int j = 0 ; j < array.length; j++) {
        if(array[j]>max) {
          max = array[j];
        }
        num[i][j] = array[j];
      }
    }
    for(int i = 0 ; i < max ; i++) {
      for(int j = 0 ; j < N ; j++) {
        for(int k = 0 ; k < N ; k++) {
          if(!visited[j][k] && num[j][k] > i) {
            DFS(i, j, k);
            cnt++;
          }
        }
      }
      System.out.println("cnt="+cnt);
      visited = new boolean[N][N];
      if(cnt>maxHeight) {
        maxHeight = cnt;
      }
      cnt = 0;
    }
    System.out.println(maxHeight);
  }
  public static void DFS(int height,int i, int j) {
    if(i < 0 || j < 0 || i >= N || j >= N || num[i][j]<=height) {
      return;
    }
    for(int a = 0 ; a < 4 ;a++) {
      int x = dx[a] + i;
      int y = dy[a] + j;
      if(x >= 0 && y >= 0 && x < N && y < N) {
        if(num[x][y] > height && !visited[x][y]) {
          visited[x][y] = true;
          DFS(height,x,y);
        }
      }
    }


  }
}
