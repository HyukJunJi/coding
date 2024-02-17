package com.example.coding.완전탐색;

import java.util.Arrays;

public class 최소직사각형 {
  public static void main(String[] args) {
    Solution s = new Solution();
    int [][] a = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
    System.out.println(s.solution(a));
  }
  public static class Solution {
    public int solution(int[][] sizes) {
      int tmp;
      for(int i = 0 ; i < sizes.length;i++) {
        if(sizes[i][0]>sizes[i][1]) {
          tmp = sizes[i][0];
          sizes[i][0] = sizes[i][1];
          sizes[i][1] = tmp;
        }
      }
      int max1 = Integer.MIN_VALUE;
      int max = Integer.MIN_VALUE;
      for(int i = 0 ; i<sizes.length;i++) {
        if(sizes[i][0]>max) {
          max = sizes[i][0];
        }
        if(sizes[i][1]>max1){
          max1 = sizes[i][1];
        }
      }

      return max*max1;
    }
  }
}
