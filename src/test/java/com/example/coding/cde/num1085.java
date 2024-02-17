package com.example.coding.cde;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import javax.lang.model.SourceVersion;

public class num1085 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr =
        Stream
            .of(br.readLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
    int X = arr[0];
    int Y = arr[1];
    int W = arr[2];
    int H = arr[3];
    int leftX = 0;
    int leftY = Y;

    int rightX = W;
    int rightY = Y;

    int topX = X;
    int topY = H;

    int bottomX = X;
    int bottomY = 0;
    double Min = Integer.MAX_VALUE;
    double left = Math.sqrt(Math.pow((leftX - X), 2));
    double right = Math.sqrt(Math.pow((rightX - X), 2));
    double top = Math.sqrt(Math.pow((topY - Y), 2));
    double bottom = Math.sqrt(Math.pow((bottomY - Y), 2));
    for(int i = 0 ; i< 4; i ++) {
      if (Min > left) {
        Min = left;
      } else if(Min > right) {
        Min = right;
      } else if(Min > top) {
        Min = top;
      } else if (Min > bottom) {
        Min = bottom;
      }
    }
    System.out.println((int)Min);
  }
}
