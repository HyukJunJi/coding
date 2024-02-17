package com.example.coding.해쉬;

import java.util.HashMap;
import java.util.HashSet;

public class 폰켓몬 {
  public static void main(String[] args) {
    Solution s = new Solution();
    int [] a = {3,3,3,2,2,2};
    System.out.println(s.solution(a));
  }
  public static class Solution {
    public int solution(int[] nums) {
      int answer = 0;
      int canget = nums.length/2;
      HashSet<Integer> set = new HashSet<>();

      for(int i = 0 ; i <nums.length; i++) {
        set.add(nums[i]);
      }
      if(set.size()<=canget) {
        answer = set.size();
      } else {
        answer = canget;
      }
      return answer;
    }
  }
}
