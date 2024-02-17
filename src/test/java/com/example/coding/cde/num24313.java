package com.example.coding.cde;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class num24313{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int []a = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int c = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());

    if(a[0]*n+a[1] <= c * n && c >= a[0]) {
      System.out.println(1);
    } else{
      System.out.println(0);
    }
  }
}
