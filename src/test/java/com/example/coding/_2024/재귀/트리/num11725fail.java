package com.example.coding._2024.재귀.트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class num11725fail {
  public static List<List<Integer>> nums;
  public static int N;
  public static boolean[] visited;
  public static int[] answer;
   public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    nums = new ArrayList<List<Integer>>();
    for(int i = 0 ; i < N+1 ; i++) {
      nums.add(new ArrayList<>());
    }
    answer = new int[N+1];
    visited = new boolean[N+1];
    visited[1] = true;
    for(int i = 0 ; i < N-1 ; i++ ){
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      if(!visited[array[0]] && !visited[array[1]]) {
        visited[array[0]] = true;
        visited[array[1]] = true;
        nums.get(array[0]).add(array[1]);
      } else if(visited[array[0]] && !visited[array[1]]) {
        visited[array[1]] = true;
        nums.get(array[0]).add(array[1]);
      } else if(!visited[array[0]] && visited[array[1]]) {
        visited[array[0]] = true;
        nums.get(array[1]).add(array[0]);
      } else if(visited[array[0]] && visited[array[1]]) {
        nums.get(array[0]).add(array[1]);
      }
    }
    int i = 0;
    for(List<Integer> a : nums) {
      System.out.println("i = "+i);
      for(Integer b : a) {
        System.out.print(b+" ");
        answer[b] = i;
      }
      System.out.println();
      i++;
    }
    for(int j = 2; j < N+1;j++) {
      System.out.println(answer[j]);
    }
     System.out.println(answer.length);
  }
}
