package com.example.coding._2024.재귀.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num1388 {
  public static int answer;
  public static void main(String[] args) throws IOException {
    answer = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int N = array[0];
    int M = array[1];
    String[][] tiles = new String[N][M];
    for(int i = 0 ; i < N ; i++) {
      String[] split = br.readLine().split("");
      for(int j = 0 ; j < M ; j++) {
        tiles[i][j] = split[j];
      }
    }
    for(String[] t:tiles) {
      for(String b:t) {
        System.out.print(b);
      }
      System.out.println();
    }
    boolean[][] visited = new boolean[N][M];
    int row = 0;
    int column = 0;
    maze(tiles,answer, row, column, visited);
  }
  public static void maze(String[][] tiles,int answer,int row, int column, boolean[][] visited) {

    if(row>=tiles.length-1 || column>=tiles[0].length-1) {
      System.out.println(1);
      return;
    }
    if(!visited[row][column]) {
      visited[row][column] = true;
      String current = tiles[row][column];
      if(current.equals("|")) {
        System.out.println("|"+row+" "+column);
        maze(tiles, answer, row + 1, column, visited);
      }
      if(current.equals("-")) {
        System.out.println("-"+row+" "+column);
        maze(tiles, answer, row, column + 1, visited);
      }
    }
  }
}
