package com.example.coding._2024.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class num2302 {
  public static long []dp;


  public static List<Integer> list;
  public static long cnt = 1;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    dp = new long[41];
    list = new ArrayList<>();
    dp[0] = 0 ;
    dp[1] = 1;
    dp[2] = 2;
    for(int i = 3 ; i < 41; i++) {
      dp[i] = dp[i-1]+dp[i-2];
    }
    for(long d:dp) {
      System.out.print(d+" ");
    }
    System.out.println();
    int start = 0;
    int n  = 0;
    for(int i = 0 ; i < M ; i++) {
      n = Integer.parseInt(br.readLine())-1;
      System.out.println("start+\" \"+n = " + start+" "+n);
      start = n-start;
      list.add(start);
      start+=1;
      System.out.println("st="+start);
    }
    System.out.println("start="+start);
    System.out.println("n = " + n);
    System.out.println("(N-1) = " + (N-1));
    if(n<(N-1)) {
      start = (N-1)-n;
      list.add(start);
    }
    for(Integer l : list) {
      if(l!=0) {
        cnt *= dp[l];
      }
    }
    System.out.println(cnt);




  }
}
