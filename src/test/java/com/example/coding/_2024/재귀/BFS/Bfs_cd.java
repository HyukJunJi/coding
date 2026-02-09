package com.example.coding._2024.재귀.BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs_cd {
  static List<Integer>[] nodeList;
  static boolean[] visited;

  public static void main(String[] args) {
    // 입력 데이터
    int N = 5; // 노드의 개수
    int[][] nodes = {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2,3},{3,4},{4,2}}; // 간선 정보

    // 리스트, 배열 초기화
    nodeList = new ArrayList[N];
    for (int i = 0; i < N; i++) {
      nodeList[i] = new ArrayList<>();
    }
    visited = new boolean[N];

    // 입력받은 간선을 간선 리스트에 저장
    for (int[] e : nodes) {
      nodeList[e[0]].add(e[1]);
      nodeList[e[1]].add(e[0]);
    }
    System.out.println(Arrays.stream(nodeList).toList());

    // BFS 시작
    bfs(0);
  }

  static void bfs(int start) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start); // 시작 노드를 큐에 추가
    visited[start] = true; // 시작 노드를 방문 처리

    while (!queue.isEmpty()) {
      int current = queue.poll(); // 큐에서 하나의 원소를 꺼내고 방문
      System.out.println(current); // 현재 노드 출력

      // 현재 노드에 연결된 모든 노드를 순회
      for (int next : nodeList[current]) {
        System.out.println(">>"+next);
        if (!visited[next]) { // 방문하지 않은 노드라면
          visited[next] = true; // 방문 처리
          queue.add(next); // 큐에 추가
        }
      }
    }
  }
}

