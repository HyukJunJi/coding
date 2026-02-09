package com.example.coding._2024.브루스포트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2839 {
  public static void main(String[] args) throws IOException {
    /*
    * 3킬로 5킬로
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int cnt= 0 ;
    while(N > 0) {
      if(N%5==0) {
        cnt = cnt + N/5;
        System.out.println(cnt);
        return ;
      }
      if(N<3) {
        System.out.println(-1);
        return ;
      }
      N = N-3;
      cnt++;
    }
    System.out.println(cnt);
  }
}
