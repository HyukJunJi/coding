package com.example.coding.cde;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class num11653 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    List<Integer> arr = new ArrayList<>();
    int start = 2;
    while (start<=N) {
      if(N%start==0) {
        N /= start;
        arr.add(start);
      } else{
        start++;
      }
    }
    for(Integer a : arr) {
      System.out.println(a);
    }
   }
}
