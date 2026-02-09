package com.example.coding._2024.재귀.트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class num11725 {
  public static List<List<Integer>> nums;
  public static int N;
  public static boolean[] visited;
  public static int[] answer;
  public static Queue<Integer> queue;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    nums = new ArrayList<List<Integer>>();
    for (int i = 0; i < N + 1; i++) {
      nums.add(new ArrayList<>());
    }
    queue = new LinkedList<>();
    answer = new int[N + 1];
    visited = new boolean[N + 1];
    visited[1] = true;
    for (int i = 0; i < N - 1; i++) {
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      nums.get(array[0]).add(array[1]);
      nums.get(array[1]).add(array[0]);
    }

    BFS(1);
    for(int i = 2; i < N+1; i ++) {
      System.out.println(answer[i]);
    }
  }
  public static void BFS(int cur) {
    queue.add(cur);
    visited[cur] = true;
    while(!queue.isEmpty()) {
      cur = queue.poll();
      for(Integer next: nums.get(cur)) {
        if(!visited[next]) {
          queue.add(next);
          visited[next] = true;
          answer[next] = cur;
        }
      }
    }
  }
}
