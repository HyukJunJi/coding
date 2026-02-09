package com.example.coding._2024.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class num1744 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int [] num = new int[N];
    int tmp = 0 ;
    int sum=0;
    PriorityQueue<Integer> pq =  new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> pqq =  new PriorityQueue<>();
    for(int i = 0 ; i < N ; i++) {
      num[i] = Integer.parseInt(br.readLine());
    }
    for(int i = num.length - 1; i >= 0; i--) {
      if(num[i]<=0) {
        pqq.add(num[i]);
      } else {
        pq.add(num[i]);
      }
    }
    while(!pq.isEmpty()) {
      if(pq.size()>=2) {
        int a =pq.poll();
        int b= pq.poll();
        if(a==1 || b==1) {
          tmp = a+b;
          sum+=tmp;
        } else {
          tmp = a * b;
          sum += tmp;
        }
      } else {
        tmp = pq.poll();
        sum += tmp;
      }
    }
    while(!pqq.isEmpty()) {
      if(pqq.size()>=2) {
        tmp = pqq.poll()*pqq.poll();
        sum += tmp;
      } else {
        tmp = pqq.poll();
        sum += tmp;
      }
    }
    System.out.println(sum);

  }
}
