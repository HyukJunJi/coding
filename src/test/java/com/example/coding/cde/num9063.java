package com.example.coding.cde;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class num9063 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int maxX = Integer.MIN_VALUE;
    int maxY = Integer.MIN_VALUE;
    int minX = Integer.MAX_VALUE;
    int minY = Integer.MAX_VALUE;
    for(int i = 0 ; i < N ; i++) {
      int[] num = Stream
          .of(br.readLine().split(" "))
          .mapToInt(Integer::parseInt)
          .toArray();
      if(num[0] > maxX) {
        maxX = num[0];
      }
      if(num[1] > maxY) {
        maxY = num[1];
      }
      if(num[0] < minX) {
        minX = num[0];
      }
      if(num[1] < minY) {
        minY = num[1];
      }
    }
    System.out.println((maxX-minX)*(maxY-minY));
  }
}
