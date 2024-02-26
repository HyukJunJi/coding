package com.example.coding.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
public class num1715 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    PriorityQueue<Long> pq = new PriorityQueue<>();
    for(int i = 0 ; i < N ; i ++) {
      pq.offer(Long.parseLong(br.readLine()));
    }
    long num = 0 ;
    while(pq.size()>1) {
      long tmp1 = pq.poll();
      long tmp2 = pq.poll();
      num += tmp1 + tmp2;
      pq.add(tmp1 + tmp2);
    }
    System.out.println(num);

  }
}
