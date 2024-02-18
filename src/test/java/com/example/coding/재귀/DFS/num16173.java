package com.example.coding.재귀.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num16173 {
  public static int cnt;
  static boolean[][] visited;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[][] num = new int[N][N];
    for(int i = 0 ; i < N;i++) {
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      System.arraycopy(array, 0, num[i], 0, array.length);
    }
    visited = new boolean[N][N];
    cnt=0;
    dfs(num,0,0);
    if(cnt==1) {
      System.out.println("HaruHaru");
    } else{
      System.out.println("Hing");
    }
  }
  public static void dfs(int[][]num,int row,int column) {
    if(row>num.length-1 || column>num[0].length-1) {
      return;
    }
    int ju = num[row][column];
    if(ju==-1){
      cnt++;
      return;
    }
    if(!visited[row][column]) {
      visited[row][column] = true;
      dfs(num, row + ju, column);
      dfs(num, row, column + ju);
    }
  }
}
