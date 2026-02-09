package com.example.coding._2024.브루스포트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class num19532 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int [] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int a = arr[0];
    int b = arr[1];
    int c = arr[2];
    int d = arr[3];
    int e = arr[4];
    int f = arr[5];
    int x,y;
    y = (((c*d-a*f))/((b*d-a*e)));
    x = (((c*e-b*f))/((a*e-b*d)));
    System.out.println(x+" "+y);
  }
}
