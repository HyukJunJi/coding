package com.example.coding._2024.cde;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class num14125 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] a = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    Arrays.sort(a);
    if(a[2]>=(a[1]+a[0])) {
      while(a[2]>=(a[1]+a[0])) {
        a[2] = a[2]-1;
      }
    }
    System.out.println(a[0]+a[1]+a[2]);
  }
}
