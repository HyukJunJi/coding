package com.example.coding._2024.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num11047 {
  public static int[] coins;
  public static int[] cnt;
  public static int n=0;
  public static int total =0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    coins = new int[N];
    cnt = new int[N];
    for(int i = 0 ; i < N;i++) {
      coins[i] = Integer.parseInt(br.readLine());
    }
    for(int i = N - 1; i >= 0; i--) {
      n=K/coins[i];
      K%=coins[i];
      if(n!=0) {
        cnt[i]+=n;
      }
    }
    for(int c:cnt) {
      total+=c;
    }
    System.out.println(total);
  }
}
