package com.example.coding._2024.정렬.삽입정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num24051 {
  static int N, K;
  static int[] A;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());
    A = new int[N+1];
    st = new StringTokenizer(br.readLine());
    for (int i=1; i<=N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }
    int cnt = 0;
    for (int i=2; i<=N; i++) {
      int loc = i - 1;
      int newItem = A[i];
      while (1 <= loc && newItem < A[loc]) {
        A[loc + 1] = A[loc];
        cnt++;
        if (cnt == K) {
          System.out.println(A[loc]);
          return;
        }
        loc--;
      }
      if (loc + 1 != i) {
        A[loc + 1] = newItem;
        cnt++;
        if (cnt == K) {
          System.out.println(newItem);
          return;
        }
      }
    }

    System.out.println(-1);
  }
}
