package com.example.coding._2024.정렬.버블정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num23968 {
  public static int A;
  public static int N;
  public static int cnt = 0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    A = Integer.parseInt(st.nextToken());
    N = Integer.parseInt(st.nextToken());
    int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    bubble_sort(array);
    System.out.println(-1);
  }

  private static void bubble_sort(int []arr) {
    for(int i = 0 ; i < arr.length; i++) {
      for(int j = 1 ; j < arr.length-i; j++) {
        if(arr[j-1]>arr[j]) {
          int tmp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = tmp;
          cnt++;
          if(cnt==N) {
            System.out.println(arr[j-1]+" "+tmp);
            System.exit(0);
          }
        }
      }
    }
  }
}
