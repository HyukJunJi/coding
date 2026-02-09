package com.example.coding._2024.cde;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class num2581 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int M = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());
    List<Integer> soSu = new ArrayList<>();
    List<Integer> whoIsSoSu = new ArrayList<>();
    int sum = 0;
    for(int i = M ; i <= N ; i++){
      for(int j = 1 ; j <= i ; j++) {
        if(i%j==0) {
          soSu.add(j);
        }
      }
      if(soSu.size()==2) {
        whoIsSoSu.add(i);
      }
      soSu.clear();
    }
    if(!whoIsSoSu.isEmpty()) {
      for (Integer integer : whoIsSoSu) {
        sum = sum + integer;
      }
      System.out.println(sum);
      System.out.println(whoIsSoSu.get(0));
    } else{
      System.out.println(-1);
    }
  }
}
