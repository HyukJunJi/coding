package com.example.coding._2024.재귀.DFS;

import java.util.ArrayList;
import java.util.List;

public class Dfs_cd {
  static List<Integer>[] nodeList;
  static boolean[] visited;

  public static void main(String[] args) {
    // 입력 데이터
    int N = 5;
    int[][] nodes = {{0, 1}, {0, 2}, {1, 3}, {1, 4}};

    // 리스트, 배열 초기화
    nodeList = new ArrayList[N];
    for(int i = 0; i < N; i++) {
      nodeList[i] = new ArrayList<>();
    }
    visited = new boolean[N];

    // 입력받은 간선을 간선 리스트에 저장
    for(int[] e : nodes){
      nodeList[e[0]].add(e[1]);
      nodeList[e[1]].add(e[0]);
    }

    // 0부터 출발, 0은 방문 처리
    dfs(0);
  }

  static void dfs(int cur) {
    if (visited[cur]) { // 이미 방문한 노드라면 더 이상 탐색하지 않음
      return;
    }

    visited[cur] = true; // 현재 노드 방문 처리
    System.out.println(cur); // 현재 노드 출력

    for(int next : nodeList[cur]) {
      if(!visited[next]) { // 이어진 노드가 방문한 곳이 아니면
        dfs(next); // 해당 노드부터 재귀 호출
      }
    }
  }
}
