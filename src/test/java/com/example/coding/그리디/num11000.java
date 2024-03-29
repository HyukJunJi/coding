package com.example.coding.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class num11000 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[][]num = new int[N][2];
    for(int i = 0 ; i < N ; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      num[i][0] = Integer.parseInt(st.nextToken());
      num[i][1] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(num, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        if(o1[0]==o2[0]) {
          return o1[1]-o2[1];
        }
        return o1[0]-o2[0];
      }
    });
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(num[0][1]);
    for(int i = 1 ; i < N ;i++) {
      if(pq.peek()<=num[i][0]) {
        pq.poll();
      }
      pq.add(num[i][1]);

    }
    System.out.println(pq.size());
  }
}
