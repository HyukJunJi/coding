package com.example.coding.cde;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class num3009 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int [] a = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int [] b = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int [] c = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    int x;
    int y;

    if(a[0] == b[0]) {
      x = c[0];
    } else if(a[0] == c[0]) {
      x = b[0];
    }
    else {
      x = a[0];
    }

    if(a[1] == b[1]) {
      y = c[1];
    } else if(a[1] == c[1]) {
      y = b[1];
    }
    else {
      y = a[1];
    }

    System.out.println(x+" "+y);
  }
}
