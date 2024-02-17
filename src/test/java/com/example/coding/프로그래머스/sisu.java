package com.example.coding.프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class sisu {
  public static void main(String[] args) {
    Solution s = new Solution();
    int []a = {1,2,7,6,4};
    int solution = s.solution(a);
    System.out.println("solution = " + solution);
  }
  public static class Solution {
    public int solution(int[] nums) {

      List<Integer> list = new ArrayList<>();
      int[] sorted = Arrays.stream(nums).sorted().toArray();
      for(int i = 0 ; i<nums.length-2;i++) {
        for(int  j = 1; j <nums.length-1;j++) {
          for(int k = 2; k<nums.length;k++) {
            if(sorted[i]==sorted[j] || sorted[j]==sorted[k] || sorted[i]==sorted[k] || j>k || i>j) {
              continue;
            }
            int i1 = sorted[i] + sorted[j] + sorted[k];
            System.out.println("sorted["+i+"]+sorted["+j+"]+sorted["+k+"] = " + sorted[i]+sorted[j]+sorted[k]);
            System.out.println("i1 = " + i1);
            for(int a = 2 ; a <=i1;a++) {
              if(a==i1) {
                list.add(i1);
              }
              if(i1%a==0){
                break;
              }
            }
          }
        }
      }
      return list.size();
    }
  }
}
