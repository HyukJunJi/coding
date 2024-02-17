package com.example.coding.재귀;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
  private LinkedList<Integer>[] adjLists;
  private boolean[] visited;

  // 그래프 초기화
  public DFS(int vertices) {
    adjLists = new LinkedList[vertices];
    visited = new boolean[vertices];

    for (int i = 0; i < vertices; i++) {
      adjLists[i] = new LinkedList<Integer>();
    }
  }

  // 간선 추가
  void addEdge(int src, int dest) {
    adjLists[src].add(dest);
  }

  // DFS 실행
  void DFSUtil(int vertex) {
    visited[vertex] = true;
    System.out.print(vertex + " ");

    Iterator<Integer> it = adjLists[vertex].listIterator();
    while (it.hasNext()) {
      int adj = it.next();
      if (!visited[adj])
        DFSUtil(adj);
    }
  }

  // DFS 시작 함수
  void startDFS(int startVertex) {
    DFSUtil(startVertex);
  }

  public static void main(String args[]) {
    DFS g = new DFS(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);

    System.out.println("Depth First Traversal (starting from vertex 2):");

    g.startDFS(0);
  }
}
