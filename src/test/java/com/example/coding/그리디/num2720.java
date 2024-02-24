package com.example.coding.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2720 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    for(int i = 0 ; i < T ; i ++) {
      int qu=0,di=0,ni=0,p=0;
      int next= 0 ;
      int Money = Integer.parseInt(br.readLine());
      qu = Money/25;
      Money = Money%25;
      di = Money/10;
      Money = Money%10;
      ni = Money/5;
      Money = Money%5;
      p = Money/1;
      Money = Money%1;
      System.out.println(qu+" "+di+" "+ni+" "+p);
    }
  }

}
