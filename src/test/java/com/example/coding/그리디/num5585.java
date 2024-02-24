package com.example.coding.그리디;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class num5585 {
  public static int[] en= {500,100,50,10,5,1};
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    int N = 1000-T;
    int totalCnt = 0;
    int[] moneyCnt= new int[6];
    for(int i = 0 ; i <en.length; i++) {
      moneyCnt[i] = N/en[i];
      N = N%en[i];
    }
    for(int i = 0; i <  6; i ++) {
      totalCnt+=moneyCnt[i];
    }
    System.out.println(totalCnt);

  }
}
