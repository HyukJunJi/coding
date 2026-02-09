package com.example.coding._2024.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class num1931f {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[][] nums = new int[N][2];


    for (int i = 0; i < N; i++) {
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      nums[i][0] = array[0];
      nums[i][1] = array[1];
    }

    Arrays.sort(nums, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        if(o1[1] == o2[1]) {
          return o1[0]-o2[0];
        }
        return o1[1]-o2[1];
      }
    });
    for(int[] n : nums) {
      for(int s : n) {
        System.out.print(s+" ");
      }
      System.out.println();
    }
    int count = 0;
    int prev_end_time = 0;

    for(int i = 0; i < N; i++) {

      // 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
      if(prev_end_time <= nums[i][0]) {
        prev_end_time = nums[i][1];
        count++;
      }
    }

    System.out.println(count);
  }

}
