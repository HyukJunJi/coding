package com.example.coding.그리디;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Jewelry {
  int mass; // 무게
  int value; // 가격

  Jewelry(int mass, int value) {
    this.mass = mass;
    this.value = value;
  }
}

public class num1202fail {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    Jewelry[] jewelries = new Jewelry[N];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int m = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());

      jewelries[i] = new Jewelry(m, v);
    }
    // 무게를 오름차순 정렬하되, 무게가 같을 경우 가격을 내림차순 정렬.
    Arrays.sort(jewelries, new Comparator<Jewelry>() {

      @Override
      public int compare(Jewelry o1, Jewelry o2) {
        if (o1.mass == o2.mass) {
          return o2.value - o1.value;
        }
        return o1.mass - o2.mass;
      }

    });

    int[] bags = new int[K];
    for (int i = 0; i < K; i++) {
      bags[i] = Integer.parseInt(br.readLine());
    }
    // 가방의 무게를 오름차순 정렬
    Arrays.sort(bags);
    System.out.println("bags");
    for(int g : bags) {
      System.out.print(g+" ");
    }
    System.out.println();
    for(Jewelry j : jewelries) {
      System.out.println("j.mass+\" \"+j.value = " + j.mass+" "+j.value);
    }
    // 우선순위 큐는 항상 가격이 내림차순 정렬되도록 설정.
    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    long ans = 0;
    for (int i = 0, j = 0; i < K; i++) {
      // 현재 가방의 무게보다 작거나 같은 보석을 모두 우선순위 큐에 넣음.
      System.out.println("bags[i]+\" \"+jewelries[j].mass = " + bags[i]+" "+jewelries[j].mass);
      while (j < N && jewelries[j].mass <= bags[i]) {
        System.out.println("bags[i]+\" \"+jewelries[j].mass = " + bags[i]+" "+jewelries[j].mass);
        System.out.println("jewelries[j].value = " + jewelries[j].value);
        pq.offer(jewelries[j++].value);
      }
      for(Integer p : pq) {
        System.out.print(p+" ");
      }
      System.out.println();

      // 우선순위 큐에 있는 요소를 하나 빼서 가방에 넣음.
      // 이 때, 우선순위 큐는 내림차순 정렬이 되어있으므로
      // 첫 번째 요소는 가장 큰 가격을 의미함.
      if (!pq.isEmpty()) {
        ans += pq.poll();
        System.out.println("ans="+ans);
      }
    }

    bw.write(ans + "\n");
    bw.flush();
    bw.close();
    br.close();
  }

}

