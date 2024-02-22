package com.example.coding.재귀.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class num4963fail {
  public static int [][] nums;
  public static boolean[][] visited;
  public static Queue<Integer> queue;
  public static int w;
  public static int h;
  public static int cnt = 0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      w = Integer.parseInt(st.nextToken());
      h = Integer.parseInt(st.nextToken());
      if(w==0 && h==0) {
        break;
      }
      queue = new LinkedList<>();
      nums = new int[h][w];
      visited = new boolean[h][w];
      for(int i = 0 ; i < h ; i++) {
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int j = 0 ; j< array.length;j++) {
          nums[i][j] = array[j];
        }
      }
//      for(int[] n : nums) {
//        for(int a: n) {
//          System.out.print(a+" ");
//        }
//        System.out.println();
//      }
      for(int i = 0 ; i < h; i++) {
        for(int j = 0 ; j < w ; j++) {
          if(!visited[i][j] && nums[i][j] ==1) {
//            DFS(i,j);
//            cnt++;
          }
        }
      }
      System.out.println(cnt);
      cnt=0;
    }
  }
  public static void BFS(int i, int j) {

  }
//  public static void DFS(int i, int j) {
//    if(i<0 || j < 0 || i >= h || j >= w || nums[i][j] == 0 ) {
//      return;
//    }
//    if(!visited[i][j]) {
//      DFS(i+1,j);
//      DFS(i,j+1);
//      DFS(i-1,j);
//      DFS(i,j-1);
//      DFS(i-1,j-1);
//      DFS(i-1,j+1);
//      DFS(i+1,j-1);
//      DFS(i+1,j+1);
//    }
//  }
}
