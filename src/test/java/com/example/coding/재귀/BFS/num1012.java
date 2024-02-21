package com.example.coding.재귀.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class num1012 {
  public static boolean[][] visited;
  public static int M;
  public static int N;
  public static int K;
  public static int cnt=0;
  public static int[][] nums;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    for(int i = 0 ; i < T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      M = Integer.parseInt(st.nextToken());
      N = Integer.parseInt(st.nextToken());
      K = Integer.parseInt(st.nextToken());
      nums = new int[M][N];
      visited = new boolean[M][N];
      for(int j = 0 ; j < K ; j++ ){
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        nums[arr[0]][arr[1]] = 1;
      }
      for(int k = 0 ; k < M; k++) {
        for(int j = 0 ; j < N ; j++){

          if(nums[k][j]==1 && !visited[k][j]) {
            DFS(k,j);
            cnt++;
          }
        }
      }
      System.out.println(cnt);
      cnt=0;
    }
  }
  public static void DFS(int i,int j) {
    if(i < 0 || j < 0 ||i>M-1 || j>N-1 ||nums[i][j]==0 ) {
      return;
    }
    if(!visited[i][j]) {
      visited[i][j] = true;
      DFS(i+1,j);
      DFS(i,j+1);
      DFS(i-1,j);
      DFS(i,j-1);

    }
  }

}
