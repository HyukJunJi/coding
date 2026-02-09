package com.example.coding._2024.다이나믹프로그래밍;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class num2579 {

  public static int sum = 0;
  public static int N;
  public static int[]stair;
  public static List<Integer> list;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    stair = new int[N];
    list = new ArrayList<>();
    for(int i = 0 ; i < N ; i++) {
      stair[i] = Integer.parseInt(br.readLine());
    }

    System.out.println(sum);
  }

}
