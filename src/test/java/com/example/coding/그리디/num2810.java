package com.example.coding.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2810 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    char[] charArray = br.readLine().replace("LL", "S").toCharArray();
    if(N>=charArray.length+1) {
      System.out.println(charArray.length+1);
    } else if(N<=charArray.length+1) {
      System.out.println(N);
    }
  }
}
