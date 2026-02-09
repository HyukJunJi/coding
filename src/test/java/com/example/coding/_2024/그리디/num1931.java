package com.example.coding._2024.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num1931 {
  public static int start;
  public static int end;
  public static int [][] nums;
  public static int min = Integer.MAX_VALUE;
  public static int cnt= 0 ;
  public static int max  = Integer.MIN_VALUE;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    nums = new int[N][2];


    for(int i = 0 ; i < N ; i++){
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      nums[i][0] = array[0];
      nums[i][1] = array[1];
    }
    for(int[] l : nums) {
      for(int s : l) {
        System.out.print(s+" ");
      }
      System.out.println();
    }


    for(int i = 0 ; i < N ; i++) {
      int a= 0;
      start = nums[i][0];
      end = nums[i][1];
      int idx = Integer.MIN_VALUE;
      cnt++;
      while(a<N) {
        a++;
        for (int j = 0; j < N; j++) {
          if (nums[j][0] >= end && i != j) {
            if (min >= nums[j][0]) {
              min = nums[j][0];
              idx = j;
            }
          }
        }
        System.out.println("min"+min);
        if (idx != Integer.MIN_VALUE) {
//          System.out.println(cnt);
          cnt++;
          start = nums[idx][0];
          end = nums[idx][1];

          continue;
        }
        min = Integer.MAX_VALUE;
      }
      if(max<=cnt) {
        max = cnt;
      }
      cnt=0;
    }
    System.out.println(max);

  }
}
